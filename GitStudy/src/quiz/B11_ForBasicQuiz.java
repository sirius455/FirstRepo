package quiz;

import java.util.Scanner;

public class B11_ForBasicQuiz {

	/*
	 * 사용자가 숫자를 입력했을 때
	 * 
	 * 1. 10부터 입력한 숫자까지의 총 합을 구해보세요
	 * 
	 * 2. 1부터 입력한 숫자 사이의 5의 배수만 모두 출력해보세요
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력해주세요 : ");

		int num = sc.nextInt();

		int sum = 0;
		int start1 = 10, start2 = 1;
		int tem;
		int sum2 = 0;
		
		if (start1 > num) {

			tem = start1;
			start1 = num;
			num = tem;
		}

		for (int i = start1; i <= num; ++i) {
			sum += i;
		}

		System.out.printf("입력하신 숫자 까지의 합은 %d입니다.", sum);

		System.out.println();
		System.out.println();

		System.out.print("숫자를 입력해주세요 : ");

		int num2 = sc.nextInt();

		if (start2 > num2) {

			tem = start2;
			start2 = num2;
			num2 = tem;
		}

		for (int i = start2; i <= num2; ++i) {
			if (i % 5 == 0) {
				sum2 += i;
			}
		}
		System.out.println(sum2);
	}
}
