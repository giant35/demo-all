import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm") version "1.3.31"
    application
}

group = "demo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
application {
    mainClassName = "MainKt"
//    mainClassName = "demo.EchoServer"
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    compile("io.netty", "netty-all","4.1.38.Final")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}