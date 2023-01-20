# ISBN Validation

This project contains a solution for validating International Standard Book Numbers (ISBNs) using Java. The solution can validate both ISBN-10 and ISBN-13 numbers and can also convert a valid ISBN-10 to ISBN-13.


# Getting Started

These instructions will guide you on how to use the solution in your project.


# Prerequisites
Java 8 or later


# Installing
Clone or download the project to your local machine.
Import the project into your IDE.
Build the project with your preferred build tool (e.g. Maven or Gradle) or by adding the JUnit .jar file to your classpath.


# Usage
The solution is implemented in the ISBN class. You can use the isbn13() method to validate or convert ISBNs.

ISBN.isbn13("9780316066525"); // returns "Valid"
ISBN.isbn13("0316066524"); // returns "9780316066525"


# Running the tests
To run the tests, use your preferred method to run JUnit tests.

Using an IDE: Most modern IDEs (Integrated Development Environments) like Eclipse, IntelliJ IDEA, and NetBeans have built-in support for JUnit and provide a way to run the test suite directly from the IDE. You can usually find the option to run tests in the "Run" or "Debug" menu.
Using the command line: You can run the test suite from the command line using the java command. You will need to have JUnit and the Hamcrest library on your classpath.
Using a build tool like Maven or Gradle: If your project uses a build tool like Maven or Gradle, you can configure the build script to run the test suite as part of the build process. This is a good option if you want to automate running the tests as part of a continuous integration pipeline.

1. If you are using Maven, you can add the following dependency to your pom.xml file:
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.12</version>
    <scope>test</scope>
</dependency>

 the run *mvn test* command to run the test suite

2. If you are using Gradle, you can add the following dependency to your *build.gradle* file:
dependencies {
    testImplementation 'junit:junit:4.12'
}

and run *gradle test* command to run the test suite.

On the other hand, if you don't want to use a build tool, you can add JUnit .jar file to your classpath. You will need to download the JUnit .jar file from the JUnit website, and add it to your classpath. The steps to add it to the classpath depends on the operating system you're using and whether you're using an IDE or the command line.

If you are using an IDE like Eclipse, IntelliJ IDEA, or NetBeans, you can add the JUnit .jar file to your project's classpath by following the instructions for your specific IDE.
If you are running your program from the command line, you can add the JUnit .jar file to your classpath by using the *-cp* or *-classpath* option when running the Java command. The syntax will look something like this:
*java -cp path/to/junit.jar:path/to/your-project-classpath Main*

Please keep in mind that adding the JUnit .jar file to your classpath will make your project dependent on the JUnit library, so you'll need to make sure the JUnit .jar file is available in the classpath whenever you run your tests.


# Built With
Java - Programming language used
JUnit - Testing framework

# Authors
Karabo Masalesa - *https://github.com/Kaaribu/codechallenge*
