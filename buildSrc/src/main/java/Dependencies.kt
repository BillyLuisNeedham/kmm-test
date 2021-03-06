object Versions {
    val kotlin = "1.5.30"
    val android_gradle_plugin = "7.0.2"

    val min_sdk = 26
    val target_sdk = 31
    val compile_sdk = 31

    val sql_delight = "1.5.1"
    val junit = "4.13.2"
    val material = "1.3.0"

    object AndroidX {
        val app_compat = "1.2.0"
        val constraint_layout = "2.0.4"
    }
}

object Deps {
    val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    val android_gradle_plugin = "com.android.tools.build:gradle:${Versions.android_gradle_plugin}"

    val junit = "junit:junit:${Versions.junit}"

    val material = "com.google.android.material:material:${Versions.material}"

    object SqlDelight {
        val gradle = "com.squareup.sqldelight:${Versions.sql_delight}"
        val runtime = "com.squareup.sqldelight:runtime:${Versions.sql_delight}"
        val driver_android = "com.squareup.sqldelight:android-driver:${Versions.sql_delight}"
        val driver_ios = "com.squareup.sqldelight:native-driver:${Versions.sql_delight}"
    }

    object KotlinTest {
        val common = "org.jetbrains.kotlin:kotlin-test-common:${Versions.kotlin}"
        val annotations = "org.jetbrains.kotlin:kotlin-test-annotations-common:${Versions.kotlin}"
        val junit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
    }

    object AndroidX {
        val app_compat = "androidx.appcompat:appcompat:${Versions.AndroidX.app_compat}"
        val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.AndroidX.constraint_layout}"
    }
}