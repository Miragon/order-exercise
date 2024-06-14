import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.kotlinSpring)
    alias(libs.plugins.springBoot)
    alias(libs.plugins.springDependencyManagement)
}

group = "io.miragon"
version = "1.0.0"

java {
    sourceCompatibility = JavaVersion.VERSION_21
}

buildscript {
    extra.apply {
        set("springBoot", "3.1.0")
        set("springCloud", "2022.0.5")
    }
}

dependencyManagement {
    imports {
        mavenBom("org.springframework.boot:spring-boot-dependencies:${project.extra["springBoot"]}")
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:${project.extra["springCloud"]}")
    }
}

dependencies {
    implementation(libs.bundles.default)
    implementation(libs.bundles.zeebe)
    implementation(libs.bundles.rest)
    implementation(libs.springCloudOpenFeign)

    testImplementation(libs.bundles.defaultTest)
}

tasks.withType<Test> {
    useJUnitPlatform()
}
