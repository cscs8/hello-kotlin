package study

import java.util.function.Consumer
import java.util.function.Function
import java.util.function.Supplier

class Java8Try {
    val supplier: Supplier<String> = Supplier { "Hello supplier!" }
    val consumer: Consumer<String> = Consumer { t: String -> println("Hello consumer! -> ".plus(t)) }
    val function: Function<String, Int> = Function { t: String -> t.length }
}

fun main(args: Array<String>) {
    val java8Try = Java8Try()
    println("supplier.get() -> " + java8Try.supplier.get())
    println("ここだよ")
    java8Try.consumer.accept(java8Try.supplier.get())

    println("ここだよ")
    println(java8Try.function.apply("aaa"))
}
