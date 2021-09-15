plugins {
    id("com.android.application")
    kotlin("android")
}

dependencies {
    implementation(project(":shared"))
    implementation(Deps.material)
    implementation(Deps.AndroidX.app_compat)
    implementation(Deps.AndroidX.constraintLayout)
}

android {
    compileSdk = Versions.compile_sdk
    defaultConfig {
        applicationId = "com.billyluisneedham.testkmm3.android"
        minSdk = Versions.min_sdk
        targetSdk = Versions.target_sdk
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}