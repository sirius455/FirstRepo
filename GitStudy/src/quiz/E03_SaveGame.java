package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class E03_SaveGame {
	
	/* 
	   1. 컴퓨터와 진행하는 간단한 가위바위보 게임을 만든 후
	   
	   	- 처음 시작하면 이름을 입력함
	   	- 프로그램 종료시 플레이어의 전적을 파일에 저장해 보세요
	   	  (저장할 때 파일명은 이름.txt)
	   	    
	   2. 프로그램 실행시 이름을 입력했을 때 해당 전적이 있다면 
	            전적을 불러온 후 진행되도록 만들어보세요	    
	 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		File newFlie = new File("./note/my first file output.txt");
		
		final int PLAYER = 0, COMPUTER = 1;
		
		
		Random ran = new Random();
		
		int player = 0;
		int computer = 1;
		char rack = '묵';
		char scissors = '찌';
		char paper = '빠';
		int playerwin = 0;
		int computerwin = 0;
		int draw = 0;

		while(true) {
			
			if(PLAYER == 0) {	
				System.out.println("묵 = 1 찌 = 2 빠 = 3");
				player = ran.nextInt(2) + 1;
				
				if(player == 1) {
					System.out.println("플레이어가 낸 수는 " + rack);
				} else if (player == 2) {
					System.out.println("플레이어가 낸 수는 " + scissors);
				} else if (player == 3) {
					System.out.println("플레이어가 낸 수는 " + paper);
				}
				
			}   
				if (COMPUTER == 1) {
				System.out.println("묵 = 1 찌 = 2 빠 = 3");
				computer = ran.nextInt(2) + 1;
				
				if(computer == 1) {
					System.out.println("컴퓨터가 낸 수는 " + rack);
					
				} else if (computer == 2) {
					System.out.println("컴퓨터가 낸 수는 " + scissors);
					
				} else if (computer == 3) {
					System.out.println("컴퓨터가 낸 수는 " + paper);
				}
			}
			
			if (player == computer) {
				System.out.println("비겼습니다 한번더");
				draw++;
				System.out.println();
			} else if (player == 1 && computer == 2 || player == 2 && computer == 3 || player == 3 && computer == 1) {
				System.out.println("플레이어가 이겼습니다");
				playerwin++;
				break;
			}  else if (player == 2 && computer == 1 || player == 3 && computer == 2 || player == 1 && computer == 3) {
				System.out.println("컴퓨터가 이겼습니다");
				computerwin++;
				break;
			}
			
		}
		
		System.out.println(playerwin);
		
	}
}
