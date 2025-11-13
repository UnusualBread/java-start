rootProject.name = "JavaStart"

include(":", "utils")

project(":utils").projectDir = file("modules/utils")