import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	alias(libs.plugins.kotlinJvm)
	alias(libs.plugins.kotlinSpring)
	alias(libs.plugins.springBoot)
	alias(libs.plugins.springDependencyManagement)
}

allprojects {
	group = "io.miragon"
	version = "1.0-SNAPSHOT"
	repositories {
		mavenCentral()
	}
}

tasks.getByName<Jar>("jar") {
	enabled = true
}
