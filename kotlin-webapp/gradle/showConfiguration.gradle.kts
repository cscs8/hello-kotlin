tasks.register("showConfiguration") {
    configurations.stream().forEach {
        println("#".repeat(10).plus(" ").plus(it))
    }
}
