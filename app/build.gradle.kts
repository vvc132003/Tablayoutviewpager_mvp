plugins {
    id("com.android.application")
}

android {
    namespace = "com.xuanthongn"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.xuanthongn"
        minSdk = 28
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    implementation("androidx.navigation:navigation-fragment:2.7.7")
    implementation("androidx.navigation:navigation-ui:2.7.7")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation ("androidx.room:room-runtime:2.6.1")
    annotationProcessor ("androidx.room:room-compiler:2.6.1")

    // optional - RxJava2 support for Room
    implementation ("androidx.room:room-rxjava2:2.6.1")

    // optional - RxJava3 support for Room
    implementation ("androidx.room:room-rxjava3:2.6.1")

    // optional - Guava support for Room, including Optional and ListenableFuture
    implementation ("androidx.room:room-guava:2.6.1")

    // optional - Test helpers
    testImplementation ("androidx.room:room-testing:2.6.1")

    // optional - Paging 3 Integration
    implementation ("androidx.room:room-paging:2.6.1")

}