package study;

public class C11_AnonymousInnerClass {
	
	/*
	  	# 익명 내부 클래스
	  	
	  	  - 클래스에 이름을 짓지 않고 구현한 다음 바로 사용하는 방식
	  	  - 일회용이다
	  
	 */
	
	public static void kick(Kickable something) {
		something.kick();
	}
	
	public static void main(String[] args) {
//		kick(new Human());
//		kick(new VendingMachine());
//		kick(new Ball("메시"));
//		kick(new Ball("기성용"));
		punch(new PunchMachine("효도르"));
		
		//지역 내부 클래스
		class Door extends Kickable {
			
			boolean open;
			
			void kick() {
				if(open) { 
					System.out.println("문짝을 발로 차서 닫았습니다.");
					open = false;
				} else {
					System.out.println("문짝을 발로 차서 열었습니다.");
					open = true;
				}
			}
			
		}
		
		class Sandbag extends Punchable {
			
			boolean push;
			
			void punch() {
				if(push) { 
					System.out.println("샌드백이 살짝 밀려났습니다.");
					push = false;
				} else {
					System.out.println("샌드백이 크게 밀려났습니다.");
					push = true;
				}
			}
			
		}
		
		class Peoples extends Punchable {
			
			boolean hit;
			
			void punch() {
				if(hit) { 
					System.out.println("사람들을 쳐서 체포되었습니다.");
					hit = false;
				} else {
					System.out.println("사람들을 쳐서 도망쳤습니다.");
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
		
		// # 익명 클래스(즉석에서 Door를 상속한 인스턴스를 생성)
		// - 만들고 따로 저장하지 않기 때문에 다시는 사용할 수 없다 (일회용)
//		kick(new Door() {
//			@Override
//			void kick() {
//				System.out.println("튼튼한 금고문이 무거워서 꿈쩍도 하지 않았습니다. ");
//			}
//			
//		});
//		
//		kick(new Ball("") {
//			@Override
//			void kick() {
//				System.out.println("농구공을 발로 찼더니 멀리 나가지는 않고 아프기만 합니다. ");
//			}
//		});
		
		punch(new Sandbag() {
			void punch() {
				System.out.println("샌드백이 무거워서 안밀렸습니다. ");
			}
		});
		
		punch(new Peoples() {
			void punch() {
				System.out.println("사람들을 치고 합의하였습니다. ");
			}
		});
		
		// punch  메서드의 인자값으로 전달할 수 있는
		// 익명 클래스 2개와 지역 내부클래스 2개를 만들어서 전달해보세요
		
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
		if (puncher.equals("효도르")) {
			System.out.println("파괴력이 뛰어납니다.");
		} else if (puncher.equals("멕그리거")) {
			System.out.println("펀치가 정확합니다.");
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
		if (kicker.equals("메시")) {
			System.out.println("슛을 멋있게 찼습니다.");
		} else if (kicker.equals("기성용")) {
			System.out.println("패스를 정확하게 찼습니다.");
		}
	}
}



class Human extends Kickable {
	    @Override
		void kick() {
		System.out.println("사람을 발로 걷어찼습니다.");
	}
}

class VendingMachine extends Kickable {
	@Override
	void kick() {
		System.out.println("자판기를 걷어찼더니 음료수가 하나 나왔습니다.");
	}
}