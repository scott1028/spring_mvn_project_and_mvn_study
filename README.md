#### src/main/java
    Application/Library sources

#### src/main/resources
    Application/Library resources

#### src/main/filters
    Resource filter files

#### src/main/config
    Configuration files

#### src/main/scripts
    Application/Library scripts

#### ## src/main/webapp
    Web application sources
    這邊是你最後包裝成 .war/.jar 檔的時候 java class file 放的位置, Web Service Application 為不可存取的路徑

#### src/test/java
    Test sources

#### src/test/resources
    Test resources

#### src/test/filters
    Test resource filter files
#### src/it
    Integration Tests (primarily for plugins)
    
#### src/assembly
    Assembly descriptors

#### src/site
    Site

#### LICENSE.txt
    Project's license

#### NOTICE.txt
    Notices and attributions required by libraries that the project depends on

#### README.txt
    Project's readme

## Run Project
    mvn clean install -Dmaven.test.skip=true
    mvn tomcat7:run

## Check System Path
    .m2/repository/{your application package/*}
