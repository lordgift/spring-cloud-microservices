plugins {
    id("org.springframework.boot") version "2.1.9.RELEASE"
    id("io.spring.dependency-management") version "1.0.8.RELEASE"
    java
}

tasks{
    "bootJar" { enabled = false }
}

allprojects {

    apply(plugin = "java")

    repositories {
        mavenCentral()
    }

    group = "th.in.lordgift"
    version = "1.0-SNAPSHOT"

    java.sourceCompatibility = JavaVersion.VERSION_1_8
    java.targetCompatibility = JavaVersion.VERSION_1_8
}

subprojects {

    apply(plugin = "io.spring.dependency-management")

    extra["springCloudVersion"] = "Greenwich.SR3"

    dependencies {
//    Spring boot actuator to expose metrics endpoint
        implementation ("org.springframework.boot:spring-boot-starter-actuator") {
            exclude("org.springframework.boot", "spring-boot-starter-logging")
        }
//    Micrometer Prometheus registry
        implementation("io.micrometer:micrometer-registry-prometheus")
    }

    dependencyManagement {
        imports {
            mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
        }
    }
}