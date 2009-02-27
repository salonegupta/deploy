ANT = [ "org.apache.ant:ant:jar:1.7.1" ]

APACHE_COMMONS = {
  :beanutils => "commons-beanutils:commons-beanutils:jar:1.7.0",
  :cli => "commons-cli:commons-cli:jar:1.1",
  :codec => "commons-codec:commons-codec:jar:1.3",
  :collections => "commons-collections:commons-collections:jar:3.2", 
  :daemon => "commons-daemon:commons-daemon:jar:1.0.1", 
  :dbcp => "commons-dbcp:commons-dbcp:jar:1.2.2",
  :digester => "commons-digester:commons-digester:jar:1.7",
  :discovery => "commons-discovery:commons-discovery:jar:0.2",
  :fileupload => "commons-fileupload:commons-fileupload:jar:1.2.1",
  :httpclient => "commons-httpclient:commons-httpclient:jar:3.1",
  :io => "commons-io:commons-io:jar:1.2",
  :lang => "commons-lang:commons-lang:jar:2.3",
  :logging => "commons-logging:commons-logging:jar:1.0.4",
  :pool => "commons-pool:commons-pool:jar:1.4",
  :validator => "commons-validator:commons-validator:jar:1.2.0"
}
APACHE_DERBY = "org.apache.derby:derby:jar:10.2.2.0"
APACHE_DERBY_NET = "org.apache.derby:derbynet:jar:10.2.2.0"
APACHE_DERBY_CLIENT = "org.apache.derby:derbyclient:jar:10.2.2.0"
AXIOM = group("axiom-api", "axiom-dom", "axiom-impl", :under=>"org.apache.ws.commons.axiom", :version=>"1.2.7")

BACKPORT = "backport-util-concurrent:backport-util-concurrent:jar:3.1"

DB_CONNECTOR = {
  :db2 => "com.ibm.db2.jcc:jcc4:jar:9.2",
  :mysql => "com.mysql.mysql-connector:mysql-connector-java:jar:5.1.6",
  :postgresql => "postgresql:postgresql:jar:8.3-603.jdbc3"
}

JETTY = [group("jetty", "jetty-util", :under=>"org.mortbay.jetty", :version=>"6.1.10")]
JUNIT = "junit:junit:jar:4.4"

LOG4J = "log4j:log4j:jar:1.2.15"

NEETHI = "org.apache.neethi:neethi:jar:2.0.4"

SUNACTIVATION = ["javax.activation:activation:jar:1.1.1"]
SUNMAIL = ["javax.mail:mail:jar:1.4.1", SUNACTIVATION]
SERVLET_API = "javax.servlet:servlet-api:jar:2.4" 
SHOAL = [ "net.java.dev.shoal:shoal-jxta:jar:1.0.20071114", "net.java.dev.shoal:shoal-gms:jar:1.0.20071114" ]
SLF4J = group(%w{ slf4j-api slf4j-log4j12 jcl104-over-slf4j }, :under=>"org.slf4j", :version=>"1.4.3")
SPRING = {
  :core => "org.springframework:spring:jar:2.5.5",
  :webmvc_portlet => "org.springframework:spring-webmvc-portlet:jar:2.5.5",
  :webmvc => "org.springframework:spring-webmvc:jar:2.5.5"
}
SPRING_MOCK = [
  "org.springframework:spring-test:jar:2.5.5"
]

STAX_API = [ "stax:stax-api:jar:1.0.1" ]

TAGLIBS = [ "taglibs:standard:jar:1.1.2" ]

WOODSTOX = [ "woodstox:wstx-asl:jar:3.2.4" ]
WS_COMMONS_SCHEMA = "org.apache.ws.commons.schema:XmlSchema:jar:1.3.1"
WSDL4J = [ "wsdl4j:wsdl4j:jar:1.6.1" ]

XERCES = [
  "xerces:xercesImpl:jar:2.9.1",
  "xerces:xmlParserAPIs:jar:2.9.0" ]
XMLBEANS = "org.apache.xmlbeans:xmlbeans:jar:2.4.0"
XMLUNIT = ["xmlunit:xmlunit:jar:1.1"]

AXIS2 = [
  group("axis2-kernel", "axis2-adb", "axis2-xmlbeans", "axis2-json", :under=>"org.apache.axis2", :version=>"1.4"),
  BACKPORT,
  NEETHI,
  SUNMAIL
]
  
TEMPO_REGISTRY = "org.intalio.tempo:tempo-registry:jar:6.0.0.26"
TEMPO_SECURITY_CLIENT = group("tempo-security", "tempo-security-ws-client", :under=>"org.intalio.tempo", :version=>"6.0.0.26")
TEMPO_SECURITY_WS_CLIENT = group("tempo-security", "tempo-security-ws-common", "tempo-security-ws-client", :under=>"org.intalio.tempo", :version=>"6.0.0.26")
TEMPO_WEB_NUTSNBOLTS = "org.intalio.tempo:tempo-web-nutsNbolts:jar:6.0.0.26"
