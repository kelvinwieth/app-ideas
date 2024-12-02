import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.example.NumberToReversedArray

class DigitizeExampleTests {
    @Test
    fun tests() {
        assertArrayEquals(intArrayOf(1, 3, 2, 5, 3), NumberToReversedArray.digitize(35231))
        assertArrayEquals(intArrayOf(0), NumberToReversedArray.digitize(0))
    }
}
