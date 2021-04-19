package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz_ex {

	/*
	 * # 다음의 함수를 정의하고 올바르게 동작하는지 테스트 해보세요
	 * 
	 * 1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	 * 
	 * 2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	 * 
	 * 3. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
	 * 
	 * 4. 숫자를 전달하면 해당 숫자의 모든 약수를 배열 형태로 반환하는 함수
	 * 
	 * 5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	 * 
	 * 6. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수 factorial: (n)*(n-1)*(n-2) ... 3*2*1
	 */
	public static boolean isAlpha(char ch) {
		return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
	}

	public static boolean is3Baesu(int num) {
		return num % 3 == 0;
	}

	public static String evenOdd(int num) {
		return num % 2 == 0 ? "짝수입니다" : "홀수입니다";
	}

// 모든 약수를 찾아서 배열로 만들어서 반환하면 성공!
	public static int[] findDivide(int num) {
		boolean[] divide = new boolean[num];
		int count = 0;

		for (int i = 1; i <= num; ++i) {
			if (num % i == 0) {
				divide[i - 1] = true;
				count++;
			}
		}

		int[] result = new int[count];
		int index = 0;

		for (int i = 0; i < divide.length; ++i) {
			if (divide[i]) {
				result[index++] = i + 1;
			}
		}

		return result;
	}

	public static boolean isPrime(int num) {
		double sqrt = Math.sqrt(num);

		for (int i = 2; i <= sqrt; ++i) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static int factorial(int num) {
		if (num == 2) {
			return 2;
		}

		return num * factorial(num - 1);
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(findDivide(100)));

		System.out.println(factorial(11));

	}

}