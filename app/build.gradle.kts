plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.tv_shows"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.tv_shows"
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
    buildFeatures {
        dataBinding = true
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

    // Material Design
    implementation("com.google.android.material:material:1.12.0")

    // Retrofit & Gson
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    // Picasso
    implementation("com.squareup.picasso:picasso:2.71828")

    // Lifecycle Extensions
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")

    // Room & RxJava Support
    implementation("androidx.room:room-runtime:2.6.1")
    annotationProcessor("androidx.room:room-compiler:2.6.1")
    implementation("androidx.room:room-rxjava2:2.6.1")

    // RxJava
    implementation("io.reactivex.rxjava2:rxandroid:2.0.1")

    // Scalable Size Units
    implementation("com.intuit.sdp:sdp-android:1.0.6")
    implementation("com.intuit.ssp:ssp-android:1.0.6")

    // Rounded Image View
    implementation("com.makeramen:roundedimageview:2.3.0")
}














