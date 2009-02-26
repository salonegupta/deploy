gem "buildr"

require "rubygems"
require "buildr"
require "buildr/xmlbeans"
require "buildr/cobertura"

# Keep this structure to allow the build system to update version numbers.
VERSION_NUMBER = "6.0.0.33-DEPLOY-CLUSTER"

require "rsc/build/dependencies.rb"
require "rsc/build/repositories.rb"
# leave this require after dependencies.rb so the same jpa version is used throughout the whole build
require "rsc/buildr-tasks/openjpa"
require "rsc/buildr-tasks/generate_sql"

desc "Deployment Service"
define "deployment" do
  project.version = VERSION_NUMBER
  project.group = "org.intalio.deployment"
  
  compile.options.target = "1.5"

  desc "Deployment API"
  define "deploy-api" do
    compile.with project("registry"), SLF4J
    package :jar
  end

  desc "Deployment Service Implementation"
  define "deploy-impl" do
    compile.with projects("deploy-api", "web-nutsNbolts"), SERVLET_API, SHOAL, SLF4J, SPRING[:core]
    test.with AXIS2, APACHE_COMMONS[:dbcp], APACHE_COMMONS[:pool], LOG4J, XERCES, APACHE_DERBY, APACHE_DERBY_NET, APACHE_DERBY_CLIENT
    test.exclude '*TestUtils*'
    package :jar
  end

  desc "Deployment Web-Service Common Library"
  define "deploy-ws-common" do
    compile.with projects("deploy-api", "deploy-impl", "registry"), AXIOM, AXIS2, SUNMAIL, SLF4J, SPRING[:core], STAX_API 
    package :jar
  end
  
  desc "Deployment Web-Service Client"
  define "deploy-ws-client" do
    compile.with projects("deploy-api", "deploy-ws-common"), 
                 AXIOM, AXIS2, SLF4J, STAX_API, SPRING[:core]
    test.with project("deploy-impl"), APACHE_COMMONS[:httpclient], APACHE_COMMONS[:codec], LOG4J, SUNMAIL, XERCES, WS_COMMONS_SCHEMA, WSDL4J, WOODSTOX 

    # Remember to set JAVA_OPTIONS before starting Jetty
    # export JAVA_OPTIONS=-Dorg.intalio.tempo.configDirectory=/home/boisvert/svn/tempo/security-ws2/src/test/resources
    
    # require live Axis2 instance
    if ENV["LIVE"] == 'yes'
      LIVE_ENDPOINT = "http://localhost:8080/axis2/services/DeploymentService"
    end
    
    if defined? LIVE_ENDPOINT
      test.using :properties => 
        { "org.intalio.tempo.deploy.ws.endpoint" => LIVE_ENDPOINT,
          "org.intalio.tempo.configDirectory" => _("src/test/resources") }
    end

    package(:jar).tap do |jar|
      jar.with :meta_inf => project("deploy-ws-service").path_to("src/main/axis2/*.wsdl")
    end
  end

  desc "Deployment Web-Service"
  define "deploy-ws-service" do
    package(:aar).with :libs => [ projects("deploy-api", "deploy-impl", "deploy-ws-common", "registry"), SLF4J, SPRING[:core] ]
  end

  define "registry" do
    compile.with SLF4J
        package :jar
  end

  desc "Security Framework"
  define "security" do
    compile.with CAS_CLIENT, DOM4J, CASTOR, LOG4J, SLF4J, SPRING[:core], XERCES

    test.exclude "*BaseSuite"
    test.exclude "*FuncTestSuite"
    test.exclude "*LDAPAuthenticationTest*"
    test.exclude "*LDAPRBACProviderTest*"
    test.with JAXEN, XMLUNIT, INSTINCT

    package :jar
  end

  desc "Security Web-Service Common Library"
  define "security-ws-common" do
    compile.with project("security"), AXIOM, AXIS2, SLF4J, SPRING[:core], STAX_API
    package :jar
  end

  desc "Security Web-Service Client"
  define "security-ws-client" do
    compile.with projects("security", "security-ws-common"),AXIOM, AXIS2, SLF4J, STAX_API, SPRING[:core]
    test.with APACHE_COMMONS[:httpclient], APACHE_COMMONS[:codec], CASTOR, LOG4J, SUNMAIL, XERCES, WS_COMMONS_SCHEMA, WSDL4J, WOODSTOX, CAS_CLIENT, INSTINCT

    # Remember to set JAVA_OPTIONS before starting Jetty
    # export JAVA_OPTIONS=-Dorg.intalio.tempo.configDirectory=/home/boisvert/svn/tempo/security-ws2/src/test/resources

    # require live Axis2 instance
    if ENV["LIVE"] == 'yes'
      LIVE_ENDPOINT = "http://localhost:8080/axis2/services/TokenService"
    end

    if defined? LIVE_ENDPOINT
      test.using :properties =>
        { "org.intalio.tempo.security.ws.endpoint" => LIVE_ENDPOINT,
          "org.intalio.tempo.configDirectory" => _("src/test/resources") }
    end

    package(:jar).tap do |jar|
      jar.with :meta_inf => project("security-ws-service").path_to("src/main/axis2/*.wsdl")
    end
  end

  desc "Security Web-Service"
  define "security-ws-service" do
    compile.with projects("security", "security-ws-common"), AXIOM, AXIS2, SLF4J, SPRING[:core], STAX_API
    package(:aar).with :libs => [ projects("security", "security-ws-common"), CASTOR, SLF4J, SPRING[:core], CAS_CLIENT ]
  end

  desc "Task Attachment Service"
  define "tas-service" do
    compile.with projects("security", "security-ws-client"),
                 APACHE_COMMONS[:httpclient], AXIOM, AXIS2, JAXEN, SLF4J, STAX_API, WEBDAV

    test.with projects("security-ws-common", "security-ws-client"), APACHE_COMMONS[:codec], LOG4J, SUNMAIL, WSDL4J, WS_COMMONS_SCHEMA, WOODSTOX, INSTINCT
    test.exclude '*TestUtils*'

    # require live Axis2 instance
    unless ENV["LIVE"] == 'yes'
      test.exclude '*Axis2TASService*'
      test.exclude '*WDSStorageTest*'
      test.exclude '*SlingStorage*'
    end

    package :jar
    package(:aar).with(:libs => [
        projects("security", "security-ws-client", "security-ws-common", "web-nutsNbolts"), APACHE_COMMONS[:httpclient], APACHE_COMMONS[:codec], JAXEN, SLF4J, SPRING[:core], WEBDAV])
  end

  desc "Common spring and web related classes"
  define "web-nutsNbolts" do
    libs = project("security"), AXIS2, APACHE_COMMONS[:lang], INTALIO_STATS, JSON_NAGGIT, JSP_API, LOG4J, SERVLET_API, SLF4J, SPRING[:core], SPRING[:webmvc]
    test_libs = libs + [JUNIT, INSTINCT, SPRING_MOCK, AXIOM, project("security-ws-client"), STAX_API, WSDL4J, WS_COMMONS_SCHEMA]
    compile.with test_libs
    package :jar
  end
end
