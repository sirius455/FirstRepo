package study;

public class C11_AnonymousInnerClass {
	
	/*
	  	# �͸� ���� Ŭ����
	  	
	  	  - Ŭ������ �̸��� ���� �ʰ� ������ ���� �ٷ� ����ϴ� ���
	  	  - ��ȸ���̴�
	  
	 */
	
	public static void kick(Kickable something) {
		something.kick();
	}
	
	public static void main(String[] args) {
//		kick(new Human());
//		kick(new VendingMachine());
//		kick(new Ball("�޽�"));
//		kick(new Ball("�⼺��"));
		punch(new PunchMachine("ȿ����"));
		
		//���� ���� Ŭ����
		class Door extends Kickable {
			
			boolean open;
			
			void kick() {
				if(open) { 
					System.out.println("��¦�� �߷� ���� �ݾҽ��ϴ�.");
					open = false;
				} else {
					System.out.println("��¦�� �߷� ���� �������ϴ�.");
					open = true;
				}
			}
			
		}
		
		class Sandbag extends Punchable {
			
			boolean push;
			
			void punch() {
				if(push) { 
					System.out.println("������� ��¦ �з������ϴ�.");
					push = false;
				} else {
					System.out.println("������� ũ�� �з������ϴ�.");
					push = true;
				}
			}
			
		}
		
		class Peoples extends Punchable {
			
			boolean hit;
			
			void punch() {
				if(hit) { 
					System.out.println("������� �ļ� ü���Ǿ����ϴ�.");
					hit = false;
				} else {
					System.out.println("������� �ļ� �����ƽ��ϴ�.");
					hit = true;
				}
			}
			
		}
		
		Sandbag sandbag = new Sandbag(), sandbag1 = new Sandbag(), sandbag2 = new Sandbag();
		Peoples peoples = new Peoples(), people1 = new Peoples();
		
		punch(sandbag);
		punch(sandbag);
		punch(sandbag);
		punch(peoples);
		punch(peoples);
		
		Door door1 = new Door(), door2 = new Door(), door3 = new Door();  
		
//		kick(door1);
//		kick(door1);
//		kick(door1);
//		kick(door2);
//		kick(door3);
//		kick(door3);
		
		// # �͸� Ŭ����(�Ｎ���� Door�� ����� �ν��Ͻ��� ����)
		// - ����� ���� �������� �ʱ� ������ �ٽô� ����� �� ���� (��ȸ��)
//		kick(new Door() {
//			@Override
//			void kick() {
//				System.out.println("ưư�� �ݰ��� ���ſ��� ��½�� ���� �ʾҽ��ϴ�. ");
//			}
//			
//		});
//		
//		kick(new Ball("") {
//			@Override
//			void kick() {
//				System.out.println("�󱸰��� �߷� á���� �ָ� �������� �ʰ� �����⸸ �մϴ�. ");
//			}
//		});
		
		punch(new Sandbag() {
			void punch() {
				System.out.println("������� ���ſ��� �ȹзȽ��ϴ�. ");
			}
		});
		
		punch(new Peoples() {
			void punch() {
				System.out.println("������� ġ�� �����Ͽ����ϴ�. ");
			}
		});
		
		// punch  �޼����� ���ڰ����� ������ �� �ִ�
		// �͸� Ŭ���� 2���� ���� ����Ŭ���� 2���� ���� �����غ�����
		
	}
	public static void punch(Punchable something) {
			something.punch();
	}


}

abstract class Punchable {
	abstract void punch();
}

class PunchMachine extends Punchable {
	
	String puncher;
	
	public PunchMachine(String puncher) {
		this.puncher = puncher;
	}
	
	@Override
	void punch() {
		if (puncher.equals("ȿ����")) {
			System.out.println("�ı����� �پ�ϴ�.");
		} else if (puncher.equals("�߱׸���")) {
			System.out.println("��ġ�� ��Ȯ�մϴ�.");
		}
	}
}

abstract class Kickable {
	abstract void kick();
}

class Ball extends Kickable {
	
	String kicker;
	
	public Ball(String kicker) {
		this.kicker = kicker;
	}
	
	@Override
	void kick() {
		if (kicker.equals("�޽�")) {
			System.out.println("���� ���ְ� á���ϴ�.");
		} else if (kicker.equals("�⼺��")) {
			System.out.println("�н��� ��Ȯ�ϰ� á���ϴ�.");
		}
	}
}



class Human extends Kickable {
	    @Override
		void kick() {
		System.out.println("����� �߷� �Ⱦ�á���ϴ�.");
	}
}

class VendingMachine extends Kickable {
	@Override
	void kick() {
		System.out.println("���Ǳ⸦ �Ⱦ�á���� ������� �ϳ� ���Խ��ϴ�.");
	}
}