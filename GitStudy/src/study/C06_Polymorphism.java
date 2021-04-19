package study;
import java.util.Scanner;

public class C06_Polymorphism {
	
	/*
	  	# ��ü�� ������
	  	
	  	 - ��ü�� �پ��� ���¸� ���� �� �ִ�
	  	 - ����� ����̱⵵ �ϰ� �����̱⵵ �ϴ�
	  	 - ������ ���������� ����� �ƴϴ�
	  	 
	  	 # �ڽ� Ŭ������ �θ� Ŭ������ �� �� �ִ� (��ĳ����)
	  	 
	  	  - �ڽ� Ŭ���� Ÿ���� �θ� Ŭ���� Ÿ���� �Ǵ� ���� ��ĳ�����̶�� �Ѵ�.
	  	  - ��ĳ���õ� ��ü�� �ڽ� Ŭ�������� �����ϴ� �͵��� ��� �ؾ������
	  	  - �������̵�µ� �޼���� �ڽ� Ŭ�������� ������ ������ ����ȴ�.
	  	  	  	 
	  	 # �θ� Ŭ������ �ڽ� Ŭ������ �� �� ����. (�ٿ� ĳ����)
	  	 
	  	  - ������ ���������� ��ĳ���� �Ǿ��� �ν��Ͻ��� �ٽ� ���� Ÿ�������� 
	  	  	�ٿ� ĳ������ �����ϴ�
	  	  
	 */
	
	public static void main(String[] args) {
		new Food(new PigMeat(), new vege(), new Balsamic());
		
		
		Scanner sc = new Scanner(System.in);
		
		MainMaterial main_mat = new MainMaterial();
		
		MainMaterial main_mat2 = new Meat();
		
		doSomethingWithMainMaterial(new MainMaterial());
		doSomethingWithMainMaterial(new Meat());
		doSomethingWithMainMaterial(new Fish());
		doSomethingWithMainMaterial(new PigMeat());
		
		new Car(new Tire());
		new Car(new TireVer1());
		new Car(new TireVer2());
		
		System.out.println(new Fish().a);
		
		police police = new police();
		police.sayHi();
		police.arrest("�谭��");
		
		
		// person���� ��ĳ���� �� police�� ü���� �� �� ����
		person person = police;
		person person2 = new person("����ġ", 20, 30);
		//person.arrest();
		person.sayHi();
		
		//�ٿ� ĳ������ Ȱ���� ���� ��� �ٽ� ����ϱ�
		
		// ���� �����̿��� �ν��Ͻ��� �ٿ� ĳ������ ����
		((police) person).arrest("��Ҹ�"); 
		// ������ �ƴϿ��� �ν��Ͻ��� �ٿ�ĳ������ �Ұ���
		//((police) person2).arrest("�赵��");
		
	}
	
	//���������� ���ϰ� �ϱ� ���ؼ�
	public static void doSomethingWithMainMaterial(MainMaterial mat) {
		
	}
	
}

class Car {
	Tire tire;
	
	public Car(Tire tire) {
		this.tire =tire;
	}
}

class Tire {}

class Tire2 {}

class TireVer1 extends Tire {}
class TireVer2 extends Tire {}

class Food {
	
	MainMaterial mainMat;
	SubMaterial subMat;
	Sauce sauce;
	
	public Food(MainMaterial mainMat, SubMaterial subMat, Sauce sauce) {
		this.mainMat =  mainMat;
		this.subMat =  subMat;
		this.sauce =  sauce;
	} 
 	
}

class PorkCutlet {
	
	public PorkCutlet(PigMeat pig, SubMaterial subMat, Sauce sauce) {
	
	}
}
// ���� ���� �θ� Ŭ���� (�����, �����, �ҽ�)
class MainMaterial{
	
	static int a = 10;
	
}	
class SubMaterial{}
class Sauce{}

// ����Ḧ ��ӹ��� Ŭ������
class Fish extends MainMaterial {}
class Meat extends MainMaterial {}
class PigMeat extends Meat {}

// ����Ḧ ��ӹ��� Ŭ������ ��ӹ��� Ŭ����
class vege extends SubMaterial {}
class Fruit extends SubMaterial {}

// �ҽ��� ��ӹ��� Ŭ������
class Salsa extends Sauce {}
class Balsamic extends Sauce {}
