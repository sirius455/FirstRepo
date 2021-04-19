package quiz;

import java.util.Scanner;

public class B03_GuessAge {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("당신의 태어난 해를 입력해주세요 : ");
		
		int born_year = sc.nextInt();
		
		System.out.print("올해의 년도를 입력해주세요 : ");
		
		int now_year = sc.nextInt();
		
		System.out.print("당신의 나이는  " + (now_year - born_year) + "입니다.");
		
		
		
	}

}
