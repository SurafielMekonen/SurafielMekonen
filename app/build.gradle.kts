plugins {
      id("com.android.application")
      id("org.jetbrains.kotlin.android")
}
android {
    namespace = "nl.jarvis.assistant"
    compileSdk = 34
    defaultConfig { 
        applicationId = "nl.jarvis.assistant"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
}
buildTypes { 
    release {
        isMinifyEnabled = false
    }
}
compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
kotlinOptions {
    jvmTarget ="17"
}
}
dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("org.jetbrains.kotlinux:kotlinux-coroutines-android:1.8.1")
    //wake word"jarvis" (gratis access key via console.picovoice.ai)
    implementation("ai.picovoice:porcupine-android:3.0.2")
}
