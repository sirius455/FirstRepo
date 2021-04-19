package quiz;

import java.util.Scanner;

public class B14_prime {
	
	/*
	  	����ڷκ��� ���ڸ� �Է¹�����
	  	1���� �Է� ���� ���̿� �����ϴ� �Ҽ��� �������غ�����
	  	
	  	��1�� �ڱ� �ڽ����θ� ������ �������� ��
	  	 ex : 7, 11, 13, 17...
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���ڸ� �Է����ּ��� : ");

		int input = sc.nextInt();
		
		for (int i = 2; i <= input; i++) {
			
			int cnt = 0;
			
			// 1�� �ڱ��ڽ��� �����ϰ� �˻縦 �����ϸ�
			// cnt�� �߻����ڸ��� �Ҽ��� �ƴ��� �� �� �ִ�.
			for(int j = 2; j <= Math.sqrt(i); ++j) {
				
				if(i % j == 0) {
					System.out.printf("�˻��ϴ� ���� [%d]�� [%d]�� ������ ���������ϴ�\n", i, j);
					System.out.println("�Ҽ��� �ƴմϴ�.");
					cnt++;
					break;
				}
			}
			System.out.printf("%d�� ����� %d�Դϴ�.\n", i, cnt);
			
			if(cnt == 0) {
				System.out.println("\t�Ҽ��Դϴ�." + i);
			}
			
			System.out.println("-------------------------------------------");
								
		}
	}

}