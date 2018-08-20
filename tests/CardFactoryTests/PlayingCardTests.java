import static org.junit.jupiter.api.Assertions.*;

import CardFactory.FaceValues;
import CardFactory.PlayingDeckCard;
import CardFactory.SuitDetails;

import org.junit.jupiter.api.Test;

class PlayingDeckCardTests {

	@Test
	void testPlayingDeckCardConstructorWithValidValues() {
		final PlayingDeckCard card = new PlayingDeckCard(FaceValues.EIGHT, SuitDetails.HEARTS);
		assertEquals("Eight", card.getFaceValue().toString());
		assertEquals("Hearts", card.getSuit().toString());
	}
	
	@Test
	void testPlayingDeckCardConstructorWithNullValues() {
		assertThrows(NullPointerException.class, ()-> { new PlayingDeckCard(null, null); });
	}
	
	@Test
	void testGetDisplayString() {
		final PlayingDeckCard card = new PlayingDeckCard(FaceValues.EIGHT, SuitDetails.HEARTS);
		assertEquals("Suit Hearts with face value Eight and color RED", card.getDisplayString());
	}
	
	@Test
	void testGetDisplayStringWithSymbols() {
		final PlayingDeckCard card = new PlayingDeckCard(FaceValues.EIGHT, SuitDetails.HEARTS);
		assertEquals("Suit ♥ with face value 8 and color RED", card.getDisplayStringWithSymbols());
	}
	
	@Test
	void testToString() {
		final PlayingDeckCard card = new PlayingDeckCard(FaceValues.EIGHT, SuitDetails.HEARTS);
		assertEquals("Suit Hearts with face value Eight", card.toString());
	}
}
