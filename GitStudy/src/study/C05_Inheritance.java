package study;

	public class C05_Inheritance {
	/*
	  	# Ŭ���� ���
	  	
	  	- �̹� �����ϴ� Ŭ������ �״�� �����޾Ƽ� ����ϰų� ���ļ� ����ϴ� ��
	  	- ������ִ� Ŭ������ �θ� Ŭ���� �Ǵ� ����Ŭ������� �Ѵ�.
	  	- ��ӹ޴� Ŭ������ �ڽ� Ŭ���� �Ǵ� ���� Ŭ������� �Ѵ�.
	  		  
	 */
 
	public static void main(String[] args) {
		person[] persons = new person[3];
		
		persons[0] = new person("ȫ�浿", 10, 10);
		persons[1] = new person("��浿", 45, 15);
		persons[2] = new person("�̱浿", 30, 12);
		
		persons[0].sayHi();
		persons[1].sayHi();
		persons[2].sayHi();
		
		//�θ� Ŭ�������� ������� ����� �����Ӱ� ����� �� �ִ�.
		police police1 = new police();
		
		police1.sayHi();
		police1.walk();
		police1.run();
		
		police1.thisSuperTest("�Ѹ�");
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
				System.out.printf("�ȳ� ! ���̸��� %s�̰�. ���̴� %d�̾�.\n", name, age);
			} else if(age <= 20) {
				System.out.printf("�ȳ�ʴϱ� ! ���̸��� %s�̰�. ���̴� %d�Դϴ�.\n", name, age);
			} else {
				System.out.printf("�ȳ��ϼ��� ! ���̸��� %s�̰��. ���̴� %d�� �Դϴ�.\n", name, age);
			}
			
		}
		
		void walk() {
			System.out.printf("%s����  %d���� �ɾ����ϴ�.\n", name, speed / 2);
		}
		
		void run() {
			System.out.printf("%s���� %d���� �پ����ϴ�.\n", name, speed);
		}
	
}		
	/*
	  	1. ��ӹ��� Ŭ������ �����ڿ��� ���� ���� �θ��� �����ڸ� ȣ���ؾ� �Ѵ�.
	  	      �θ� Ŭ������ �⺻�����ڰ� �����ϸ� ������ �� ������,
	  	      �������� �������� ������ �Ұ����ϴ�
	  	      
	  	2. �ڽ� Ŭ������ �θ��� �ż��带 ������� ���ļ� ����� �� �ִ� (�������̵�, override)
	  	
	  	3. �θ� Ŭ������ �ڽ� Ŭ������ �Ȱ��� �̸��� ���� �ڿ��� �ִ� ���
	  	   super�� this�� ��Ȯ�ϰ� ������ �� �ִ�.
	 */
	
	class police extends person{
		String name = "������";
		//�ڽ� Ŭ������ �����ڴ� ù �ٿ��� super()�� �ݵ�� ȣ���ؾ� �Ѵ�.(�ʼ�)
		police() {
			super("�����",23,20);
			
			//super() : �θ� Ŭ������ �����ڸ� �����Ų��
		}
		
		@Override// superŬ������ �����ڰ� ������� ���޼����� ������ �Ⱦ��� ���ο�� ������ٰ� �����ϰԵ�.
		void sayHi() {
			System.out.printf("�ȳ��Ͻʴϱ�! ���� %s�����Դϴ�.\n", name);
		}
		
		void thisSuperTest(String name) {
			System.out.println("�׳� name: " + name);
			System.out.println("this.name: " + this.name);
			System.out.println("super.name: " + super.name);
			
		}
		
		void arrest(String suspect) {
			System.out.printf("%s ����� ������  %s���� ü���߽��ϴ�.\n", name, suspect);
		}
}

class Programmer extends person {
	// �ڽ� Ŭ�������� �����ڸ� �������� ���� �� ������ �Ⱥ�������
	// �ڽ�Ŭ�������� ���� �����ڰ� ����� �θ� Ŭ������ �⺻ �����ڸ� ����Ѵ�
}
	