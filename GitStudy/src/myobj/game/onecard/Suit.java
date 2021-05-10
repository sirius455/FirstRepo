package myobj.game.onecard;

public class Suit {
	private int value;
	private char shape;
	
	public Suit(int value, char shape) {
		this.value = value;
		this.shape = shape;		
	}
	
	public int getValue() {
		return value;
	}
	
	public char getShape() {
		return shape;
	}
		
	@Override
	public String toString() {
		return Character.toString(shape);
	}
}
