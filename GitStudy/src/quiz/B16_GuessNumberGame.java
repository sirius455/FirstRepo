package quiz;

import java.util.Random;
import java.util.Scanner;

public class B16_GuessNumberGame {

	/*
	 * 게임이 시작되면 랜덤으로 4자리의 숫자가 선정된다.
	 * 
	 * 1.플레이어는 8번의 시도를 할수 있다
	 * 
	 * 2. 각 시도마다 4자리의 숫자를 입력하면 다음과 같이 알려준다. 숫자와 위치가 다 맞을경우 - Strike 숫자만 맞을경우 - ball
	 * 
	 * ex : 정답이 3456일때 당신 >> 5634 4 ball >> 3789 1 strike
	 * 
	 * 맞추고 나면 몇 번만에 맞췄는지 알려주기
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int count = 0;
		int player = 0;
		int trun = 0;
		int i = 0;

		while (true) {

			int anwser = ran.nextInt(9001) + 1000;
			System.out.println("컴퓨터 숫자 : " + anwser);
			
			for (i = 0; i <= 8; i++) {

				int user = 1;

				
				while (true) {
					System.out.print("4자리 숫자를 입력하세요 > ");
					user = sc.nextInt();

					if (user > 999 && user <= 9999) {
						break;
					} else {
						System.out.println("잘못된 값입니다. 4자리 숫자를 적어주세요");
					}
				}

				String user_num = "" + user;
				String anwser_num = "" + anwser;
				int strike = 0;
				int ball = 0;
				
				
				for (int j = 0; j <= user_num.length() - 1; j++) {

					char num_us = user_num.charAt(j);
					char num_an = anwser_num.charAt(j);

					if (num_us == num_an) {

						strike++;
					} 
					
					if(num_us != num_an) {
					
					while(num_us != num_an && anwser_num.charAt(0) == num_us) {
						ball ++;
						break;
					}
					while(num_us != num_an && anwser_num.charAt(1) == num_us) {
						ball ++;
						break;
					}  while(num_us != num_an && anwser_num.charAt(2) == num_us) {
						ball ++;
						break;
					} while (num_us != num_an && anwser_num.charAt(3) == num_us) {
						ball ++;
						break;
					} 
					
					}
					
				}
				if(strike == 4) {
					System.out.println("승리하셨습니다");
					break;
				}
				
				System.out.printf("스트라이크 횟수는%d 볼횟수는 %d 입니다\n", strike, ball);
				count++;
				System.out.println("현재 입력하신 횟수는" + count );
			}

			if (count > 8) {
				System.out.println("패배하셨습니다");
				break;
			}
		}

	}
}
