package myobj.game.poker;

public class Rank {
	
	private int value;
	private String name;
	
	public Rank(int value, String name) {
		
		this.value = value;
		this.name = name;;
		
	}
	
	//getter : public으로 private 필드를 꺼내가기만 하는 메서드
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
