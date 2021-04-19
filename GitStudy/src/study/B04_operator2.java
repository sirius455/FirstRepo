package study;

public class B04_operator2 {
	
	public static void main(String[] args) {
		
		/* 
		  
		 # 비교 연산자
		 - 비교 연산의 결과는 참 또는 거짓이다 (boolean 타입이다)
		 - 산술 연산과 비교연산이 함께 있으면 산술 연산을 먼저 계산한다
		 
		*/
		
		int a = 8, b = 5;
		
		System.out.printf("a= %d, b = %d 일 때\n", a, b);
		System.out.println("a > b : " + (a > b));
		System.out.println("a < b : " + (a < b));
		System.out.println("a >= b : " + (a >= b));
		System.out.println("a <= b : " + (a <= b));
		
		System.out.println("a == b : " + (a == b)); // 두 값이 같으면 true
		System.out.println("a != b : " + (a != b)); // 두 값이 다르면 true
		
		/*
		  #논리 연산자
		  
		  -boolean 타입 값으로 하는 연산
		  -&& : 양 옆의 값이 모두 true일 때만 true(AND)
		  -|| : 양 옆의 값 중 하나만 true여도 true (OR)
		  -!  : true면 false, false면 true (NOT)
		  
		 */
		
		System.out.println("\n----AND----");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("\n----OR----");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\n----NOT----");
		System.out.println(!true);
		System.out.println(!false);
		
		int x = 4, y = 5, z = 7;
		
		System.out.println(x > 5 && x % 3 ==0);
		System.out.println("3개의 배수가 모두 3의 배수면 통과 : "
				+ (x % 3 ==0 && y % 3 == 0 && z% 3 ==0));
		
		
	
		System.out.println("3개의 모두 3의배수가 아닐때 : "
				+ (x % 3 !=0 && y % 3 != 0 && z% 3 !=0));
	}

}
