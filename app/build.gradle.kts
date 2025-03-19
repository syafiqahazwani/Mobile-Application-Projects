plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.mine_notes"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.mine_notes"
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

    //Room (for database)
    implementation(libs.room.runtime)
    annotationProcessor(libs.androidx.room.compiler)
    annotationProcessor(libs.room.compiler.processing)

    //RecyclerView
    implementation(libs.androidx.recyclerview)

    //Scalable Size Unit (support for different screen sizes)
    implementation(libs.sdp.android)
    implementation(libs.ssp.android)

    //Material Design
    implementation(libs.material)

    //Rounded ImageView
    implementation(libs.roundedimageview)
}