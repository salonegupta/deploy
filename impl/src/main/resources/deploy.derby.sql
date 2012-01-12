CREATE TABLE DEPLOY_ASSEMBLIES (
  ASSEMBLY VARCHAR(50) not null,
  VERSION INTEGER not null,
  DIR VARCHAR(50),
  CACTIVE SMALLINT,
  primary key (ASSEMBLY, VERSION)
);

CREATE TABLE DEPLOY_COMPONENTS (
  ASSEMBLY VARCHAR(50) not null,
  VERSION INTEGER not null,
  COMPONENT VARCHAR(50) not null,
  MANAGER VARCHAR(50),
  DIR VARCHAR(50),
  primary key (ASSEMBLY, VERSION, COMPONENT)
);

CREATE TABLE DEPLOY_RESOURCES (
  ASSEMBLY VARCHAR(50) not null,
  VERSION INTEGER not null,
  COMPONENT VARCHAR(50) not null,
  MANAGER VARCHAR(50) not null,
  RESOURCE_ID VARCHAR(250) not null,
  primary key (ASSEMBLY, VERSION, COMPONENT, RESOURCE_ID)
);
