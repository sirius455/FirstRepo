package quiz;

import java.util.Scanner;

public class B06_AppleQuiz {
	
	public static void main(String[] args) {
	
		/*
		  사과를 10개씩 담을 수 있는 바구니가 있다
		  
		  사용자가 구매하고 싶은 사과의 개수를 입력하면 
		  사과를 모두 담기 위해 필요한 바구니의 개수를 알려주는 프로그램을 만들어보세요
		
		 */
		
		Scanner sc = new Scanner(System.in);
		
		/*
		  
		  double apple = sc.nextDouble();

		if (apple > 9) {
			System.out.println("필요한 바구니의 개수는 " + (int)Math.ceil(apple / 10) + "개이다.");
		} else if (apple > 0) {
			System.out.println("필요한 바구니의 개수는 1개이다.");
		} else if (apple <= 0) {
			System.out.println("필요한 바구니의 개수는 0개이다.");
	    }
	    
	    */
		
		int apple2;
		int size = 10;
		
		System.out.print("구매하고 싶은 사과의 개수 >> ");
		apple2 = sc.nextInt();
		
		if (apple2 < 0) {
			System.out.println("잘못된 개수를 입력하셧습니다. ");
		}
		
		System.out.println("필요한 바구니의 개수 : " + (int)Math.ceil(apple2 /(double)size));
 
	}	
}