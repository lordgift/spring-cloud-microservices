plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    java
}

dependencies {
    implementation ("org.springframework.cloud:spring-cloud-starter-netflix-eureka-server")
}