package quiz;

import java.util.Scanner;

public class B11_ForBasicQuiz {

	/*
	 * ����ڰ� ���ڸ� �Է����� ��
	 * 
	 * 1. 10���� �Է��� ���ڱ����� �� ���� ���غ�����
	 * 
	 * 2. 1���� �Է��� ���� ������ 5�� ����� ��� ����غ�����
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���ڸ� �Է����ּ��� : ");

		int num = sc.nextInt();

		int sum = 0;
		int start1 = 10, start2 = 1;
		int tem;
		int sum2 = 0;
		
		if (start1 > num) {

			tem = start1;
			start1 = num;
			num = tem;
		}

		for (int i = start1; i <= num; ++i) {
			sum += i;
		}

		System.out.printf("�Է��Ͻ� ���� ������ ���� %d�Դϴ�.", sum);

		System.out.println();
		System.out.println();

		System.out.print("���ڸ� �Է����ּ��� : ");

		int num2 = sc.nextInt();

		if (start2 > num2) {

			tem = start2;
			start2 = num2;
			num2 = tem;
		}

		for (int i = start2; i <= num2; ++i) {
			if (i % 5 == 0) {
				sum2 += i;
			}
		}
		System.out.println(sum2);
	}
}
