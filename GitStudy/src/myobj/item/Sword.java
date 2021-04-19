package myobj.item;

public class Sword extends Item{
	
	int power = 10;
	
	public Sword(String name, int price) {
		super(name, price);
		power = 10;
	}
	
	public void use() { 
		System.out.println(name +"�� �����ؼ� " + power + "��ŭ ���ݷ��� �ö󰬽��ϴ�.");
	}
	
	public static void main(String[] args) {
		new Sword("��", 2000).use();
	}

}
