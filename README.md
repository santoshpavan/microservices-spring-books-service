# Spring Boot Books Microservice

[![CircleCI](https://circleci.com/gh/santoshpavan/microservices-spring-books-service.svg?style=svg)](https://circleci.com/gh/santoshpavan/microservices-spring-books-service)

The client implementation for the same can be found [here](https://github.com/santoshpavan/microservices-spring-books-client).

The libraries and technologies used here are-

* Spring Boot Framework.
* Maven.
* Used RestTemplate for the RestFul requests.
* Lombok annotations to simplify the code.
* JPA repositories for the data management.
* Builder Pattern for the microservice implementation.
* Added Bean Validations and wsed a global exception handler for controllers using ControllerAdvice.
* Used MapStruct for mapping the persistence layer (Book) with the DTO (BookDTO).
* Used Jackson library to create JSON objects.
