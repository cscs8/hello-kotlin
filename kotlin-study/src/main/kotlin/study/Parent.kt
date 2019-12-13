package study

open class Parent {
    //    public var log: String = ""
    fun <T> parent(): Class<out Parent> {
        println("parentだよ")
        return this::class.java
    }
}

class Child : Parent() {

}

fun main(args: Array<String>) {
    trace { Child().parent<Child>() }
    println("a")
    println(Child().parent<Child>())
}

//https://ryuta46.com/180/112
inline fun <T> trace(body: () -> T): T {
    val callerName = Throwable().stackTrace[0].methodName

    try {
        callerName?.let {
            println("$callerName start")
        }
        return body()
    } finally {
        callerName?.let {
            println("$callerName end")
        }
    }
}