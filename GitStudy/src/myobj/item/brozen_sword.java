package myobj.item;

public class brozen_sword extends Sword{
	
	int power;
	int attackSpeed;

	public brozen_sword(String name, int price) {
		super(name, price);
		attackSpeed = 3;
		power = super.power + 10; 
	}
	
	public void use() { 
		System.out.printf("%s를 장착해서 %d의 공격력과 %d의 공격속도가 증가했습니다.\n", name, power, attackSpeed);
	}
	
	public static void main(String[] args) {
		new brozen_sword("청동검", 4000).use();
		new brozen_sword("청동검", 4000).info();
	}


}
