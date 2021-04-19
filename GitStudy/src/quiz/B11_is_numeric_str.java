package quiz;

import java.util.Scanner;

public class B11_is_numeric_str {
	
	/*
	 	입력받은 문자열에 숫자만 포함되어 있으면 1을 출력
	 	다른 문자가 포함되어 있다면 0을 출력
	  
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열를 입력해주세요 : ");

		String str = sc.nextLine();
		
		char num;
		char ans = '1';
		
		for(int i = 0; i < str.length(); i++) {
			num = str.charAt(i);
			
			if(!('0' <= num && num <= '9')) {
				ans = '0';
			}
		}
		
		System.out.println("숫자만 포함되어 있는가? : " + ans);
	}
	
}
