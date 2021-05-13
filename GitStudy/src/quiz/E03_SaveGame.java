package quiz;

import java.io.File;
import java.io.FileInputStream;
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

		Random ran = new Random();
		
		int player = 0;
		int computer = 0;
		int playerwin = 0;
		int playerlose = 0;
		int playerdraw = 0;
		
		System.out.print("이름을 입력해주세요 > ");
		String name = sc.nextLine();
		
		
		File newFlie = new File("./note/" + name + ".txt");
		
	
		if(newFlie.exists()) {
			System.out.println("불러올파일이 있습니다");
			try {
				FileInputStream rankread = new FileInputStream(newFlie);
				
				playerwin = rankread.read();
				playerlose = rankread.read();
				playerdraw = rankread.read();
				
				rankread.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch(IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("불러올파일이 없습니다");
		}
		System.out.println();
		System.out.println("------플레이어 전적----------");
		System.out.println("플레이어 승" + playerwin);
		System.out.println("플레이어 패" + playerlose);
		System.out.println("플레이어 비김" + playerdraw);
		System.out.println();
		
		for (int i = 0; i < 10; i++) {		
			
				System.out.println("묵 = 1 찌 = 2 빠 = 3 중하나를 내세요");
				player = ran.nextInt(3) + 1;
				
				if(player == 1) {
					System.out.println("플레이어가 낸 수는 묵");
				} else if (player == 2) {
					System.out.println("플레이어가 낸 수는 찌");
				} else if (player == 3) {
					System.out.println("플레이어가 낸 수는 빠");
				}
				
				computer = ran.nextInt(3) + 1;
				
				if(computer == 1) {
					System.out.println("컴퓨터가 낸 수는 묵");
				} else if (computer == 2) {
					System.out.println("컴퓨터가 낸 수는 찌");
				} else if (computer == 3) {
					System.out.println("컴퓨터가 낸 수는 빠");
				}
			
			
			if (player == computer) {
				System.out.println("비겼습니다");
				playerdraw++;
				System.out.println();
			} else if (player == 1 && computer == 2 || player == 2 && computer == 3 || player == 3 && computer == 1) {
				System.out.println("플레이어가 이겼습니다");
				playerwin++;
			}  else if (player == 2 && computer == 1 || player == 3 && computer == 2 || player == 1 && computer == 3) {
				System.out.println("컴퓨터가 이겼습니다");
				playerlose++;
			}
			
		}
		
		try {
			FileOutputStream ranks = new FileOutputStream(newFlie);
			
			ranks.write(playerwin);
			ranks.write(playerlose);
			ranks.write(playerdraw);
			
			ranks.close();
			
	    } catch (FileNotFoundException e) {
	    	e.printStackTrace();
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
		
		
	}
}
