
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Ayush Dixit                |
| Date         | 05/04/2023                 |
| Course       | Spring                     |
| Assignment # | Final Project              |

# Implementation Description 
This is a Restaurant Ordering System which uses builder, observer and singleton design patterns.



- Flexibility in implementation:

- The implementation provided utilizes Builder and Observer design patterns, 
ensuring flexibility and maintainability. The Builder pattern separates the construction 
of meals, allowing the easy addition of new meal types. The Observer pattern connects the 
Customer and Chef classes, enabling the straightforward addition or removal of observers without modifying the Customer. The Singleton pattern in the Menu class simplifies menu management by centralizing changes to menu items. Overall, this design allows for easier modification and extension of object types in the future.


- Simplicity and understandability of your implementation:

- Design patterns: The Builder and Observer design patterns improve the code's organization, making it easier to understand the program's structure and flow. The Builder pattern separates the meal creation process from its representation, while the Observer pattern promotes loose coupling between the Customer and Chef classes.

Class structure: Each class has a specific responsibility, adhering to the Single Responsibility Principle (SRP). The classes are relatively small and focused, making it easier to understand their purpose and functionality.

Naming conventions: The code uses clear and descriptive names for classes, methods, and variables, making it easier to understand their roles and relationships within the program. This helps others read and maintain the code.

Code comments: Comments are used throughout the code to explain the purpose and functionality of specific sections, making it more accessible to others.

Modularity: The code is organized into separate classes and methods, each with a specific task. This modularity improves readability and maintainability, as it's easy to locate and modify specific parts of the code.


- Avoiding duplicated code:

- In the implementation, duplicated code is avoided through the use of design patterns, abstraction, and a centralized menu management system. The Builder pattern helps create Meal objects with a consistent process, avoiding the need for repetitive code in different parts of the application. The Observer pattern enables loose coupling between classes, reducing the likelihood of code duplication. The Singleton pattern ensures a single instance of the Menu class, centralizing menu management and minimizing repeated code.

- Avoiding duplicated code is important because it enhances maintainability, reduces the risk of bugs, and simplifies code updates. Duplicate code can lead to inconsistencies and make it harder to implement changes or fix issues, as the same code may need to be updated in multiple places. By minimizing duplicated code, the implementation becomes more efficient and easier to maintain.



# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system. 

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line: 

```bash
mvn clean compile
```



## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




