# Project Overview

This repository contains an automation testing framework developed using Selenium WebDriver and Java. 
The framework is designed for testing web applications and includes scripts for functional, regression, and end-to-end testing.

## Features
Built with the Page Object Model (POM) design pattern for scalability and maintainability.
Supports cross-browser testing (e.g., Chrome, Firefox).
Integrated with testing frameworks like TestNG for managing test execution.
Utilizes explicit waits for handling dynamic web elements.
Generates detailed test execution reports.

## Tech Stack
Programming Language: Java

Automation Tool: Selenium WebDriver

Build Tool: Maven

Test Framework: TestNG

Reporting Tool: Extent Reports/Allure Reports

CI/CD Integration: Jenkins 


## AutomationFramework

├── src/main/java

│   ├── org/

│       ├── Athira/

│           ├── app/

│               ├── main/                               # Main application logic

│               ├── Pages/                             # Page Object Model classes

│                   ├── LoginPage.java                # Login page class

│               ├── utils/                           # Utility classes (e.g., Config folder)

│                   ├── Config/                     # Configuration management

│               ├── resources/                     # Config properties (e.g., config.properties)

├── src/test/java
│   
├── TestLogin/                       # Test classes

│       ├── TestLogin.java               # Login test script

├── pom.xml                              # Maven configuration file

├── README.md                            # Project documentation
