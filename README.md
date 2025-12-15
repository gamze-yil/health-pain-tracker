# Health Pain Tracker – REST API

## Overview
Health Pain Tracker is a data driven RESTful backend application developed using
Spring Boot and MySQL. The application allows users to create, retrieve, update,
and delete pain-related records, including pain level, body location, description,
and entry date.

This project was developed for the course **M604 – Advanced Programming** at
Gisma University of Applied Sciences.


## Features
- RESTful API with full CRUD functionality
- Layered architecture (Controller, Service, Repository)
- MySQL database integration using Spring Data JPA
- Swagger UI for API interaction and visualization
- Custom exception handling for invalid requests


## Technology Stack
- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Swagger / OpenAPI
- Maven


## API Endpoints

| Method | Endpoint | Description |
|------|--------|------------|
| POST | `/api/pain-entries` | Create a new pain entry |
| GET | `/api/pain-entries` | Retrieve all pain entries |
| GET | `/api/pain-entries/{id}` | Retrieve a pain entry by ID |
| PUT | `/api/pain-entries/{id}` | Update an existing pain entry |
| DELETE | `/api/pain-entries/{id}` | Delete a pain entry |

All requests and responses use JSON format.



## Running the Application

1. Configure the database connection in `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/health_pain_tracker
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

2. Run the application using Maven:
mvn spring-boot:run

3. Open Swagger UI in your browser:
http://localhost:8080/swagger-ui.html

