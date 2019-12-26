package study.list4

//class List4 {
    fun succ(n: Int): Int = n + 1

    fun twice(n: Int, f: (Int) -> Int): Int = f(f(n))

    fun main(args: Array<String>) {
        val got = twice(5, ::succ)
        println(got)
    }
//}
