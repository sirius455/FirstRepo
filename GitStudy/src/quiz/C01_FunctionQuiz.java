package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz {
	
	/*
	 	# 다음의 함수를 정의하고 올바르게 동작하는지 테스트해보세요
	 	
	 	 1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	 	 2. 전달한 숫자가 3의 배수이면 true를 반환, 아니며 false를 반환하는 함수
	 	 3. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
	 	 4. 숫자를 전달하면 해당 숫자의 약수를 모두  배열 형태로 반환하는 함수
	 	 5. 전달한 숫자가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	 	 6. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
	 	 	factorial: (n)*(n-1)*(n-2) ...3*2*1	 	
	 */	
	public static void main(String[] args) {
		
		System.out.println(word('1'));
		System.out.println(multiple(30));
		System.out.println(oddtoeven(0));
		System.out.println(prime_number(8));
		System.out.println(fact(5));
		System.out.println(Arrays.toString(findDivide(40)));
	}
	// 알파벳
	public static boolean word(char userword) {
		
		
		return ( userword >= 'A' &&  userword <= 'Z' || userword >= 'a' &&  userword <= 'z');
	}
	
	// 3의 배수
	public static boolean multiple(int usernum) {

		boolean result = true;

		if (usernum % 3 == 0) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}
	// 홀수짝수
	public static String oddtoeven(int usernum) {

		String result = " ";

		if (usernum % 2 == 0) {
			result = "짝수입니다";
		} else {
			result = "홀수입니다";
		}

		return result;
	}
	
	//배열
	public static int[] findDivide(int usernum) {

		boolean[] divide = new boolean[usernum];
		int count = 0;
		
		for (int i = 1; i <= usernum; i++) {
			
			if (usernum % i == 0) {
				divide[i - 1] = true;
				count++;
			}
		}
		
		int[] result = new int[count];
		int index = 0;
		for (int i = 0; i < divide.length; i++) {
			if(divide[i]) {
				result[index++] = i + 1;
			}
		}
		return result;
	}
	
	// 소수
	public static boolean prime_number(int usernum) {

		boolean result = true;
		

		for (int i = 2; i <= usernum; i++) {
			
			int cnt = 0;
			
			for(int j = 2; j <= Math.sqrt(i); ++j) {
				
				if(i % j == 0) {
					cnt++;
					break;
				}
			}
			
			if(cnt == 0) {
				result = true;
			} else {
				result = false;
			}
		}
		
		return result;
	}
	
	//팩토리얼
	public static int fact(int usernum) {
		
		if (usernum == 2) {
			return 2;
		}
		
		return usernum * fact(usernum - 1);
		
//		for (int i = usernum - 1; i > 0; i--) {
//			
//			if(i > 0 ) {
//				usernum *= i;
//			}
//		}
//		
//		return usernum;		
	}
	
}
