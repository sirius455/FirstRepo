package quiz;

/*
	두 숫자를 입력 받고 두 숫자의 최대 공약수를 구해보세요
	
	※ 최대공약수 : 두 숫자의 공약수 중 가장 큰 공약수
	두숫자를 전부 나룰수 있는수
*/

import java.util.Scanner;

public class B14_GCD {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력해주세요 : ");

		int num1 = sc.nextInt();
		
		System.out.print("숫자를 입력해주세요 : ");
		
		int num2 = sc.nextInt();
		
		int GDC = 0;

		for (int i = 1; i <= num1 && i <= num2; i++) {
			
			if (num1 % i == 0 && num2 % i ==0) {
				GDC = i;
			}			
		}
		
		System.out.println("두수의 최대공약수" + GDC);
	}
}
