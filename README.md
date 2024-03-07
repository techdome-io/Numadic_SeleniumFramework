A sample framework based on Page Object Model, Selenium, TestNG using Java.

This framework is based in Page Object Model (POM).

The framework uses:
1. Java
2. Selenium
3. TestNG
4. ExtentReport

## Prerequisites

Make sure you have the following installed:

- Java Development Kit (JDK)
- Maven
- WebDriver (e.g., ChromeDriver, GeckoDriver)

## Project Structure

selenium-java-testng-extent-report
│
├── src
│   └── test
│       └── java
│           └── your.package.name
│               ├── tests
│               │   └── pageObjects
│               │   └── testBase
│               │   └── testCases
|               |   └── utilities
│               └── resources
│                   └── config file
│
├── pom.xml
├── task.xml
└── README.md

# Getting Started
1. Clone the repository:
2. Run the tests using Maven: mvn clean test
3. Run task.xml file
   ![image](https://github.com/techdome-io/Numadic_SeleniumFramework/assets/147978827/3fd6da90-9baf-4ea1-b1b1-6da264c51121)
4. Extent Reports are automatically generated under Reports folder
   ![image](https://github.com/techdome-io/Numadic_SeleniumFramework/assets/147978827/8f3405ae-edc1-44dc-b0af-702f5c27dba4)
