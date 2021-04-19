package quiz;

public class B15_WhileBasicQuiz {

	/*
	 * while문을 이용하여
	 * 
	 * 1. 1부터 100까지의 3의 배수의 총합
	 * 
	 * 2. 200부터 1까지 출력
	 * 
	 * 3. continue를 이용하여 300 부터 500사이의 7의 배수만 출력
	 * 
	 * 4. 1부터 200까지의 숫자 중 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합
	 * 
	 */

	public static void main(String[] args) {

		int a = 0;
		int sum = 0;

		while (a++ <= 100) {

			if (a % 3 == 0) {
				sum += a;
			}
		}

		System.out.printf("1부터 100까지의 3의 배수의 총합은 [%d]입니다.\n", sum);

		int b = 200;

		while (b >= 1) {
			System.out.println(b--);
		}

		int c = 299;

		while (c++ <= 500) {

			if (c % 7 != 0) {
				continue;
			}
			System.out.println(c);
		}

		int d = 0;
		int sum2 = 0;

		while (d++ < 200) {

			if (d % 2 != 0 && d % 3 != 0) {

				sum2 += d;
			}

		}

		System.out.printf("1부터 200사이의 2의배수도 3의 배수도아닌것의 합은 [%d]입니다 ", sum2);

	}

}
