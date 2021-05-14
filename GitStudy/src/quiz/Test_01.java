package quiz;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Scanner;

public class Test_01 {

	/*
	 * 게임이 시작되면 랜덤으로 4자리의 숫자가 선정된다.
	 * 
	 * 1.플레이어는 8번의 시도를 할수 있다
	 * 
	 * 2. 각 시도마다 4자리의 숫자를 입력하면 다음과 같이 알려준다. 숫자와 위치가 다 맞을경우 - Strike 숫자만 맞을경우 - ball
	 * 
	 * 3. 맞춘 시간과 횟수를 통해 1위부터 30위까지의 랭킹을 생성해 파일을 저장한다
	 * 
	 * 4. 새로운 게임을 시작할 때마다 랭킹을 출력해준다
	 * 
	 * ex : 정답이 3456일때 당신 >> 5634 4 ball >> 3789 1 strike
	 * 
	 * 맞추고 나면 몇 번만에 맞췄는지 알려주기
	 * 
	 */
	
	
	public static void main(String[] args) {
	
		StringBuilder answer_builer = new StringBuilder();
		Scanner input_scanner = new Scanner(System.in);
		
		File newFlie = new File("./data/Ranking.txt");
		
		FileInputStream fin;
		DataInputStream din; 
		double readTime = 0;
		int readtrycount = 0;
		String readClear = null;
		if(newFlie.exists()) {
			System.out.println("랭킹보드를 불러옵니다");
			try {
				
				fin = new FileInputStream(newFlie);
				din = new DataInputStream(fin);
				
				for (int i = 1; i < 31; i++) {
					
				readTime = din.readDouble();
				readtrycount = din.readInt();
				readClear = din.readUTF();
				
				System.out.println(i + "순위 " + "시간 : " + readTime + " 횟수 : " + readtrycount + " 성공여부 : " + readClear);
				}
				
				
				fin.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch(IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("처음 시작한게임입니다.");
		}
		
		for (int i = 0; i < 4; ++i) {
			answer_builer.append((int) (Math.random() * 10));
		}
		String answer = answer_builer.toString();
		
		System.out.printf("이번 정답 [%s]\n", answer);
		
		int strike = 0, ball = 0;
		int tryCount = 0;
		int lose = 0;
		double starttime = 0;
		double endtime = 0;
		String clear = null;
		
		String input = null;
		
		starttime = System.currentTimeMillis();
		while (strike != 4 && tryCount != 8) {
			strike = 0;
			ball = 0;
			
			
			while (true) {
				System.out.printf("시도 %d >> ", tryCount + 1);
				input = input_scanner.nextLine();
				
				boolean valid = true;

				if (input.length() != 4) {
					valid = false;
				}

				for (int i = 0; valid && i < 4; ++i) {
					if (input.charAt(i) < '0' || input.charAt(i) > '9') {
						valid = false;
					}
				}

				if (valid) {
					break;
				} else {
					System.out.println("4자리 숫자만 입력하셔야 합니다.");
				}
			}
			
			if (answer.equals(input)) {
				strike = 4;
				
			} else {
				for (int i = 0; i < 4; ++i) {

					for (int j = 0; j < 4; ++j) {
						if (answer.charAt(i) == input.charAt(i)) {
							strike++;
							break;
						} else if (answer.charAt(i) == input.charAt(j)) {
							ball++;
							break;

						}
					}
				}
			}

			System.out.printf("%d strike, %d ball!\n", strike, ball);
			
			tryCount++;
			endtime = System.currentTimeMillis();
			
			if(tryCount == 8 && !(answer.equals(input))) {
				System.out.println("실패입니다.");
				lose = 1;
			}
		}
		
		System.out.println("게임 종료!");
		
		if(lose == 1) {
			clear = "실패";
		} else {
			clear = "성공";
		}
		
		double clearTime = (endtime - starttime)/1000;
		System.out.println("게임을 깨는데 걸린 시간입니다" + clearTime);
		String.format("%s%s", clearTime , tryCount);
		try {
			FileOutputStream fout = new FileOutputStream(newFlie);
			DataOutputStream dout = new DataOutputStream(fout);
			
			
			if(readTime < clearTime) {
				
			}
			
			for(int i = 1; i < 30; i++) {
				dout.writeDouble(clearTime);
				dout.writeInt(tryCount);
				dout.writeUTF(clear);
			}
			
			
			dout.close();
			fout.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}
	
}
