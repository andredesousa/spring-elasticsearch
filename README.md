# Spring CRUD application with ElasticSearch

[ElasticSearch](https://www.elastic.co/elasticsearch/) is a distributed, RESTful search and analytics engine capable of addressing a growing number of use cases.
[Spring Data ElasticSearch](https://docs.spring.io/spring-data/elasticsearch/docs/current/reference/html/) provides integration with the Elasticsearch search engine.

## Overview

*CRUD* is an acronym that comes from the world of computer programming and refers to the four functions that are considered necessary to implement a persistent storage application: *create*, *read*, *update* and *delete*.
This project shows how to use **Spring Data** to expose these functions to **ElasticSearch**.

The **Spring Data** for **ElasticSearch** project applies core Spring concepts to the development of solutions by using the **ElasticSearch** search engine.
Key functional areas of Spring Data Elasticsearch are a POJO centric model for interacting with a Elastichsearch Documents and easily writing a Repository style data access layer.

In local development, you need to provide a connection to a ElasticSearch instance.

You can use the following docker command:

```bash
docker run -d -p 9200:9200 -e "discovery.type=single-node" elasticsearch:7.14.2
```

This project template uses **JUnit 5** and **Mockito** to test a **Spring REST API** using **ElasticSearch**.
With the `@SpringBootTest` annotation, Spring Boot provides a convenient way to start up an application context to be used in a test.

## Project structure

This project was generated with [Spring Initializr](https://start.spring.io/).
All of the app's code goes in a folder named `src/main`.
The **unit tests** and **integration tests** are in the `src/test` and `src/integrationTest` folders.
Static files are placed in `src/main/resources` folder.

## Available gradle tasks

The tasks in [build.gradle](build.gradle) file were built with simplicity in mind to automate as much repetitive tasks as possible and help developers focus on what really matters.

The next tasks should be executed in a console inside the root directory:

- `./gradlew tasks` - Displays the tasks runnable from root project 'app'.
- `./gradlew bootRun` - Runs this project as a Spring Boot application.
- `./gradlew check` - Runs all checks.
- `./gradlew test` - Runs the unit tests.
- `./gradlew integrationTest` - Run the integration tests.
- `./gradlew clean` - Deletes the build directory.
- `./gradlew build` - Assembles and tests this project.
- `./gradlew help` - Displays a help message.

For more details, read the [Command-Line Interface](https://docs.gradle.org/current/userguide/command_line_interface.html) documentation in the [Gradle User Manual](https://docs.gradle.org/current/userguide/userguide.html).

## Running unit tests

Unit tests are responsible for testing of individual methods or classes by supplying input and making sure the output is as expected.

Use `./gradlew test` to execute the unit tests via [JUnit 5](https://junit.org/junit5/), [Mockito](https://site.mockito.org/) and [AssertJ](https://assertj.github.io/doc/).
Use `./gradlew test -t` to keep executing unit tests in real time while watching for file changes in the background.
You can see the HTML report opening the [index.html](build/reports/tests/test/index.html) file in your web browser.

It's a common requirement to run subsets of a test suite, such as when you're fixing a bug or developing a new test case.
Gradle provides different mechanisms.
For example, the following command lines run either all or exactly one of the tests in the `SomeTestClass` test case:

```bash
./gradlew test --tests SomeTestClass
```

For more details, you can see the [Test filtering](https://docs.gradle.org/current/userguide/java_testing.html#test_filtering) section of the Gradle documentation.

This project uses [JaCoCo](https://www.eclemma.org/jacoco/) which provides code coverage metrics for Java.
The minimum code coverage is set to 80%.
You can see the HTML coverage report opening the [index.html](build/reports/jacoco/test/html/index.html) file in your web browser.

## Running integration tests

Integration tests determine if independently developed units of software work correctly when they are connected to each other.

Use `./gradlew integrationTest` to execute the integration tests via [JUnit 5](https://junit.org/junit5/), [Mockito](https://site.mockito.org/) and [AssertJ](https://assertj.github.io/doc/).
Use `./gradlew integrationTest -t` to keep executing your tests while watching for file changes in the background.
You can see the HTML report opening the [index.html](build/reports/tests/integrationTest/index.html) file in your web browser.

Like unit tests, you can also run subsets of a test suite.
See the [Test filtering](https://docs.gradle.org/current/userguide/java_testing.html#test_filtering) section of the Gradle documentation.

## Debugging

You can debug the source code, add breakpoints, inspect variables and view the application's call stack.
Also, you can use the IDE for debugging the source code, unit and integration tests.
You can customize the [log verbosity](https://docs.gradle.org/current/userguide/logging.html#logging) of gradle tasks using the `-i` or `--info` flag.

This project includes [Swagger](https://swagger.io/). To get a visual representation of the interface and send requests for testing purposes go to <http://localhost:8080/swagger-ui.html>.

## Reference Documentation

For further reference, please consider the following articles:

- [Official Gradle documentation](https://docs.gradle.org)
- [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.5/gradle-plugin/reference/html/)
- [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
- [Spring Data Elasticsearch](https://docs.spring.io/spring-data/elasticsearch/docs/current/reference/html/)
- [Introduction to Spring Data Elasticsearch](https://www.baeldung.com/spring-data-elasticsearch-tutorial)
- [Elasticsearch Queries with Spring Data](https://www.baeldung.com/spring-data-elasticsearch-queries)
- [Testing with Spring Boot and @SpringBootTest](https://reflectoring.io/spring-boot-test/)
- [Mockito Tutorial](https://www.baeldung.com/mockito-series)
