/**
 * @author Mansi B
 *
 */
import CardFactory.DeckFactory;
import CardFactory.PlayingDeckCard;

public class DeckOfCardsGame {
	
	public static void main(String[] args)
	{
		DeckFactory deckFactory = new DeckFactory();
		Deck deck = new Deck(deckFactory.generateCards());	
		
		deck.prettyPrintCardsDeck(deck.cards);
		deck.shuffle();
		
		for (int i = 1; i < 53; i++) {
			PlayingDeckCard card = deck.dealOneCard();
			System.out.print("Card # " + i + " - " + card.getDisplayStringWithSymbols() + "\n");
		}
		
		deck.dealOneCard();
	}
}
