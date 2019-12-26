package study.list4

import org.junit.Test
import kotlin.test.assertEquals

class List4Test {
    @Test
    fun twiceTest() {
        val ret = twice(1, ::succ)
        assertEquals(3, ret)
    }
}