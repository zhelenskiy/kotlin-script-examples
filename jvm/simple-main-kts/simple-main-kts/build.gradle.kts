
plugins {
    kotlin("jvm")
}

val kotlinVersion: String by rootProject.extra

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-scripting-jvm-host:$kotlinVersion")
    implementation("org.jetbrains.kotlin:kotlin-scripting-dependencies:$kotlinVersion")
    implementation("org.jetbrains.kotlin:kotlin-script-util:$kotlinVersion")
    implementation("org.apache.ivy:ivy:2.5.0")
}

sourceSets {
    test {}
}
