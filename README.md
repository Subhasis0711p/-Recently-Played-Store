# Recently Played Store

## Overview
This project implements an in-memory store for recently played songs per user. The store can hold a fixed number of recently played songs and eliminates the least recently played songs when the capacity is exceeded.

## Requirements
- Java 8+
- JUnit 5 for testing

## Installation
1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/recently-played-store.git
    cd recently-played-store
    ```

2. Ensure you have Java and JUnit 5 installed. If not, you can download and install them from:
    - [Java SE Development Kit](https://www.oracle.com/java/technologies/javase-downloads.html)
    - [JUnit 5](https://junit.org/junit5/)

## Usage

### Compile the Code
1. Open a terminal and navigate to the project directory.
2. Compile the Java files:
    ```bash
    javac RecentlyPlayedStore.java
    ```

### Run the Code
1. Run the `RecentlyPlayedStore` class to see the example output:
    ```bash
    java RecentlyPlayedStore
    ```

### Running Tests
1. Ensure you have JUnit 5 setup in your project. If you're using Maven, you can add the following dependency in your `pom.xml` file:
    ```xml
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.7.0</version>
        <scope>test</scope>
    </dependency>
    ```
2. Compile the test files:
    ```bash
    javac -cp .:junit-jupiter-api-5.7.0.jar RecentlyPlayedStoreTest.java
    ```
3. Run the tests:
    ```bash
    java -jar junit-platform-console-standalone-1.7.0.jar -cp . --scan-class-path
    ```

Alternatively, you can run the tests using your IDE. Most modern Java IDEs like IntelliJ IDEA, Eclipse, and NetBeans have built-in support for JUnit.
