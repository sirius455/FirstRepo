package quiz;

import java.util.Scanner;

public class B11_is_coutain_alpha {

	/*
	  	����ڰ� �Է��� ���ڿ��� 
	  	���ĺ��� ���ԵǾ� ������ true�� ���, ������ false�� ���
	  
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ��� �Է����ּ��� : ");

		String str = sc.nextLine();
		
	
		char num;
		boolean ans = false;
			
		for (int i = 0; i < str.length(); i++) {
			num = str.charAt(i);
				
		if ((num >= 'A' && num <= 'z')) {
			ans = true;
			}
		}
			
		System.out.println(ans);
		
	}
}
