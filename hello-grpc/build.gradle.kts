
plugins {
    kotlin("jvm") version "1.3.61"

    idea

    id("org.owasp.dependencycheck") version "5.2.4"

    id("com.github.ben-manes.versions") version "0.27.0"

    id("com.google.protobuf") version "0.8.10"

    application
}
//---------------------------------------
// grpc.
//---------------------------------------

apply(from = "grpc.gradle")

repositories {
    google()
    jcenter()
    mavenCentral()
    mavenLocal()
}



dependencies {

    val kotlinVersion : String by rootProject.extra
    val grpcVersion : String by rootProject.extra   // CURRENT_GRPC_VERSION
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${kotlinVersion}")
    implementation(kotlin("stdlib"))
    implementation("io.grpc:grpc-netty-shaded:${grpcVersion}")
    implementation("io.grpc:grpc-protobuf:${grpcVersion}")
    implementation("io.grpc:grpc-stub:${grpcVersion}")
    compileOnly("javax.annotation:javax.annotation-api:1.3.2")

    testImplementation("io.grpc:grpc-testing:${grpcVersion}")  // gRCP testing utilities
    testImplementation("junit:junit:4.12")
    testImplementation("org.mockito:mockito-core:3.2.0")
}
//plugins.findPlugin("com.google.protobuf"). {

// https://github.com/rouzwawi/grpc-kotlin-1/blob/master/build.gradle.kts
//protobuf {
//      withGroovyBuilder {
//    "protobuf" {
//      "protoc" {
//        "setArtifact"("com.google.protobuf:protoc:3.6.1")
//      }
//      "plugins" {
//        "create"("grpc-kotlin") {
//          "setArtifact"("io.rouz:grpc-kotlin-gen:0.0.5:jdk8@jar")
//        }
//        "create"("grpc-java") {
//          "setArtifact"("io.grpc:protoc-gen-grpc-java:1.14.0")
//        }
//      }
//    }
//  }
//  tasks.withType<GenerateProtoTask> {
//    plugins.create("grpc-kotlin")
//    plugins.create("grpc-java")
//  }
//}
//kotlin {
//}


//        protoc { artifact = "com.google.protobuf:protoc:3.11.0" }
//        plugins {
//            grpc { artifact = "io.grpc:protoc-gen-grpc-java:${grpcVersion}" }
//        }
//        generateProtoTasks {
//            all() * . plugins { grpc {} }
//        }
//}

//startScripts.enabled = false
//
//task helloWorldServer(type: CreateStartScripts) {
//    mainClassName = 'io.grpc.examples.helloworld.HelloWorldServer'
//    applicationName = 'hello-world-server'
//    outputDir = new File(project.buildDir, 'tmp')
//    classpath = startScripts.classpath
//}
//
//task helloWorldClient(type: CreateStartScripts) {
//    mainClassName = 'io.grpc.examples.helloworld.HelloWorldClient'
//    applicationName = 'hello-world-client'
//    outputDir = new File(project.buildDir, 'tmp')
//    classpath = startScripts.classpath
//}
//
//applicationDistribution.into('bin') {
//    from(helloWorldServer)
//    from(helloWorldClient)
//    fileMode = 0755
//}

