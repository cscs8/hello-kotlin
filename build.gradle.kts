val kotlinVersion by extra("1.3.61")

plugins {
    // Apply the Kotlin JVM plugin to add support for Kotlin.
    kotlin("jvm") version "1.3.61" apply false

    idea

    id("org.owasp.dependencycheck") version "5.3.0"

    id("de.fayard.refreshVersions") version "0.8.6"

    id("com.github.spotbugs") version "3.0.0"
}
apply(from = "gradle/owasp.gradle.kts")
subprojects {

    apply {
        // kotlin("jvm")
        plugin("org.jetbrains.kotlin.jvm")

        plugin("org.owasp.dependencycheck")

        plugin("idea")

        plugin("jacoco")

        plugin("com.github.spotbugs")
    }
    tasks {
        withType<JavaCompile> {
            options.encoding = "UTF-8"
        }

        withType<AbstractCompile> {
            sourceCompatibility = JavaVersion.VERSION_1_10.majorVersion
            targetCompatibility = JavaVersion.VERSION_1_10.majorVersion
        }

        named<DefaultTask>("check") {
            dependsOn(dependencyCheckAnalyze)
            dependsOn(rootProject.tasks.refreshVersions)
        }
        // To generate an HTML report instead of XML
        withType<com.github.spotbugs.SpotBugsTask> {
            reports.xml.isEnabled = false
            reports.html.isEnabled = true
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

            failBuildOnCVSS = 8F // 10 is the maximum
            val skipList: List<String> by project
            skipConfigurations = skipList
        }

        spotbugs {
            toolVersion = "4.0.0-beta4"
        }

    }
}
tasks {
    wrapper {
        gradleVersion = "6.1.1"
        distributionType = Wrapper.DistributionType.ALL
    }
}
