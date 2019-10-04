plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    java
}

dependencies {
    implementation ("org.springframework.boot:spring-boot-starter-web")
    implementation ("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")

//    testImplementation 'org.springframework.boot:spring-boot-starter-test'
}
