package quiz;

import java.util.Scanner;

public class B07_CheckWord {
	
	public static void main(String[] args) {
		
		/*
		  
		  사용자로부터 단어를 하나 입력받고
		  첫 번째 글자와 마지막 번째 글자가 일치하면  "OK"를 출력
		  아니라면  "NOT OK"를 출력해보세요
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단어를 입력해 주세요 : ");
		
		// next() :  다음 단어를 String타입으로 받아오기(공백기준, \t)
		// apple banana orange = apple만 가저옴
		
		// nextLine() : 다음 한 줄의 String타입으로 받아오기 (\n기준)
		// i love you \n i hate you = i love you만 가저옴
		
		String word = sc.next();
		
		int lastIndex = word.length()-1;
		
		if (word.charAt(0) == word.charAt(lastIndex)) {
			System.out.println("OK");
		} else {
			System.out.println("NOT OK");
		}
		
		
	}

}