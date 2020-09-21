# Testing workshop

This repo contains material which accompanies the testing workshop.

## Table of contents

- [Building the project](#building-the-project)
- [Run tests and checks](#run-tests-and-checks)
- [Installing java](#installing-java)
  - [Ubuntu](#installing-java-on-ubuntu)
  - [Windows](#installing-java-on-windows)
  - [Mac](#installing-java-on-mac)
- [Spock](#spock)

## Building the project

To build the project run the `gradle` wrapper from the root directory

```bash
# build project
#
cd [path_to_project_directory]
./gradlew build
```

## Run tests and checks

To execute the unit tests, execute the following gradle command

```
# run unit tests
$ ./gradlew test
```

To execute a single unit test, execute the following gradle command
   
```
# run a single unit test
$ ./gradlew test --tests [test_class]
```

example:

```
$ ./gradlew test --tests com.nvoulgaris.testingworkshop.examples.ReplaceMe
```

## Installing java

The project requires java 8 (or any later version).

### Installing java on Ubuntu

Please follow the instructions found [here](https://linuxize.com/post/install-java-on-ubuntu-18-04/)

### Installing java on Windows

Please follow the instructions found [here](https://www.java.com/en/download/help/windows_manual_download.xml)

### Installing java on Mac

Please follow the instructions found [here](https://java.tutorials24x7.com/blog/how-to-install-java-8-on-mac)

## Spock

Spock is a groovy testing framework that is being used in this project.
The two main aspects that are used are [interaction based testing](http://spockframework.org/spock/docs/1.3/interaction_based_testing.html) and [data driven testing](http://spockframework.org/spock/docs/1.3/data_driven_testing.html). Especially the following sub sections:

 * [Creating mock objects](http://spockframework.org/spock/docs/1.3/interaction_based_testing.html#_creating_mock_objects)
 * [mocking](http://spockframework.org/spock/docs/1.3/interaction_based_testing.html#_mocking)
 * [stubbing](http://spockframework.org/spock/docs/1.3/interaction_based_testing.html#_stubbing)
 * [data tables](http://spockframework.org/spock/docs/1.3/data_driven_testing.html#data-tables)
