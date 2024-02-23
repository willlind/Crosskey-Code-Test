# Crosskey-Code-Test

# Mortgage Calculator

## Description
This Java application calculates the fixed monthly payment for a mortgage based on the total loan amount, interest rate, and loan term provided by the user. 

## Requirements
- Java Development Kit (JDK) installed
- Git installed (optional)
- [Gradle](https://gradle.org/) or [Maven](https://maven.apache.org/) build tool installed (optional)
- Docker (optional)

## How to Run
1. Clone this repository to your local machine:
    ```
    git clone https://github.com/your-username/mortgage-calculator.git
    ```
2. Navigate to the project directory:
    ```
    cd mortgage-calculator
    ```
3. Compile the Java application:
    ```
    # Using Gradle (if Gradle is installed)
    gradle build

    # Using Maven (if Maven is installed)
    mvn package
    ```
4. Run the application:
    ```
    # Using Gradle
    gradle run

    # Using Maven
    mvn exec:java -Dexec.mainClass="com.example.Main"
    ```
5. Follow the prompts to enter customer details and calculate the monthly payments.

## Running Unit Tests
To run the unit tests, execute the following command:

Using Gradle
gradle test

Using Maven
mvn test
