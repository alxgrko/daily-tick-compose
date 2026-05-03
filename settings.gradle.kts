pluginManagement {
    repositories {
        // Use the Gradle plugin portal for Kotlin and Compose compiler plugins
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    // Define plugin versions here to maintain consistency across the project.
    plugins {
        // Android application plugin. Version 9.1.1 is the latest stable as of May 2026 and
        // supports compiling against API 37 and uses Gradle 9.3 by default【702660799689379†L382-L399】.
        id("com.android.application") version "9.1.1"
        // Kotlin Android plugin. Version 2.3.21 is the current stable Kotlin release【884512022133107†L13-L18】.
        id("org.jetbrains.kotlin.android") version "2.3.21"
        // Compose compiler plugin. Starting with Kotlin 2.0 the Compose compiler ships with
        // the Kotlin tooling; specifying the plugin here ensures that the correct compiler
        // plugin matching the Kotlin version is used【202090595436927†L11-L16】.
        id("org.jetbrains.kotlin.plugin.compose") version "2.3.21"
    }
}

dependencyResolutionManagement {
    // Disallow modules from declaring their own repositories; use the ones defined here.
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Daily Tick"
include(":app")
