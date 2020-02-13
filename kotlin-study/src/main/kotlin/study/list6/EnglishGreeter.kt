package study.list6


class EnglishGreeter(override val name: String) : Greeter {
    override fun introduceMySelf() {
        sayHello()
        println("I am $name")
    }

    override fun sayHello() {
        println("Hello")
    }
}
