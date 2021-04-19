package quiz;

import java.util.Random;
import java.util.Scanner;

public class 연습 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		// 31게임을 만들어보세요
	
		int PLAYER = 0, COMPUTER = 1;
		int trun = ran.nextInt(2);
		int num = 0;
		// while true로 무한을 을 걸고 나중에 break로 빠지기
		
		while(true) {
			
			if (trun == PLAYER) {
				
				int user = 1;
				
				while(true) {
					
					System.out.print("플레이어차례입니다 : ");
					user = sc.nextInt();
					
					if(user > 0 && user <=3) {
						break;
					} else {
						System.out.println("잘못입력하셧습니다.");
					}
					
				}
				
				num += user;
				trun = COMPUTER;
				
			} else if (trun == COMPUTER) {
					int com = ran.nextInt(3) + 1;
					
					num += com;
					trun = PLAYER;
					System.out.printf("컴퓨터가 입력한 숫자는 %d 현재 숫자는 [%d]\n", com, num );
				}
				

			if (num >= 31) {
				String winner = (trun == PLAYER ? "플레이어" : "컴퓨터");
				System.out.printf("승리자는 [%s] 입니다.\n", winner);
				break;
 			}
		}
			
		System.out.println("게임이 끝났습니다." );	
		}
		
	}
	
