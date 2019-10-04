plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    java
}

dependencies {
    implementation ("org.springframework.cloud:spring-cloud-config-server")
    implementation ("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")

//    testImplementation "org.springframework.boot:spring-boot-starter-test"
}
