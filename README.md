# Project Name

## Overview

This project serves as a Task Management.

## Getting Started

To run the program, Docker Compose is utilized:

`docker compose up -d`
## Accessing the Application
Once the application is up and running, access the following endpoints:

* H2 Database: `http://localhost:8080/h2-console`
* Swagger UI: `http://localhost:8080/swagger-ui.html`
## Authorization
To access the application, authentication is required. You can utilize either of the following sets of credentials:

User Account:

* Username: user
* Password: password
Admin Account:

* Username: admin
* Password: password
To authenticate, initiate a POST request to `http://localhost:8080/authenticate` with the corresponding username and password to get `JWT token`.

Dependencies
Docker
Docker Compose
Contributing
Pull requests are welcomed. For significant changes, please initiate a discussion by opening an issue.
