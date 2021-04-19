package study;

	public class C05_Inheritance {
	/*
	  	# 클래스 상속
	  	
	  	- 이미 존재하는 클래스를 그대로 물려받아서 사용하거나 고쳐서 사용하는 것
	  	- 상속해주는 클래스를 부모 클래스 또는 슈퍼클래스라고 한다.
	  	- 상속받는 클래스를 자식 클래스 또는 서브 클래스라고 한다.
	  		  
	 */
 
	public static void main(String[] args) {
		person[] persons = new person[3];
		
		persons[0] = new person("홍길동", 10, 10);
		persons[1] = new person("고길동", 45, 15);
		persons[2] = new person("이길동", 30, 12);
		
		persons[0].sayHi();
		persons[1].sayHi();
		persons[2].sayHi();
		
		//부모 클래스에서 만들었던 기능을 자유롭게 사용할 수 있다.
		police police1 = new police();
		
		police1.sayHi();
		police1.walk();
		police1.run();
		
		police1.thisSuperTest("둘리");
	}
}	
	
class person {
		String name;
		int age;
		int speed;
		
		public person() {};
		
		public person(String name, int age, int speed) {
			this.name = name;
			this.age = age;
			this.speed = speed;
		}
			
		void sayHi() {
			if(age <= 0) {
				System.out.printf("?\n");
			} else if(age <= 10) {
				System.out.printf("안녕 ! 내이름은 %s이고. 나이는 %d이야.\n", name, age);
			} else if(age <= 20) {
				System.out.printf("안녕십니까 ! 제이름은 %s이고. 나이는 %d입니다.\n", name, age);
			} else {
				System.out.printf("안녕하세요 ! 제이름은 %s이고요. 나이는 %d살 입니다.\n", name, age);
			}
			
		}
		
		void walk() {
			System.out.printf("%s씨는  %d미터 걸었습니다.\n", name, speed / 2);
		}
		
		void run() {
			System.out.printf("%s씨는 %d미터 뛰었습니다.\n", name, speed);
		}
	
}		
	/*
	  	1. 상속받은 클래스는 생성자에서 가장 먼저 부모의 생성자를 호출해야 한다.
	  	      부모 클래스에 기본생성자가 존재하면 생략할 수 있지만,
	  	      존재하지 않을때는 생략이 불가능하다
	  	      
	  	2. 자식 클래스는 부모의 매서드를 마음대로 고쳐서 사용할 수 있다 (오버라이드, override)
	  	
	  	3. 부모 클래스와 자식 클래스에 똑같은 이름을 가진 자원이 있는 경우
	  	   super와 this로 정확하게 구분할 수 있다.
	 */
	
	class police extends person{
		String name = "마동석";
		//자식 클래스의 생성자는 첫 줄에서 super()를 반드시 호출해야 한다.(필수)
		police() {
			super("김경찰",23,20);
			
			//super() : 부모 클래스의 생성자를 실행시킨다
		}
		
		@Override// super클래스에 생성자가 사라지면 경고메세지를 보내줌 안쓰면 새로운걸 생성됬다고 생각하게됨.
		void sayHi() {
			System.out.printf("안녕하십니까! 저는 %s형사입니다.\n", name);
		}
		
		void thisSuperTest(String name) {
			System.out.println("그냥 name: " + name);
			System.out.println("this.name: " + this.name);
			System.out.println("super.name: " + super.name);
			
		}
		
		void arrest(String suspect) {
			System.out.printf("%s 형사는 용의자  %s씨를 체포했습니다.\n", name, suspect);
		}
}

class Programmer extends person {
	// 자식 클래스에서 생성자를 정의하지 않을 시 눈에는 안보이지만
	// 자식클래스에도 지본 생성자가 생기고 부모 클래스의 기본 생성자를 사용한다
}
	