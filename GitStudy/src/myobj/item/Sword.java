package myobj.item;

public class Sword extends Item{
	
	int power = 10;
	
	public Sword(String name, int price) {
		super(name, price);
		power = 10;
	}
	
	public void use() { 
		System.out.println(name +"를 장착해서 " + power + "만큼 공격력이 올라갔습니다.");
	}
	
	public static void main(String[] args) {
		new Sword("검", 2000).use();
	}

}
