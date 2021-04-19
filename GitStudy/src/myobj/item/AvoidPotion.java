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
		System.out.println(name +"를 마셔서 " + Avoid + "만큼 회피가 올라갔습니다.");
	}
	
	public static void main(String[] args) {
		new AvoidPotion("회피포션", 3500).use();
		new AvoidPotion("회피포션", 3500).info();
	}

}


