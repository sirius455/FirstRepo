package quiz;

/*
	�� ���ڸ� �Է� �ް� �� ������ �ִ� ������� ���غ�����
	
	�� �ִ����� : �� ������ ����� �� ���� ū �����
	�μ��ڸ� ���� ����� �ִ¼�
*/

import java.util.Scanner;

public class B14_GCD {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���ڸ� �Է����ּ��� : ");

		int num1 = sc.nextInt();
		
		System.out.print("���ڸ� �Է����ּ��� : ");
		
		int num2 = sc.nextInt();
		
		int GDC = 0;

		for (int i = 1; i <= num1 && i <= num2; i++) {
			
			if (num1 % i == 0 && num2 % i ==0) {
				GDC = i;
			}			
		}
		
		System.out.println("�μ��� �ִ�����" + GDC);
	}
}
