package myobj.item;

public class Armor extends Item{
	
	int hp;
	int	miss;
	
	public Armor(String name, int price) {
		super(name, price);
		hp = 20;
	}
	
	public void use() { 
		System.out.println(name +"�� �����ؼ� " + hp + "��ŭ ü���� �ö󰬽��ϴ�.");
	}
	
	public static void main(String[] args) {
		new Armor("��", 2000).use();
		new Armor("��", 2000).info();
	}
	
}
