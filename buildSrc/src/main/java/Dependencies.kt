package co.joebirch.minimise.buildsrc

object Versions {
    val minSdk = 21
    val targetSdk = 30
    val compileSdk = 30
    val kotlin = Deps.Kotlin.version
}

object Deps {

    const val androidGradlePlugin = "com.android.tools.build:gradle:7.0.2"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.32"

    const val junit = "junit:junit:4.12"
    const val preferences = "com.russhwolf:multiplatform-settings:0.5.1"

    object Apollo {
        const val version = "2.5.6"
        const val plugin = "com.apollographql.apollo:apollo-gradle-plugin:$version"
        const val runtime = "com.apollographql.apollo:apollo-runtime-kotlin:$version"
        const val api = "com.apollographql.apollo:apollo-api:$version"
    }

    object Kotlin {
        const val version = "1.4.32"
        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
        const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:$version"
        const val common = "org.jetbrains.kotlin:kotlin-stdlib-common:$version"
        const val serialization = "org.jetbrains.kotlin:kotlin-serialization:$version"

        private const val serializationVersion = "1.1.0"

        const val serializationRuntimeNative =
            "org.jetbrains.kotlinx:kotlinx-serialization-runtime-native:$serializationVersion"

        const val serializationRuntime =
            "org.jetbrains.kotlinx:kotlinx-serialization-runtime:$serializationVersion"

        const val kotlinSerialization =
            "org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:$serializationVersion"
    }

    object Lifecycle {
        const val lifecycleVersion = "2.2.0"

        const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion"
        const val extensions = "androidx.lifecycle:lifecycle-extensions:$lifecycleVersion"
        const val common = "androidx.lifecycle:lifecycle-common:$lifecycleVersion"
        const val commonJava8 = "androidx.lifecycle:lifecycle-common-java8:$lifecycleVersion"
        const val runtime = "androidx.lifecycle:lifecycle-runtime:$lifecycleVersion"
    }

    object AndroidX {
        const val annotation = "androidx.annotation:annotation:1.1.0"
        const val coreKtx = "androidx.core:core-ktx:1.2.0"
        const val appCompat = "androidx.appcompat:appcompat:1.3.0-beta01"

        const val activity = "androidx.activity:activity:1.3.0-alpha04"
        const val activityKtx = "androidx.activity:activity-ktx:1.3.0-alpha04"

        const val junit = "androidx.test.ext:junit:1.1.1"
    }

    object Navigation {
        const val version = "2.3.0-alpha03"
        const val compose = "androidx.navigation:navigation-compose:1.0.0-alpha10"
    }

    object Espresso {
        const val version = "3.2.0"
        const val core = "androidx.test.espresso:espresso-core:$version"
    }

    object Mockito {
        const val version = "3.2.0"
        const val core = "androidx.test.espresso:espresso-core:$version"
        const val android = "org.mockito:mockito-android:$version"
    }

    object Fragment {
        private const val version = "1.3.0-alpha07"

        const val base = "androidx.fragment:fragment:1.3.0-alpha07"
        const val ktx = "androidx.fragment:fragment-ktx:$version"
        const val testing = "androidx.fragment:fragment-testing:$version"
    }

    object Coroutines {
        const val version = "1.4.3-native-mt"
        const val coreCommon =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core-common:$version"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
        const val android =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
    }

    object Compose {
        const val version = "1.0.0-beta04"

        const val animation = "androidx.compose.animation:animation:$version"
        const val animationCore = "androidx.compose.animation:animation-core:$version"
        const val core = "androidx.compose.ui:ui:$version"
        const val foundation = "androidx.compose.foundation:foundation:$version"
        const val layout = "androidx.compose.foundation:foundation-layout:$version"
        const val livedata = "androidx.compose.runtime:runtime-livedata:$version"
        const val material = "androidx.compose.material:material:$version"
        const val icons = "androidx.compose.material:material-icons-core:$version"
        const val iconsExtended = "androidx.compose.material:material-icons-extended:$version"
        const val runtime = "androidx.compose.runtime:runtime:$version"
        const val text = "androidx.compose.foundation:foundation-text:$version"
        const val tooling = "androidx.compose.ui:ui-tooling:$version"
        const val test = "androidx.compose.ui:ui-test-junit4:$version"
    }

    object Ktor {
        private const val version = "1.5.3"

        const val clientCore = "io.ktor:ktor-client-core:$version"
        const val clientJson = "io.ktor:ktor-client-json:$version"
        const val clientSerialization = "io.ktor:ktor-client-serialization:$version"
        const val logging = "io.ktor:ktor-client-logging:$version"

        const val clientAndroid = "io.ktor:ktor-client-android:$version"
        const val loggingAndroid = "io.ktor:ktor-client-logging-jvm:$version"
        const val clientJsonJvm = "io.ktor:ktor-client-json-jvm:$version"
        const val clientSerializationJvm = "io.ktor:ktor-client-serialization-jvm:$version"
        const val clientOkhttp = "io.ktor:ktor-client-okhttp:$version"

        const val clientIos = "io.ktor:ktor-client-ios:$version"
        const val loggingIos = "io.ktor:ktor-client-logging-native:$version"
        const val clientJsonNative = "io.ktor:ktor-client-json-native:$version"
        const val clientCoreNative = "io.ktor:ktor-client-core-native:$version"
        const val clientSerializationNative =
            "io.ktor:ktor-client-serialization-native:$version"
       // const val clientSerializationNativeX64 =
       //     "io.ktor:ktor-client-serialization-iosx64:$version"

        const val clintMockJvm = "io.ktor:ktor-client-mock-jvm:$version"
        const val clientMockJs = "io.ktor:ktor-client-mock-js:$version"
        const val clientMockNative = "io.ktor:ktor-client-mock-native:$version"
        const val clientMock = "io.ktor:ktor-client-mock:$version"
    }

    object Google {
        val material = "com.google.android.material:material:1.2.0-alpha03"

        object Hilt {
            private const val hiltVersion = "2.39.1"
            val gradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:$hiltVersion"
            val hilt = "com.google.dagger:hilt-android:$hiltVersion"
            val viewmodel = "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03"
            val compiler = "androidx.hilt:hilt-compiler:1.0.0-alpha03"
            val hiltNavigation = "com.google.dagger:hilt-navigation:1.0.0-alpha03"
            val hiltNavigationFragment = "androidx.hilt:hilt-navigation-fragment:1.0.0-alpha03"
            val hiltNavigationCompose = "androidx.hilt:hilt-navigation-compose:1.0.0-alpha01"
            val hiltCompiler = "com.google.dagger:hilt-android-compiler:$hiltVersion"
        }
    }
}