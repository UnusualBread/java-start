rootProject.name = "java-start"

include(":", "utils")

project(":utils").projectDir = file("modules/utils")