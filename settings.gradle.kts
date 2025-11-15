pluginManagement {
    plugins {
        kotlin("jvm") version "2.2.20"
    }
}
rootProject.name = "java-start"

include(":", "utils")

project(":utils").projectDir = file("modules/utils")