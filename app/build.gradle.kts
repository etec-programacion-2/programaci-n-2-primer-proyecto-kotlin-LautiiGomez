
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}


plugins {
    kotlin("jvm") version "1.9.0"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

application {
    mainClass.set("org.example.MainKt")
}
