import org.junit.Test
import study.Sample
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SampleTest {
    val sample = Sample()
    @Test
    fun containsTrueTest() {
        assertTrue(sample.contains(listOf(2, 4, 6), sample::isGreaterThan5))
    }

    @Test
    fun containsFalseTest() {
        assertFalse(sample.contains(listOf(7, 5, 4), sample::isMultipleOf3))
    }
}
