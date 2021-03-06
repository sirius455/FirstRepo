package study;

public class B11_For {
	
	public static void main(String[] args) {
		
		/*
		 	# 반복문 (Loop)
		 		- for, while, do-while(X) ...
		 		-똑같은 코드를 여러번 반복하고 싶을 때 사용한다
		 		
		 		
		 		for (초기화; 조건; 증가값){
		 			가운데 있는 조건인 true인 동안 반복될 명령어들은 적는 곳
		 			조건에 true를 넣으면 영원히 반복된다.
		 		}
		 		
		 		
		 
		 */
		
		System.out.println("hello, world!");
		/* 1. 가장 기본적인 형태의 for문이다
		 - 원하는 횟수만큼 반복하기 가장 좋은 형태의 for문
		 - 초기값에는 0을 주고, 조건에는 반복하고 싶은 횟수를 적으면 된다.
		 - 증가는 1씩 한다
		 */
		
		for (int i = 0; i < 1; ++i) {
			System.out.println("hello, world! " + i);
		}
		
		// 2. 초기값. 증가값. 조건은 마음대로 변경할 수 있다
		for (int i = 70; i <= 555; i +=10) {
			System.out.println(i);
		}
		
		for (int i = 9000; i > 0; i -= 100) {
			System.out.println("2번째 반복문: " + i);
		}
		
		// 3. 초기값과 증가값의 위치는 마음대로 변경할 수 있다
		int x = 0;
		
		for (; x < 10; ) {
			System.out.println("3번째 반복문: " +  x++);
		}
		
		// ※ 변수는 자신이 속환 중괄호를 벗어나면 죽는다 (변수의 생명주기)
		
		// 4. 반복문 내부에 다른 문법들도 자유롭게 사용할 수 있다
		for (int month = 1; month <=12; ++month) {
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
			
			
			System.out.printf("%2d월은 [%s]입니다.\n", month, season);
		}
		
		// 5. for문은 조건을 비워놓으면 무한반복한다
		// -반복문은 원하는 타이밍에 break문을 통해 탈출할 수 있다.
		int count = 0;
		
		for(;;) {
			System.out.println("hello!" + count++);
			
			if(count == 7) {
			break;
		    }
	    }
		
		// 6. 반복문 내부에서 continue를 만나면 바로 다음번 반복으로 넘어간다
		for (int i = 1; i <= 50; ++i) {
			System.out.printf("%2d ", i);
			
			if ( i % 10 != 0)
			continue;
			
			System.out.println();
		}
		
		// 연습문제 : continue를 이용하여 5천부터 100사이에 존재하는 홀수만 출력해보세요
		
		for ( int i = 5000; i >= 100; --i) {
			
			
			if ( i % 2 == 0)
			continue;
			
			System.out.println(i);
		}
		
		/*
		  
		   	7. 반복문으로 총합 구하기
		  		
		  	(1) 반복문 바깥쪽에 총합을 저장할 변수를 하나 선언하고 0으로 초기화 해둔다
		  	(2) 반복문을 진행하면서 해당 변수에 값을 누적시킨다
		  
		 */
		
		// ex: 80부터 333사이의 3의 배수의 총합을 구해보기
		int sum = 0;
		
		for(int i = 80; i <= 333; ++i) {
			
			if(i % 3 == 0) {
				sum += i;
			}
		}
		
		System.out.println("80부터 333사이의 3의 배수 총합: " + sum);
	 }	
 }
