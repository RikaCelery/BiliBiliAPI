import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    val ktVersion = "1.6.10"
    kotlin("jvm") version ktVersion
    kotlin("plugin.serialization") version ktVersion
    id("com.github.johnrengelman.shadow") version "5.1.0"
    application
}

group = "org.celery"
version = "1.0-SNAPSHOT"

repositories {
    maven {
        url = uri("https://maven.pkg.jetbrains.space/public/p/ktor/eap")
    }
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines:0.19.2")
    implementation("org.jetbrains.kotlinx:kotlinx-io:0.1.16")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.7.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:1.6.4")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:1.4.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-properties:1.4.0")
    implementation("org.fusesource.jansi:jansi:2.4.0")
    implementation("org.apache.commons:commons-lang3:3.12.0")
    implementation("commons-codec:commons-codec:1.15")
    implementation("commons-io:commons-io:2.11.0")
    implementation("commons-cli:commons-cli:1.5.0")
    implementation("commons-collections:commons-collections:3.2.2")
    implementation("org.apache.commons:commons-text:1.9")
    implementation("org.brotli:dec:0.1.2")
    implementation("org.jsoup:jsoup:1.15.3")
    implementation("net.coobird:thumbnailator:0.4.17")
    implementation("org.xerial:sqlite-jdbc:3.39.3.0")
    implementation("org.slf4j:slf4j-api:2.0.5")
    implementation("org.slf4j:slf4j-simple:2.0.5")
    val ktor_version = "2.2.1"
    implementation("io.ktor:ktor-client:$ktor_version")
    implementation("io.ktor:ktor-client-cio:$ktor_version")
    implementation("io.ktor:ktor-client-content-negotiation:$ktor_version")
    implementation("io.ktor:ktor-client-serialization:$ktor_version")
    implementation("io.ktor:ktor-serialization-kotlinx-json:$ktor_version")
    implementation("io.ktor:ktor-serialization-kotlinx-protobuf:$ktor_version")
    testImplementation(kotlin("test"))
}
val MAIN_CLASS = "org.celery.bilibili.MainKt"
application{
    mainClass.set(MAIN_CLASS)
    mainClassName = MAIN_CLASS
}
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
tasks {
    test{
        useJUnitPlatform()
    }
    jar {
        manifest {
            attributes(
                mapOf(
                    "Main-Class" to MAIN_CLASS, //will make your jar (produced by jar task) runnable
                    "ImplementationTitle" to project.name,
                    "Implementation-Version" to project.version
                ))
        }
    }
    shadowJar {
        manifest.inheritFrom(jar.get().manifest) //will make your shadowJar (produced by jar task) runnable
    }
}