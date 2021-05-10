package myobj.game.onecard;

public class Rank {
	
	private int value;
	private String name;
	
	public Rank(int value, String name) {
		
		this.value = value;
		this.name = name;;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}