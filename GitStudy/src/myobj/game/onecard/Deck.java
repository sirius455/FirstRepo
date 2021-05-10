package myobj.game.onecard;

import java.util.Collections;
import java.util.LinkedList;

public class Deck {
	
	LinkedList<Card> deck;
	
	public Deck() {
		deck = new LinkedList<>();
		
		for(Suit suit : Card.SUITS) {
			for(Rank rank : Card.Ranks) {
				deck.add(new Card(suit, rank));
			}
		}	
		deck.remove(27);
		deck.remove(40);
		
		Collections.shuffle(deck);
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	public Card draw() {		
		return deck.pop();
	}
	
	
	@Override
	public String toString() {
		return deck.toString();
	}
	
	public static void main(String[] args) {
		Deck d1 = new Deck();
		
		System.out.println(d1);
		d1.draw();
		d1.draw();
		d1.draw();
		d1.draw();
		System.out.println(d1);
	}
	
}
