package study.list6


class CountingGreeter(val greeter: Greeter) : Greeter by greeter {
    var helloCount: Int = 0
        private set

    override fun sayHello() {
        this.helloCount++
        greeter.sayHello()
    }
}

