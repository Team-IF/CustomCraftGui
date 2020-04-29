plugins {
    kotlin("jvm") version "1.3.72"
    id("org.jetbrains.dokka") version "0.10.0"
}

group = "io.teamif"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://repo.maven.apache.org/maven2/")
    maven("https://dl.bintray.com/kotlin/dokka")
    maven("https://oss.sonatype.org/content/repositories/snapshots/")
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
}

dependencies {
    compileOnly(kotlin("stdlib-jdk8"))
    compileOnly("org.spigotmc:spigot-api:1.12.2-R0.1-SNAPSHOT")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }

    dokka {
        outputFormat = "javadoc"
        outputDirectory = "$buildDir/dokka"

        configuration {
            includeNonPublic = true
            jdkVersion = 8
        }
    }

    create<Jar>("dokkaJar") {
        archiveClassifier.set("javadoc")
        from(dokka)
        dependsOn(dokka)
    }

    create<Jar>("sourcesJar") {
        archiveClassifier.set("sources")
        from(sourceSets["main"].allSource)
    }
}