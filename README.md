# Spring Boot CRUD Operation with MySQL

## Overview

This repository contains code for performing CRUD (Create, Read, Update, Delete) operations using Spring Boot with MySQL database.

### Architecture Diagram

          +-------------------+
          |    Controller     |
          +-------------------+
                   |
                   v
          +-------------------+
          |      Service      |
          +-------------------+
                   |
                   v
          +-------------------+
          |   JpaRepository   |
          +-------------------+
                   |
                   v
          +-------------------+
          |     MySQL DB      |
          +-------------------+


### Explanation

- **Controller**: The Controller layer receives incoming HTTP requests, handles them, and delegates the processing to the Service layer. It is responsible for handling RESTful endpoints and mapping them to appropriate service methods.

- **Service**: The Service layer contains business logic and orchestrates the interactions between the Controller and the JpaRepository. It implements methods to perform CRUD operations and any additional business logic required.

- **JpaRepository**: The JpaRepository interface provided by Spring Data JPA simplifies database operations by providing methods for common CRUD operations. It extends the PagingAndSortingRepository, which in turn extends the CrudRepository.

- **MySQL Database**: The MySQL database stores the application's data. It is accessed through the JpaRepository, which generates SQL queries based on the method signatures defined in the repository interfaces.

## Usage

1. Clone or download the repository.
2. Configure the MySQL database connection in the `application.properties` file.
3. Run the application.
4. Test the CRUD operations using tools like Postman or through a web browser.

## Technologies Used

- Spring Boot
- Spring Data JPA
- MySQL
- Maven
