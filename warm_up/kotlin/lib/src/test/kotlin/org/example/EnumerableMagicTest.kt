import kotlin.test.assertEquals
import org.example.EnumerableMagic
import org.junit.jupiter.api.Test

class EnumerableMagicTest {
    @Test
    fun main() {
		print("EnumerableMagicTest");
        assertEquals(true, EnumerableMagic.include(intArrayOf(1, 2, 3, 4), 2))
        assertEquals(false, EnumerableMagic.include(intArrayOf(1, 2, 4, 5), 3))
    }
}
