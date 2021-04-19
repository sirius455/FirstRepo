package quiz;

import java.util.Scanner;

public class B14_prime {
	
	/*
	  	사용자로부터 숫자를 입력받으면
	  	1부터 입력 숫자 사이에 존재하는 소수를 모두출력해보세요
	  	
	  	※1과 자기 자신으로만 나누어 떨어지는 수
	  	 ex : 7, 11, 13, 17...
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력해주세요 : ");

		int input = sc.nextInt();
		
		for (int i = 2; i <= input; i++) {
			
			int cnt = 0;
			
			// 1과 자기자신을 제와하고 검사를 진행하면
			// cnt가 발생하자마자 소수가 아님을 알 수 있다.
			for(int j = 2; j <= Math.sqrt(i); ++j) {
				
				if(i % j == 0) {
					System.out.printf("검사하는 숫자 [%d]는 [%d]로 나누어 떨어졌습니다\n", i, j);
					System.out.println("소수가 아닙니다.");
					cnt++;
					break;
				}
			}
			System.out.printf("%d의 약수는 %d입니다.\n", i, cnt);
			
			if(cnt == 0) {
				System.out.println("\t소수입니다." + i);
			}
			
			System.out.println("-------------------------------------------");
								
		}
	}

}