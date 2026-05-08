import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android") version "2.3.21"
}

group = "io.flutter.plugins.flutter_plugin_android_lifecycle"
version = "1.0"

repositories {
    google()
    mavenCentral()
}

android {
    namespace = "io.flutter.plugins.flutter_plugin_android_lifecycle"
    compileSdk = 37

    defaultConfig {
        minSdk = 24
        consumerProguardFiles("proguard.txt")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    lint {
        checkAllWarnings = true
        warningsAsErrors = true

        disable += setOf(
            "AndroidGradlePluginVersion",
            "InvalidPackage",
            "GradleDependency",
            "NewerVersionAvailable"
        )
    }
}

kotlin {
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_21)
    }
}

dependencies {
    implementation("androidx.annotation:annotation:1.10.0")
}