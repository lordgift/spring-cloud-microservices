# Spring Cloud Microservices
![](https://img.shields.io/badge/Java-8-orange.svg?logo=java)
![](https://img.shields.io/badge/Spring%20Cloud-Finchley.SR1-green.svg)
![](https://img.shields.io/badge/Maven-4.0.0-CA1E32.svg)


## Modules
- [discovery-service](discovery-service) - **Spring Eureka**, provide console represent application status.
  - http://localhost:8888/
- [config-service](config-service) - **Spring Cloud Config**, make you can configure via git repository.
  - http://localhost:9080/middleware-service/prod
- [middleware-service](middleware-service) - **Spring Boot Application**, provided rest api.
  - http://localhost:8080/



### Config Service

Enable actuator to refresh config from repository.

pom.xml
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```

application.properties
```properties
management.endpoints.web.exposure.include=*
```
POST http://localhost:8080/actuator/refresh

Config repository : https://github.com/lordgift/test-config.git

