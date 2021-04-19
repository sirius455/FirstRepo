package quiz;

import java.util.Scanner;

public class B17_CountAlphabet {
	
	/*
	   사용자로부터 문장을 하나 입력받고
	   해당 문장에 어떤 알파벳이 몇 번 등장했는지 세어서 모두 출력해보세요
	 (대소문자 구분없이 셀것) 
	  
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		System.out.print("문장을 입력해주세요 : ");
		
		String sentence = sc.nextLine();
		
		// # 문자열을 쉽게 대문자 또는 소문자로 변환하기
		sentence = sentence.toUpperCase();
		
		int[] count = new int[26];
		
		for (int i = 0; i < sentence.length(); ++ i) {
			
			char ch = sentence.charAt(i);
			
			if(ch >= 'A' && ch <= 'Z') {
			count[ch - 'A']++;
						
			System.out.println(ch);
		}
		}
		
	}
}
		
	

