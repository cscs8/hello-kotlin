val kotlinVersion by extra("1.3.61")
val grpcVersion by extra("1.25.0")   // CURRENT_GRPC_VERSION

plugins {
    // Apply the Kotlin JVM plugin to add support for Kotlin.
    kotlin("jvm") version "1.3.61" apply false

    idea

    id("org.owasp.dependencycheck") version "5.2.4"

    id("de.fayard.refreshVersions") version "0.8.6"
}
subprojects {

    apply {
        // kotlin("jvm")
        plugin("org.jetbrains.kotlin.jvm")

        plugin("org.owasp.dependencycheck")

        plugin("idea")

        plugin("org.gradle.application")

        // application
        plugin("org.gradle.application")

        plugin("jacoco")

    }
    tasks {
        withType<JavaCompile> {
            options.encoding = "UTF-8"
        }

        withType<AbstractCompile> {
            sourceCompatibility = JavaVersion.VERSION_1_8.majorVersion
            targetCompatibility = JavaVersion.VERSION_1_8.majorVersion
        }

        named<DefaultTask>("check") {
            dependsOn(dependencyCheckAggregate)
            dependsOn(rootProject.tasks.refreshVersions)
        }

    }

}
tasks {
    wrapper {
        gradleVersion = "6.0.1"
        distributionType = Wrapper.DistributionType.ALL
    }


    dependencyCheck {
        analyzers(delegateClosureOf<org.owasp.dependencycheck.gradle.extension.AnalyzerExtension> {
            assemblyEnabled = false
            nugetconfEnabled = false
            nuspecEnabled = false
            nodeEnabled = false
            nodeAuditEnabled = false
            swiftEnabled = false
            bundleAuditEnabled = false
            rubygemsEnabled = false
            golangDepEnabled = false
            golangModEnabled = false
            pyDistributionEnabled = false
            pyPackageEnabled = false
        })
    }
}
