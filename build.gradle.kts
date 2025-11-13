plugins {
    java
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
}
