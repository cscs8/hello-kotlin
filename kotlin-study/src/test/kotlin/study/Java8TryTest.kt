package study

import org.junit.Test
import kotlin.test.Ignore
import kotlin.test.assertEquals

class Java8TryTest {
    val test = Java8Try()
    @Test
    fun supplierTest() {
        assertEquals(test.supplier.get(), "Hello supplier!")
    }

    @Test
    @Ignore
    fun consumerTest() {
//        assertEquals(test.consumer.accept("Hello World!"), "Hello consumer! -> HelloWorld!")
    }
}
