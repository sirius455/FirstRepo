package quiz;

import java.util.Scanner;

public class B15_Count369 {
	
	/*
	  	����ڷκ��� ������ �ϳ� �Է¹ް�
	  	�ش� ���ڱ��� 369 ������ ����ȴٸ� �ڼ��� �� ��� �ľ��ϴ��� �������.
	  
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���ڸ� �Է����ּ��� : ");

		int num = sc.nextInt();
		
		//1. ���ڿ��� Ǯ��
		
		// ������ ���ڿ��� �ٲٴ� �����
//		System.out.println("hello : "+  123);
//		System.out.println(""+  123);
//		System.out.println(Integer.toString(123));
		
		int cnt = 0;
		
		for (int i = 1; i <= num; i++) {
			String num_str = "" + i;
			
			for (int j = 0; j < num_str.length(); ++j) {
				char num_ch = num_str.charAt(j);
				
				if (num_ch == '3' || num_ch == '6' || num_ch == '9') {
					cnt++;
				
				}
			}
			
		}
		
		System.out.println("�� �ڼ� Ƚ���� : " + cnt + "ȸ");
		
		// 2. ������ Ǯ��
		
		int input = sc.nextInt();
		
		for(int i = 0; i <= input; ++i) {
			
			// 3455
						
			
		}
		
		int testValue = 3455;
		
		System.out.println(testValue/1000);
		
	}
}

