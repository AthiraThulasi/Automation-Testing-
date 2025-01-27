# Project Overview

This project is about automating various features of the Best Buy website using Selenium WebDriver and Java. It focuses on ensuring reliable testing for critical functionalities like login, product search, adding items to the cart, and checkout.
## Features

Developed using the Page Object Model (POM) design pattern for scalability and maintainability.
Automates workflows for key Best Buy features:
Login
Product search
Adding items to the cart
Checking out
Integrated with TestNG for test execution and reporting.

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
