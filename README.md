# Spring Cloud Microservices
![](https://img.shields.io/badge/Java-8-orange.svg?logo=java)
![](https://img.shields.io/badge/Spring%20Cloud-Greenwich.SR2-green.svg)
![](https://img.shields.io/badge/Maven-4.0.0-CA1E32.svg)


## Project Modules
- [discovery-service](discovery-service) - **Spring Eureka**, provide console represent application status.
  - http://localhost:8888/
- [config-service](config-service) - **Spring Cloud Config**, make you can configure via git repository.
  - http://localhost:9080/middleware-service/prod
- [middleware-service](middleware-service) - **Spring Boot Application**, provided rest api.
  - http://localhost:8080/
- [auth-service](auth-service) - **Spring Boot Application**, provided rest api.
  - http://localhost:8081/
- [gateway-service](gateway-service) - **Netflix Zuul**, filter & router for hide services.
  - http://localhost:9999/

## Spring Cloud Actuator

Use for monitor & interact via REST endpoint. 

For more information please read more. https://www.javatpoint.com/spring-boot-actuator

To enable actuator to refresh config from repository.

pom.xml
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```


Expose actuator by add following properties

bootstrap.properties
```properties
management.endpoints.web.exposure.include=*
```



## Spring Cloud Config

This project use spring cloud config on repository https://github.com/lordgift/test-config.git

If you need to update immediately, please use actuator endpoint.

POST http://localhost:8080/actuator/refresh
