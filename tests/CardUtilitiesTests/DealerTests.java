import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import CardExceptions.EmptyDeckException;
import CardFactory.DeckFactory;
import CardFactory.PlayingDeckCard;
import CardInterfaces.Card;
import CardUtilities.Dealer;

class DealerTests {

	@Test
	void testDealOneRandomCard() throws EmptyDeckException {
		final DeckFactory deckFactory = new DeckFactory();
		final List<PlayingDeckCard> cards = deckFactory.generateCards();
		
		final Dealer dealer = new Dealer();
		PlayingDeckCard randomCard = dealer.dealOneRandomCard(cards);
		assertNotNull(randomCard);
		assertEquals(51, cards.size());
		
		randomCard = dealer.dealOneRandomCard(cards);
		assertNotNull(randomCard);
		assertEquals(50, cards.size());
	}
	
	@Test
	void testDealAllRandomCards() throws EmptyDeckException {
		final DeckFactory deckFactory = new DeckFactory();
		final List<PlayingDeckCard> cards = deckFactory.generateCards();
		final List<Card> newDeck = new ArrayList<Card>();
		
		final Dealer dealer = new Dealer();
		for(int i=0; i < 52; i++) {
			newDeck.add(dealer.dealOneRandomCard(cards));
		}
		
		assertEquals(0, cards.size());
		assertEquals(52, newDeck.size());
		
		assertThrows(EmptyDeckException.class, ()-> { dealer.dealOneRandomCard(cards); });
	}
	
	@Test
	void testDealTopCard() throws EmptyDeckException {
		final DeckFactory deckFactory = new DeckFactory();
		final List<PlayingDeckCard> cards = deckFactory.generateCards();
		final Dealer dealer = new Dealer();
		assertEquals(cards.get(0), dealer.dealTopCard(cards));
		assertEquals(51, cards.size());
	}
	
	@Test
	void testDealBottomCard() throws EmptyDeckException {
		final DeckFactory deckFactory = new DeckFactory();
		final List<PlayingDeckCard> cards = deckFactory.generateCards();
		final Dealer dealer = new Dealer();
		assertEquals(cards.get(51), dealer.dealBottomCard(cards));
		assertEquals(51, cards.size());
	}
}
