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
		int countwin = 0;
		int countlose = 0;
		int countdraw = 0;
		
		System.out.print("이름을 입력해주세요 > ");
		String name = sc.nextLine();
		
		File newFlie = new File("./note/" + name + ".txt");
		
		try {
			FileInputStream rankread = new FileInputStream(newFlie);
			
			byte[] buffer = new byte[100];
			
			// ※ 원하는 바이트 크기만큼씩 읽기
			int len;
			while ((len = rankread.read(buffer)) != -1) {
				System.out.println(new String(buffer, 0, len));
			}
			rankread.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		while(true) {		
			
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
				System.out.println("비겼습니다 한번더");
				playerdraw++;
				System.out.println();
			} else if (player == 1 && computer == 2 || player == 2 && computer == 3 || player == 3 && computer == 1) {
				System.out.println("플레이어가 이겼습니다");
				playerwin++;
				break;
			}  else if (player == 2 && computer == 1 || player == 3 && computer == 2 || player == 1 && computer == 3) {
				System.out.println("컴퓨터가 이겼습니다");
				playerlose++;
				break;
			}
			
		}
			
		 countwin += playerwin;
		 countlose += playerlose;
		 countdraw += playerwin;
		
		try {
			FileOutputStream ranks = new FileOutputStream(newFlie);
			
			ranks.write("플레이어 승리횟수 >\n".getBytes());
			ranks.write("플레이어 패배횟수 >\n".getBytes());
			ranks.write("플레이어 비긴횟수 >\n".getBytes());
			ranks.close();
			
	    } catch (FileNotFoundException e) {
	    	e.printStackTrace();
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
		
	}
}
