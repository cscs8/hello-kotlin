package study

import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals

class Java8TryTest {
    val test = Java8Try()
    @Test
    fun supplierTest() {
        assertEquals("Hello supplier!", test.supplier.get())
    }

    @Test
    fun consumerTest() {
        val charset = Charsets.UTF_8
        // https://teratail.com/questions/3694
        val out = ByteArrayOutputStream()
        System.setOut(PrintStream(out, false, charset))

        test.consumer.accept("Hello World!")

        assertEquals(
            "Hello consumer! -> Hello World!".plus(System.lineSeparator()),
            out.toString(charset)
        )
    }

    @Test
    fun functionTest() {
        assertEquals(3, test.function.apply("aaa"))
    }
}
