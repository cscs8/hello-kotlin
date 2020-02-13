package study

fun calcNotInline(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}

private val result1 = calcNotInline(1, 3, { a, b -> a + b })
private val result2 = calcNotInline(4, 6, { a, b -> a * b })
