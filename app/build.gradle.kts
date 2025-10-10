plugins {
    alias(libs.plugins.android.application)
    id("com.google.gms.google-services") version "4.4.2"
}

android {
    namespace = "com.example.translatemyapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.translatemyapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation(platform("com.google.firebase:firebase-bom:32.7.0"))
    implementation("com.google.firebase:firebase-analytics")

    implementation ("com.google.firebase:firebase-core:21.0.0")
    implementation ("com.google.firebase:firebase-ml-natural-language:22.0.1")
    implementation ("com.google.firebase:firebase-ml-natural-language-translate-model:20.0.9")
    implementation ("com.google.firebase:firebase-ml-natural-language-language-id-model:20.0.8")

    // Translation API Support (Retrofit for LibreTranslate or Google Cloud - replaces ML Kit)
    implementation("com.squareup.retrofit2:retrofit:2.9.0")  // HTTP client for API calls
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")  // JSON conversion
    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")  // API debugging logs
    // JSON Parsing (for API responses)
    implementation("com.google.code.gson:gson:2.10.1")

}