package quiz;

import java.util.Scanner;

public class B08_MonthToSeason {
	
	/*
	 	사용자로부터 달을 입력받으면 해당하는 계절을 출력해보세요
	 	(switch-case문을 이용)
	  
	  
	 */
	
	public static void main(String[] args) {
		
		Scanner word = new Scanner(System.in);
		
		System.out.print("몇월달 인지 입력해주세요 : ");
		
		int month = word.nextInt();
		String season;
		
		
		switch(month) {
		case 11: case 12: case 1: case 2:
			season = "겨울";
			break;
		case 3: case 4: case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10:
			season = "가을";
			break;	
		default:
			season = "잘못된 계절";
			break;
		}	
		
		System.out.printf("%d월은 [%s]입니다.\n", month, season);
			
//		switch(month) {
//		case 11: case 12: case 1: case 2:
//			System.out.print("겨울입니다.");
//			break;
//		case 3: case 4: case 5:
//			System.out.print("봄입니다.");
//			break;
//		case 6: case 7: case 8:
//			System.out.print("여름입니다.");
//			break;
//		case 9: case 10:
//			System.out.print("가을입니다.");
//			break;	
//		default:
//			System.out.println("잘못된 입력입니다.");
//			break;
//		}
	
		
	}

}