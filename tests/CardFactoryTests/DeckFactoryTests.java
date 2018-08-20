import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;
import CardFactory.DeckFactory;
import CardFactory.PlayingDeckCard;

class DeckFactoryTests {

	@Test
	void testGenerateCards() {
		final DeckFactory deckFactory = new DeckFactory();
		final List<PlayingDeckCard> cards = deckFactory.generateCards();
		
		assertNotNull(cards);
		assertTrue(!cards.isEmpty());
        assertEquals(cards.size(), 52);
	}

}
