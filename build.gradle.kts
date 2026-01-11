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

    testImplementation("org.junit.jupiter:junit-jupiter:6.0.2")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:6.0.2")

    testImplementation("org.assertj:assertj-core:3.27.6")
    testImplementation("org.mockito:mockito-core:5.21.0")
    testImplementation("org.mockito:mockito-junit-jupiter:5.21.0")
}

repositories {
    mavenCentral()
}

tasks.test {
    useJUnitPlatform()

    doFirst {
        val mockitoCoreAgent = configurations.testRuntimeClasspath.get()
            .firstOrNull { it.name.contains("mockito-core") }

        if (mockitoCoreAgent != null) {
            jvmArgs = (jvmArgs ?: mutableListOf()).apply {
                add("-javaagent:${mockitoCoreAgent.absolutePath}")
                add("-Xshare:off")
            }
        }
    }

    testLogging {
        events("passed", "skipped", "failed")
        showStandardStreams = true
    }
}

tasks.register("rebuild") {
    dependsOn("clean", "build")
}