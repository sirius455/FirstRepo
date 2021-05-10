package myobj.game.onecard;

import java.util.ArrayList;

public class Player {

	
	ArrayList<Card> hand;
	Deck deck;
	
	public Player(Deck deck) {
		hand = new ArrayList<>();
		this.deck = deck;	
	}
	
	public void firstDraw() {
		hand.add(deck.draw());
		hand.add(deck.draw());
		hand.add(deck.draw());
		hand.add(deck.draw());
		hand.add(deck.draw());
	}
	
	public void handDraw() {
		hand.add(deck.draw());
	}
	
	public void peek() {
		System.out.println(hand);
	}
	
	public void drop(int drop) {
		hand.remove(drop);
	}
	
	public static void main(String[] args) {
		Deck deck = new Deck();
		Player p1 = new Player(deck);
		Player p2 = new Player(deck);
		
		p1.firstDraw();
		p2.firstDraw();
		
		
		p1.peek();
		p2.peek();
		
		System.out.println(deck);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return hand.toString();
	}
	
}
