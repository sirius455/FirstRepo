package quiz;

import java.util.Scanner;

public class B15_Count369 {
	
	/*
	  	사용자로부터 정수를 하나 입력받고
	  	해당 숫자까지 369 게임이 진행된다면 박수를 총 몇번 쳐야하는지 세어보세요.
	  
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력해주세요 : ");

		int num = sc.nextInt();
		
		//1. 문자열로 풀기
		
		// 정수를 문자열로 바꾸는 방법들
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
		
		System.out.println("총 박수 횟수는 : " + cnt + "회");
		
		// 2. 정수로 풀기
		
		int input = sc.nextInt();
		
		for(int i = 0; i <= input; ++i) {
			
			// 3455
						
			
		}
		
		int testValue = 3455;
		
		System.out.println(testValue/1000);
		
	}
}

