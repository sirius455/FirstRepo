package myobj.game.onecard;


public class Card {

	final public static Rank ACE  = new Rank(0, "A");
	final public static Rank TWO = new Rank(1, "2");
	final public static Rank THREE = new Rank(2, "3");
	final public static Rank FOUR = new Rank(3, "4");
	final public static Rank FIVE = new Rank(4, "5");
	final public static Rank SIX = new Rank(5, "6");
	final public static Rank SEVEN = new Rank(6, "7");
	final public static Rank EIGHT = new Rank(7, "8");
	final public static Rank NINE = new Rank(8, "9");
	final public static Rank TEN = new Rank(9, "10");
	final public static Rank JACK = new Rank(10, "J");
	final public static Rank QUEEN = new Rank(11, "Q");
	final public static Rank KING = new Rank(12, "K");
	final public static Rank JOKER = new Rank(13, "JOKER");
	
	
	final public static Suit SPADE = new Suit(0, '¢¼');
	final public static Suit CLOVER = new Suit(1, '¢À');
	final public static Suit HEART = new Suit(2, '¢½');
	final public static Suit DIAMOND = new Suit(3, '¡Þ');
	
	final public static Rank[] Ranks = {
			ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,
			TEN, JACK, QUEEN, KING, JOKER
	};
	
	final public static Suit[] SUITS = {SPADE, CLOVER, HEART, DIAMOND};
	
	
	Rank rank;
	Suit suit;
	
	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	
	public int getRankValue() {
		return rank.getValue();
	}
	
	public char getSuitValue() {
		return suit.getShape();
	}
	
	@Override
	public String toString() {
		return String.format("%s%s", suit, rank);
	}
	
	
	
}
