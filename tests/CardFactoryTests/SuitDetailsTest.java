import static org.junit.jupiter.api.Assertions.*;
import CardFactory.SuitDetails;
import org.junit.jupiter.api.Test;

class SuitDetailsTest {

	@Test
	void testSuitDetailsStrings() {
		assertEquals("Hearts", SuitDetails.HEARTS.toString());
		assertEquals("Spades", SuitDetails.SPADES.toString());
		assertEquals("Clubs", SuitDetails.CLUBS.toString());
		assertEquals("Diamonds", SuitDetails.DIAMONDS.toString());
	}
	
	@Test
	void testSuitDetailsSymbols() {
		assertEquals("\u2665", SuitDetails.HEARTS.toSymbol());
		assertEquals("\u2660", SuitDetails.SPADES.toSymbol());
		assertEquals("\u2663", SuitDetails.CLUBS.toSymbol());
		assertEquals("\u2666", SuitDetails.DIAMONDS.toSymbol());
	}
	
	@Test
	void testSuitDetailsColor() {
		assertEquals(SuitDetails.Color.RED, SuitDetails.HEARTS.getCardColor());
		assertEquals(SuitDetails.Color.BLACK, SuitDetails.SPADES.getCardColor());
		assertEquals(SuitDetails.Color.BLACK, SuitDetails.CLUBS.getCardColor());
		assertEquals(SuitDetails.Color.RED, SuitDetails.DIAMONDS.getCardColor());
	}

}
