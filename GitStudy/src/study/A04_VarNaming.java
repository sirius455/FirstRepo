package study;

public class A04_VarNaming {
	
public static void main(String[] args) {
		
		/*
		  	#�츮�� ������ ����ؾ� �ϴ� ����
			1. ���� �ѹ��� ������ �� �ִ�.
				- ���� ������ ã�ƴٴϸ鼭 ������ �ʿ䰡 ����.
			2. ���� �ǹ̸� �ο��� �� �ִ�.
				- ������ �̸��� ���ؼ� �ش� ���� �뵵�� ���� ������ �ľ��� �� �ִ�.
				- ������ �̸��� �� ���°��� �ſ� �߿��ϴ�.
		  	
		 */
		
		int apple_count = 15;
		int apple_price = 493;
		final int apple_calorie = 110;
		int apple_gram = 50;
		
		System.out.println("����� ���� : " +apple_count);
		System.out.println("����� �� ���� : " +apple_count * apple_price + "��");
		System.out.println("����� ���� Į�θ� : " +apple_calorie+ "kcal");
		System.out.println("����� �� Į�θ� : " +apple_count * apple_calorie + "kcal");
		System.out.println("����� ���� ���� : " +apple_gram+"g");
		System.out.println("����� �� ���� : " +apple_gram*apple_count+"g");
		
		/*
		  
		  	#���� �۸� ��Ģ(�������)
		  	
		  	(1) �� �ܾ� �̻��� �̾���� �������� ����� �� _�� Ȱ���Ѵ�(snake_case)
		  		ex : apple_count, minsu_age, sujin_grade
		  		
		  	(2) �� �ܾ� �̻��� �̾���� �������� ����� �� �빮�ڸ� Ȱ���Ѵ� (camelCase)
		  		ex : appleCount, minsuAge, sujinGrade
		  	
		  	(3) ������ ù ���ڴ� �ҹ��ڸ� ����Ѵ�
		  	
		  	(4) Ŭ������ ù ���ڴ� �빮�ڸ� ����Ѵ�
		  	
		  	(5) ���α׷� ������ ���� ������ ���� ����(���) ��� �빮�ڸ� ����Ѵ�
		  		ex : APPLE_PRICE, APPLE_GRAM
		  	
		  	(6) ������ ����ִ� ���� ������ �� �ִ� ������ �ܾ �������
		  	
		  	#���� �۸� ��Ģ(�ʼ�)
		  	
		  	(1) ������ ù ��° ���ڴ� ���ڰ� �� �� ����.
		  		ex : 1st, 2nd, 4apple
		  		
		  	(2) ������ ���̿��� ������ ����� �� ����,
		  	
		  	(3) Ư�����ڴ� _�� $�� ����� �� �ִ�
		  	
		  	(4) �̹� �ڹٿ��� ����ϰ� �ִ� Ű����� ���������� ����� �� ����
		  		(Eclipse������ �̹� ����ϰ� �ִ� Ű���带 ��������� �ش�)
		  		ex : int, float, long, final, public, static, void...
		  		
		 */
		
		
	}

}
