package quiz;

import java.util.Scanner;

public class B11_is_coutain_alpha {

	/*
	  	사용자가 입력한 문자열에 
	  	알파벳이 포함되어 있으면 true를 출력, 없으면 false를 출력
	  
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열를 입력해주세요 : ");

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
