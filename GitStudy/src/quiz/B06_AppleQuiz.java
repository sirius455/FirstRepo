package quiz;

import java.util.Scanner;

public class B06_AppleQuiz {
	
	public static void main(String[] args) {
	
		/*
		  ����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�
		  
		  ����ڰ� �����ϰ� ���� ����� ������ �Է��ϸ� 
		  ����� ��� ��� ���� �ʿ��� �ٱ����� ������ �˷��ִ� ���α׷��� ��������
		
		 */
		
		Scanner sc = new Scanner(System.in);
		
		/*
		  
		  double apple = sc.nextDouble();

		if (apple > 9) {
			System.out.println("�ʿ��� �ٱ����� ������ " + (int)Math.ceil(apple / 10) + "���̴�.");
		} else if (apple > 0) {
			System.out.println("�ʿ��� �ٱ����� ������ 1���̴�.");
		} else if (apple <= 0) {
			System.out.println("�ʿ��� �ٱ����� ������ 0���̴�.");
	    }
	    
	    */
		
		int apple2;
		int size = 10;
		
		System.out.print("�����ϰ� ���� ����� ���� >> ");
		apple2 = sc.nextInt();
		
		if (apple2 < 0) {
			System.out.println("�߸��� ������ �Է��ϼ˽��ϴ�. ");
		}
		
		System.out.println("�ʿ��� �ٱ����� ���� : " + (int)Math.ceil(apple2 /(double)size));
 
	}	
}