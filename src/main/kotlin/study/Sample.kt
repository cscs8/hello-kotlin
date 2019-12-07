fun contains(ints: List<Int>, predicate: (Int) -> Boolean): Boolean {
    for (i in ints) {
        if (predicate(i)) return true
    }
    return false
}

fun isGreaterThan5(n: Int): Boolean = 5 < n

fun isMultipleOf3(n: Int): Boolean = n % 3 == 0

fun main(args: Array<String>) {
    println(contains(listOf(2, 4, 6), ::isGreaterThan5))
    println(contains(listOf(7, 5, 4), ::isMultipleOf3))
}