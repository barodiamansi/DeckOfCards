import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import CardFactory.DeckFactory;
import CardFactory.PlayingDeckCard;
import CardInterfaces.Card;
import CardUtilities.Shuffler;

class ShufflerTests {

	@Test
	void testShuffle() throws NullPointerException {
		final Shuffler shuffler = new Shuffler();
		
		final DeckFactory deckFactory = new DeckFactory();
		final List<PlayingDeckCard> cards = deckFactory.generateCards();

		final Card card = cards.get(0);
		assertEquals(52, cards.size());
		
		shuffler.shuffle(cards);
		
		final Card newCard = cards.get(0);
		assertEquals(52, cards.size());
		assertNotEquals(card, newCard);
		assertNotEquals(card.getDisplayString(), newCard.getDisplayString());
	}
	
	@Test
	void testShuffleEmptyDeck() throws NullPointerException {
		final Shuffler shuffler = new Shuffler();
		final List<Card> cards = new ArrayList<Card>();
		
		assertThrows(NullPointerException.class, ()-> { shuffler.shuffle(cards); });
	}
	
	@Test
	void testShuffleNullDeck() throws NullPointerException {
		final Shuffler shuffler = new Shuffler();
		final List<Card> cards = null;
		
		assertThrows(NullPointerException.class, ()-> { shuffler.shuffle(cards); });
	}

}
