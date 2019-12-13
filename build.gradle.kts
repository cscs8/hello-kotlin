val kotlinVersion by extra("1.3.61")
val grpcVersion by extra("1.25.0")   // CURRENT_GRPC_VERSION


tasks.wrapper {
    gradleVersion = "6.0.1"
    distributionType = Wrapper.DistributionType.ALL
}


