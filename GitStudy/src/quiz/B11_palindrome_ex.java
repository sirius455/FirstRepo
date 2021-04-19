package quiz;

import java.util.Scanner;

public class B11_palindrome_ex {
	
	/*
	 	사용자로부터 단어를 하나 입력받고
	 	해당 단어가 회문이라면 "PALINDROME"을 출력
	 	회문이 아니라면 "NOT PALINDROME"을 출력해보세요
	 	
	 	*회문? MON. BOB같은 좌우대칭인 단어
	 	
	 	*/
	
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.print("단어 >> ");

		String str = sc.next();
		String anw = "PALINDROME";
		
		
		for(int i = 0; i < str.length() / 2; ++i) {
			char word = str.charAt(i);
			char word2 = str.charAt(str.length() - i -1);
			
			if (word != word2){
				anw = "NOT PALINDROME";
			}
			
				
//			System.out.println("-------------------------");
//			System.out.println("이번에 검사할 문자 :" + word);
//			System.out.println("비교하게 되는 문자 :" + word2);
		}
		
		System.out.printf("[%s]의 결과는 %s입니다.\n", str, anw );
	}
}