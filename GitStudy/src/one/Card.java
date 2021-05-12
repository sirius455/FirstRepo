package one;

import java.util.HashSet;

public class Card {
	
	public static HashSet<Character> SUITS;
	public static HashSet<String> RANKS;
	
	static {
		
		SUITS = new HashSet<>();
		RANKS = new HashSet<>();
		
		SUITS.add('¡Þ');
		SUITS.add('¢¼');
		SUITS.add('¢½');
		SUITS.add('¢À');
		
		RANKS.add("A");
		RANKS.add("2");
		RANKS.add("3");
		RANKS.add("4");
		RANKS.add("5");
		RANKS.add("6");
		RANKS.add("7");
		RANKS.add("8");
		RANKS.add("9");
		RANKS.add("10");
		RANKS.add("J");
		RANKS.add("Q");
		RANKS.add("K");
		RANKS.add("JOKER");
	}
	
	private Character suit;
	private String rank;
	private boolean isAttack;
	private int attackvalue;
	private boolean isSpecial;
	
	public Card(Character suit, String rank) {
		this.suit = suit;
		this.rank = rank;
	}

	
	public boolean isSpecial() {
		return isSpecial;
	}

	public void setSpecial(boolean isSpecial) {
		this.isSpecial = isSpecial;
	}
	
	public Character getSuit() {
		return suit;
	}
	
	

	public void setSuit(Character suit) {
		this.suit = suit;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public boolean isAttack() {
		return isAttack;
	}

	public void setAttack(boolean isAttack) {
		this.isAttack = isAttack;
	}

	public int getAttackvalue() {
		return attackvalue;
	}

	public void setAttackvalue(int attackvalue) {
		this.attackvalue = attackvalue;
	}
	
	@Override
	public String toString() {
		return String.format("[%c%s]", this.suit, this.rank);
	}
	
}
