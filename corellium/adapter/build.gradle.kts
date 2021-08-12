import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin(Plugins.Kotlin.PLUGIN_JVM)
}

repositories {
    mavenCentral()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
    kotlinOptions.freeCompilerArgs += listOf(
        "-Xopt-in=kotlinx.coroutines.ExperimentalCoroutinesApi",
        "-Xopt-in=kotlinx.coroutines.FlowPreview",
    )
}

dependencies {
    implementation(project(":corellium:api"))
    implementation(project(":corellium:client"))
    implementation(Dependencies.KOTLIN_COROUTINES_CORE)
    testImplementation(Dependencies.JUNIT)
    testImplementation(Dependencies.MOCKK)
}

