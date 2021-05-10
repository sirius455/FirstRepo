package myobj.game.onecard;

import java.util.ArrayList;
import java.util.Collections;

public class TableDeck {
	
	ArrayList<Card> tableDeck;
	Deck deck;
	
	public TableDeck(Deck deck) {
		tableDeck = new ArrayList<>();
		this.deck = deck;
	}
	
	public void next() {
		tableDeck.add(deck.draw());
	}
	
}
