# Mutation Testing POC
Simple POC to implement Mutation testing on a Maven project.
- Run ```mvn clean install``` to run the JUnit Tests.
- Run ```mvn org.pitest:pitest-maven:mutationCoverage``` for PITest Mutation coverage

PITest coverage results will be available in ```target/pit-reports```
## Dependencies and Plugins
### JUnit 5
```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.4.0</version>
    <scope>test</scope>
</dependency>
```

### PITest
```xml
<dependency>
    <groupId>org.pitest</groupId>
    <artifactId>pitest-parent</artifactId>
    <version>1.5.2</version>
    <type>pom</type>
</dependency>
```

### PITest Plugin
```xml
<plugin>
    <groupId>org.pitest</groupId>
    <artifactId>pitest-maven</artifactId>
    <version>1.5.2</version>
    <configuration>
        <targetClasses>
            <param>com.cognizant.mutationtestingpoc.*</param>
        </targetClasses>
        <targetTests>
            <param>com.cognizant.mutationtestingpoc.*</param>
        </targetTests>
    </configuration>
    <dependencies>
        <dependency>
            <groupId>org.pitest</groupId>
            <artifactId>pitest-junit5-plugin</artifactId>
            <version>0.12</version>
        </dependency>
    </dependencies>
</plugin>
```
Since PITest does not come with JUnit5 Support out of the box, we have to use the ``` pitest-junit5-plugin:0.12```
to run it alongside Junit5
