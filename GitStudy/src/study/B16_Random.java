package study;
import java.util.Random;

public class B16_Random {
	
	public static void main(String[] args) {
		
		/*
		  	# JAVA���� ������ ���� �����ϱ�
		  	
		  	1. math.random()
		  	
		  		-double Ÿ���� ���� �Ҽ��� �����Ѵ� 0 <= x < 1
		  		-�� ���� �Ҽ��� �̿��Ͽ� ���ϴ� ������ ���ڸ� ���� �� �ִ�
		  		
		  		*���ϴ� ������ ���ڸ� ����� ����(ex : 65 ~ 123)
		  		
		  		(1) ������ ���� �Ҽ��� ���ϴ� ������ ������ ���Ѵ�(31��)
		  			0*57 <= x < 1*57
		  		(2) ���ϴ� ���� �� ���� ���� ���ڸ� ���Ѵ� (30)
		  			030 <= x < 1*31+30
		  		(3) �Ҽ��� �Ʒ��� �����Ѵ�
		  			-> Math.floor() �Ǵ� int�� Ÿ�� ĳ����
		 */

//		for(int i = 0; i < 10; ++i) {
//			System.out.println((int)(Math.random() * 31 + 30));
//		}

		// ��������

		for (int i = 0; i < 7; ++i) {
			System.out.println((int) (Math.random() * 45 + 1));

			/*
			   2. Random Ŭ����
			   
			   - �� �� ���ϰ� ���� ���� ������ �� �ִ� ��ɵ��� ���ִ� Ŭ���� 
			   - ������ �� ���� �õ尡 �����ȴ�
			   - ���ϴ� ���� �õ带 ������ ���� �ִ�.
			 */
			
			// ���ο� ���� �õ� ����
			

		}
		
		Random ran = new Random();
		
		// #Random.nextInt(bound)
		// - 0 ~ bound �̸��� ������ ��ȯ�Ѵ�
		System.out.println(ran.nextInt(45) + 1); // 1 ~ 45�� ���� ����
		System.out.println(ran.nextInt(41) + 30); // 30 ~ 70�� ��������
		System.out.println(ran.nextInt());
		System.out.println(ran.nextInt());
		System.out.println(ran.nextInt());
		
	
		
		// # Random.nextBoolean()
		// - Random Ŭ������ ���ϴ� Ÿ���� ���� ���� ���� ���� �� �ִ�
		System.out.println(ran.nextBoolean() ? "��" : "��");
		
	}
}