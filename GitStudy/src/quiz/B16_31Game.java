package quiz;

import java.util.Random;
import java.util.Scanner;

public class B16_31Game {

	/*
	 * # 31 게임을 만들어 보세요
	 * 
	 * 1. 컴퓨터와 사람이 번갈아가면서 숫자를 선택해야 한다.(1,2,3 밖에 선택할 수 없음) 2. 컴퓨터는 랜덤으로 숫자를 선택한다 3.
	 * 선공은 랜덤으로 결정한다 4. 마지막에 31이상의 숫자를 만들 수 밖에 없는 플레이어가 패배한다.
	 */

	public static void main(String[] args) {

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		final int PLAYER = 0, COMPUTER = 1;

		int num = 0;
		int trun = (ran.nextInt(2));

		while (true) {

			if (trun == PLAYER) {
				int user = 1;

				while (true) {
					System.out.print("당신의 턴 > ");
					user = sc.nextInt();

					if (user > 0 && user <= 3) {
						break;
					} else {
						System.out.println("잘못된 값입니다. [1, 2 3] 중에 선택해 주세요");
					}
				}
				num += user;

				System.out.printf("당신이 %d를 선택 [%d]\n", user, num);
				trun = COMPUTER;

			} else if (trun == COMPUTER) {
				int com;

				if (num % 4 == 0) {
					com = 2;
				} else if (num % 4 == 1) {
					com = 1;
				} else if (num % 4 == 2) {
					com = (int) (Math.random() * 3 + 1);
				} else {
					com = 3;
				}

				num += com;
				System.out.println("컴퓨터의 턴 > " + com);

				System.out.printf("컴퓨터가 %d를 선택 [%d]\n", com, num);
				trun = PLAYER;
			}

			if (num >= 31) {
				String winner = trun == PLAYER ? "플레이어 " : "컴퓨터";
				System.out.printf("<<'%s'의 승리\n", winner);
				break;
			}

		}
		
		System.out.println("게임이 끝났습니다!");
	}

}
