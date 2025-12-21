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
    testImplementation("org.junit.jupiter:junit-jupiter:5.14.1")
    testImplementation("org.assertj:assertj-core:3.21.0")
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