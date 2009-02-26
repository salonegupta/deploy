gem "buildr"

require "rubygems"
require "buildr"
require "buildr/xmlbeans"
require "buildr/cobertura"

# Keep this structure to allow the build system to update version numbers.
VERSION_NUMBER = "6.0.0.33"

require "rsc/build/dependencies.rb"
require "rsc/build/repositories.rb"
# leave this require after dependencies.rb so the same jpa version is used throughout the whole build
require "rsc/buildr-tasks/openjpa"
require "rsc/buildr-tasks/generate_sql"

desc "Deployment Service"
define "deploy" do
  project.version = VERSION_NUMBER
  project.group = "org.intalio.deployment"
  
  compile.options.target = "1.5"

  desc "Deployment API"
  define "deploy-api" do
    compile.with TEMPO_REGISTRY, SLF4J
    package :jar
  end

  desc "Deployment Service Implementation"
  define "deploy-impl" do
    compile.with projects("deploy-api"), TEMPO_WEB_NUTSNBOLTS, SERVLET_API, SHOAL, SLF4J, SPRING[:core]
    test.with AXIS2, APACHE_COMMONS[:dbcp], APACHE_COMMONS[:pool], LOG4J, XERCES, APACHE_DERBY, APACHE_DERBY_NET, APACHE_DERBY_CLIENT
    test.exclude '*TestUtils*'
    package :jar
  end

  desc "Deployment Web-Service Common Library"
  define "deploy-ws-common" do
    compile.with projects("deploy-api", "deploy-impl"), TEMPO_REGISTRY, AXIOM, AXIS2, SUNMAIL, SLF4J, SPRING[:core], STAX_API 
    package :jar
  end
  
  desc "Deployment Web-Service Client"
  define "deploy-ws-client" do
    compile.with projects("deploy-api", "deploy-ws-common"), 
                 AXIOM, AXIS2, SLF4J, STAX_API, SPRING[:core]
    test.with project("deploy-impl"), project("deploy-impl").test.compile.target, APACHE_COMMONS[:httpclient], APACHE_COMMONS[:codec], LOG4J, SUNMAIL, XERCES, WS_COMMONS_SCHEMA, WSDL4J, WOODSTOX 

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
    package(:aar).with :libs => [ projects("deploy-api", "deploy-impl", "deploy-ws-common"), TEMPO_REGISTRY, SLF4J, SPRING[:core] ]
  end
end
