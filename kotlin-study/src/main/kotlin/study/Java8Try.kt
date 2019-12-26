package study

import java.util.function.Consumer
import java.util.function.Predicate
import java.util.function.Supplier

class Java8Try {
    val supplier: Supplier<String> = Supplier { "Hello supplier!" }
    //    val function: Function<String> = Function { t: String ->  }
    val consumer: Consumer<String> = Consumer { t: String -> println("Hello consumer! -> ".plus(t)) }
//    val consumer : Consumer<String> = (String) -> Unit

}

fun main(args: Array<String>) {
    val java8Try = Java8Try()
    println("supplier.get() -> " + java8Try.supplier.get())
    println("ここだよ")
    java8Try.consumer.accept(java8Try.supplier.get())
}
