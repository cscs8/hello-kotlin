plugins {
    id("org.gretty") version "3.0.1"

    war
}
repositories {
    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
}

dependencies {
    // Align versions of all Kotlin components
    implementation(platform(kotlin("bom")))

    // Use the Kotlin JDK 8 standard library.
    implementation(kotlin("stdlib-jdk8"))

//    // Use the Kotlin test library.
//    testImplementation(kotlin("test"))
//
//    // Use the Kotlin JUnit integration.
//    testImplementation(kotlin("test-junit"))
//
//    compileOnly("javax.annotation:javax.annotation-api:1.2")

//    providedCompile(group = "javax", name = "javaee-api", version = "8.0.1")
    providedCompile(group = "javax.servlet", name = "javax.servlet-api", version = "4.0.1")

}

apply(from = "gradle/showConfiguration.gradle.kts")
gretty {
    servletContainer = "tomcat9"
}

