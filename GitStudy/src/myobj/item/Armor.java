package myobj.item;

public class Armor extends Item{
	
	int hp;
	int	miss;
	
	public Armor(String name, int price) {
		super(name, price);
		hp = 20;
	}
	
	public void use() { 
		System.out.println(name +"를 장착해서 " + hp + "만큼 체력이 올라갔습니다.");
	}
	
	public static void main(String[] args) {
		new Armor("방어구", 2000).use();
		new Armor("방어구", 2000).info();
	}
	
}
