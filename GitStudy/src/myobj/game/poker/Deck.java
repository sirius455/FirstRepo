package myobj.game.poker;

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
//		System.out.println("ī�� ���� �Ϸ�");
//		System.out.println(deck);
		
		Collections.shuffle(deck);
	}
	
	public Card draw() {
		return deck.pop();
	}
	
	public static void main(String[] args) {
		Deck d1 = new Deck();
		System.out.println(d1);
		
		//7�� �̾ƺ���
		System.out.println(d1.draw());
		System.out.println(d1.draw());
		System.out.println(d1.draw());
		System.out.println(d1.draw());
		System.out.println(d1.draw());
		System.out.println(d1.draw());
		System.out.println(d1.draw());
		
		System.out.println(d1);
	}
	
	@Override
	public String toString() {
		return deck.toString();
	}
	

	
}
