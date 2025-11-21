plugins {
    java
}

allprojects {
    repositories {
        mavenCentral()
    }
}

dependencies {
    implementation(project(":utils"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.14.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.14.1")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.10.2")
}

repositories {
    mavenCentral()
}

tasks.register("rebuild") {
    dependsOn("clean", "build")
}

tasks.test {
    useJUnitPlatform()

    testLogging {
        events("passed", "skipped", "failed")
        showStandardStreams = true
    }
}