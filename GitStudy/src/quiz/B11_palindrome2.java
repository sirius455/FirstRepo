package quiz;

import java.util.Scanner;

public class B11_palindrome2 {

	/*
	 * 사용자로부터 단어를 하나 입력받고 해당 단어가 회문이라면 "PALINDROME"을 출력 회문이 아니라면 "NOT PALINDROME"을
	 * 출력해보세요
	 * 
	 * 회문? MON. BOB같은 좌우대칭인 단어
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력해 주세요 > ");
		String str = sc.nextLine();
		
		boolean palindrome = true;
		
		for (int i = 0, j = str.length()- 1; i < str.length() / 2; ++i, --j ) {
			
			//System.out.printf("'%c' VS '%c'\n", word.charAt(i), word.charAt(j));
			
			if (str.charAt(i) != str.charAt(j)) {
				palindrome = false;
				break;
			}
			
		}
		System.out.println(palindrome ? "회문입니다." : "회문이 아닙니다.");
	}
}
