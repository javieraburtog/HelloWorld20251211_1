# HelloWorldMaven

## Overview
This project demonstrates a simple Java program using Maven. The `Hello` class prints messages to the console and serves as an example of Maven project structure and basic Java syntax.

## Structure
- `src/main/java/package1/Hello.java`: Main class that prints messages.
- `src/test/java/package1/HelloTest.java`: Unit test for the Hello class using JUnit 5.
- `pom.xml`: Maven configuration file with JUnit dependency.

## How to Build and Run
1. **Build the project:**
   ```
   mvn compile
   ```
2. **Run the program:**
   ```
   mvn exec:java -Dexec.mainClass="package1.Hello"
   ```
   (You may need to add the exec-maven-plugin to your pom.xml for this command.)

## How to Test
Run all unit tests with:
```
mvn test
```

## Documentation
Javadoc comments are included in the source files. To generate HTML documentation, run:
```
mvn javadoc:javadoc
```
The documentation will be available in `target/site/apidocs`.
