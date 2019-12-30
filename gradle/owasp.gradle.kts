val skipList by extra(
    listOf(
        "gretty",
        "grettyNoSpringBoot",
        "grettyProductRuntime",
        "grettyProvidedCompile",
        "grettyRunnerJetty7",
        "grettyRunnerJetty8",
        "grettyRunnerJetty9",
        "grettyRunnerJetty93",
        "grettyRunnerJetty94",
        "grettyRunnerTomcat85",
        "grettyRunnerTomcat9",
        "grettySpringLoaded",
        "grettyStarter"
    )
)
////import org.owasp.dependencycheck.gradle.extension.DependencyCheckExtension
////
//buildscript {
//    repositories {
//        jcenter()
//        maven { url = uri("https://plugins.gradle.org/m2/") }
//    }
//    dependencies {
//        classpath("org.owasp:dependency-check-gradle:5.2.4")
//    }
//}
////
//////apply {
//////    plugin("org.owasp.dependencycheck")
//////}
//apply(plugin = "org.owasp.dependencycheck")
////
////// https://docs.gradle.org/current/userguide/kotlin_dsl.html
//////fun apply(project: Project): Unit = project.run {
//////    configure() {
//////    apply(plugin = "org.owasp.dependencycheck")
//////
//////val type = DependencyCheckExtension(project)
////configure<DependencyCheckExtension> {
////    skipConfigurations = listOf(
//////configure<DependencyCheckExtension> {
//////    failBuildOnCVSS = 8F // 10 is the maximum
//////    //
//////    skipConfigurations = listOf(
////        "gretty",
////        "grettyNoSpringBoot",
////        "grettyProductRuntime",
////        "grettyProvidedCompile",
////        "grettyRunnerJetty7",
////        "grettyRunnerJetty8",
////        "grettyRunnerJetty9",
////        "grettyRunnerJetty93",
////        "grettyRunnerJetty94",
////        "grettyRunnerTomcat85",
////        "grettyRunnerTomcat9",
////        "grettySpringLoaded",
////        "grettyStarter"
////    )
////
////    println("ここだよ" + skipConfigurations)
//////}
//////    }
//////}
//
////val depen = the<DependencyCheckExtension>()
////depen.skipConfigurations = listOf("gretty")
////configure<DependencyCheckExtension> {
////    skipConfigurations = listOf("gretty")
////}
////org.owasp.dependencycheck.gradle.extension.DependencyCheckExtension {
////val a = project.extensions.getByName("DependencyCheckExtension")
//////dependencyCheck<DependencyCheckExtension> {
////    a{
////    skipConfigurations = listOf("gretty")
////}
////}
//
////val kotlinVersion by extra("1.3.61")
//
////plugins {
////    id("org.owasp.dependencycheck") version "5.2.4"
////}
//subprojects {
//
//    apply {
//        plugin("org.owasp.dependencycheck")
//    }
//    tasks {
////        named<DefaultTask>("check") {
////            dependsOn(dependencyCheckAnalyze)
////        }
//
//        dependencyCheck {
//            analyzers(delegateClosureOf<org.owasp.dependencycheck.gradle.extension.AnalyzerExtension> {
//                assemblyEnabled = false
//                nugetconfEnabled = false
//                nuspecEnabled = false
//                nodeEnabled = false
//                nodeAuditEnabled = false
//                swiftEnabled = false
//                bundleAuditEnabled = false
//                rubygemsEnabled = false
//                golangDepEnabled = false
//                golangModEnabled = false
//                pyDistributionEnabled = false
//                pyPackageEnabled = false
//            })
//
//            failBuildOnCVSS = 8F // 10 is the maximum
//            skipConfigurations = listOf(
//                "gretty",
//                "grettyNoSpringBoot",
//                "grettyProductRuntime",
//                "grettyProvidedCompile",
//                "grettyRunnerJetty7",
//                "grettyRunnerJetty8",
//                "grettyRunnerJetty9",
//                "grettyRunnerJetty93",
//                "grettyRunnerJetty94",
//                "grettyRunnerTomcat85",
//                "grettyRunnerTomcat9",
//                "grettySpringLoaded",
//                "grettyStarter"
//            )
//        }
//    }
//}

