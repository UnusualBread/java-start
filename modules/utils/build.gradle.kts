plugins {
    `java-library`
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(23))
    }
    modularity.inferModulePath.set(true)
}
