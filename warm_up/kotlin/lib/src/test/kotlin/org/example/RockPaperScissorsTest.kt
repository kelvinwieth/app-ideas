import kotlin.test.assertEquals
import org.junit.jupiter.api.*
import org.example.rps

class TestExample {
	@Test @DisplayName("Should return \"Player 1 won!\"")
	fun player1ShouldWin() {
	  assertEquals("Player 1 won!", rps("rock", "scissors"))
	}
	
	@Test @DisplayName("Should return \"Player 2 won!\"")
	fun player2ShouldWin() {
	  assertEquals("Player 2 won!", rps("scissors", "rock"))
	}
	
	@Test @DisplayName("Should return \"Draw!\"")
	fun Draw() {
	  assertEquals("Draw!", rps("scissors", "scissors"))
	}
}
