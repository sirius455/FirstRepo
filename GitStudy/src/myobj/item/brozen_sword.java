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
		System.out.printf("%s�� �����ؼ� %d�� ���ݷ°� %d�� ���ݼӵ��� �����߽��ϴ�.\n", name, power, attackSpeed);
	}
	
	public static void main(String[] args) {
		new brozen_sword("û����", 4000).use();
		new brozen_sword("û����", 4000).info();
	}


}
