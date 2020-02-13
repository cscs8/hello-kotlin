package study

inline fun calcInline(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}

private val result1 = calcInline(1, 3, { a, b -> a + b })
private val result2 = calcInline(4, 6, { a, b -> a * b })
