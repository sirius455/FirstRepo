package myobj.item;

import java.util.Random;

public class AvoidPotion extends Item {
	
	Random ran = new Random();
	
	int Avoid;
	
	public AvoidPotion(String name, int price) {
		super(name, price);
		Avoid = 10;
	}
	
	public void use() { 
		System.out.println(name +"�� ���ż� " + Avoid + "��ŭ ȸ�ǰ� �ö󰬽��ϴ�.");
	}
	
	public static void main(String[] args) {
		new AvoidPotion("ȸ������", 3500).use();
		new AvoidPotion("ȸ������", 3500).info();
	}

}


