package study

import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.Ignore
import kotlin.test.assertEquals

class Java8TryTest {
    val test = Java8Try()
    @Test
    fun supplierTest() {
        assertEquals("Hello supplier!", test.supplier.get())
    }

    @Test
    fun consumerTest() {
        // https://teratail.com/questions/3694
        val out = ByteArrayOutputStream()
        System.setOut(PrintStream(out))

        test.consumer.accept("Hello World!")

        assertEquals("Hello consumer! -> Hello World!".plus(System.lineSeparator()), out.toString())
    }

    @Test
    fun functionTest() {
        assertEquals(3, test.function.apply("aaa"))
    }
}
