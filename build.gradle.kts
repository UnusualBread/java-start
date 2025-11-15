plugins {
    java
    kotlin("jvm")
}

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "java")

    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(23))
        }
        modularity.inferModulePath.set(true)
    }
}

dependencies {
    implementation(project(":utils"))
    implementation(kotlin("stdlib-jdk8"))
}
repositories {
    mavenCentral()
}