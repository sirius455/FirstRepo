package quiz;

import java.util.Scanner;

public class B11_is_numeric_str {
	
	/*
	 	�Է¹��� ���ڿ��� ���ڸ� ���ԵǾ� ������ 1�� ���
	 	�ٸ� ���ڰ� ���ԵǾ� �ִٸ� 0�� ���
	  
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ��� �Է����ּ��� : ");

		String str = sc.nextLine();
		
		char num;
		char ans = '1';
		
		for(int i = 0; i < str.length(); i++) {
			num = str.charAt(i);
			
			if(!('0' <= num && num <= '9')) {
				ans = '0';
			}
		}
		
		System.out.println("���ڸ� ���ԵǾ� �ִ°�? : " + ans);
	}
	
}
