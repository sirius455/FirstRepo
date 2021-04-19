package study;
import myobj.Game_battle;
import myobj.Pan;
import myobj.Peach;

public class C02_OOP {
	/*
	 	# ��ü���� ���α׷��� (OOP: object oriented Programming)
	 		
	 		- ���� �����Ϸ��� ��� �͵��� ������ �Լ��� ǥ���Ϸ��� ���α׷��� �����
	 		- ������ �Լ��� ���к��ϰ� ����ϱ� ���ٴ� 
	 		    ���ǿ� �����ϴ� ��ü������ ��� ǥ���Ͽ� �������� �ø���
	 		- ��ü(object) : ���� �����ϴ� ��� ���� ���Ѵ� (�繰, ���� ... ���)     
	 		
	 		 ex: ���
	 		  - ����� ���� : ũ��, ����, �絵, ��������, ������ Į�θ� ...
	 		  - ����� �޼���
	 		 		-> ������ (ũ�� ��ŭ�� �������� ������)
	 		 		-> �Դ´� (���� ��ŭ Į�θ��� �پ��� ����� ũ�Ⱑ �پ���)
	 		 		-> �����Ѵ� (����� �����ϸ� ��������� ������ �����Ѵ�)
	 		
	 		# Ŭ���� ���ο� �ִ� �Լ��� �޼����� �θ���. (��� �ڹٿ��� �޼���ۿ� ����.)
	 		
	 		# Ŭ���� (class)
	 			
	 			- ��ü�� ���α׷��� ���� ǥ���Ѱ�
	 			- Ŭ������ ��ü�� ���赵�̴�.(������ ���������� ��ü�� ����)
	 			- Ŭ������ ���� �����ϴ� ���� ��ü�� '�ν��Ͻ�'��� �θ���
	 			- Ŭ������ ������ ���� Ÿ���̴�.
	 */
	// ���α׷� ���� �ÿ� public class�� �ִ� main�� ã�� �� �ִ�.
	
	public static void main(String[] args) {
		// Apple Ŭ����(���赵)�� ���� �ν��Ͻ�(����ǰ) al
		// classƯ¡ �빮�ڷ� �����Ѵ�
		
		//�ٸ� ��Ű���� ������ public class�� ����Ҽ� �ִ�
		myobj.Peach p1 = new myobj.Peach();
		Peach p2 = new Peach();
	
		Apple a1 = new Apple();
		Apple a2 = new Apple();
		Apple a3 = new Apple();
		
		a1.calorie = 100;
		a2.calorie = 120;
		a3.calorie = 115;
		
		a1.eat();
		a1.eat();
		
//		System.out.println(a1.calorie);
//		System.out.println(a2.calorie);
//		System.out.println(a3.calorie);
		
		String str1 = "abc";
		String str2 = "ccc";
		String str3 = "bb";
		
		/*
		  	myobj ��Ű���� ������ ��ü�� �����Ͽ� Ŭ������ �ϳ� ������ �� 
		  	�ν��Ͻ��� �����ϰ� ���� ä����� ����غ�����
		  	�� �ν��Ͻ� ���� 3�� �̻�, �ν��Ͻ� �޼��� 2���̻�, ���� ����
		 */
		
		Pan pan1 = new Pan();
		pan1.size = 10;
		pan1.ink = 20;
		pan1.weight = 40;
		
		
		
		pan1.write();
		pan1.charge();
		
//		System.out.println(pan1.ink);
//		System.out.println(pan1.weight);
		

		Game_battle character = new Game_battle(200, 100, 10);
		Game_battle monster = new Game_battle(100, 5);
		
		
		
		System.out.printf("ĳ������ ���� hp [%d] ���� mp[%d]  demage [%d]\n", character.hp, character.mp, character.player_demage);
		System.out.printf("������ ���� hp [%d] demage [%d]\n", monster.monster_hp, monster.montser_demage);
//		System.out.println("������ ���� hp : " + lost.monster_hp);
		
		
		
	}
	
}


	// default class (public�� �Ⱥ��� class)
	
	/*
	  	# �ν��Ͻ� ����
	  	 - �� �ν��Ͻ� ���� �ٸ� ���� ���� �� �ִ� ����
	  	 - aka �ʵ�, �Ӽ�, ��� ����, ���� ...
	 */
	class Apple{
	int size;
	int calorie;
	double sweet;
	long lifetime;
	String color;
	/*
	  	# �ν��Ͻ� �޼���
	  		- �ν��Ͻ� ������ Ȱ���Ͽ� �ش� �ν��Ͻ��� ���¸� ��ȯ��Ű�� �޼���
	 */
	void eat() {
		size--;
		calorie -= 10;
	}
}