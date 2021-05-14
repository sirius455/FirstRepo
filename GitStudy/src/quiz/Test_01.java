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
	 * ������ ���۵Ǹ� �������� 4�ڸ��� ���ڰ� �����ȴ�.
	 * 
	 * 1.�÷��̾�� 8���� �õ��� �Ҽ� �ִ�
	 * 
	 * 2. �� �õ����� 4�ڸ��� ���ڸ� �Է��ϸ� ������ ���� �˷��ش�. ���ڿ� ��ġ�� �� ������� - Strike ���ڸ� ������� - ball
	 * 
	 * 3. ���� �ð��� Ƚ���� ���� 1������ 30�������� ��ŷ�� ������ ������ �����Ѵ�
	 * 
	 * 4. ���ο� ������ ������ ������ ��ŷ�� ������ش�
	 * 
	 * ex : ������ 3456�϶� ��� >> 5634 4 ball >> 3789 1 strike
	 * 
	 * ���߰� ���� �� ������ ������� �˷��ֱ�
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
			System.out.println("��ŷ���带 �ҷ��ɴϴ�");
			try {
				
				fin = new FileInputStream(newFlie);
				din = new DataInputStream(fin);
				
				for (int i = 1; i < 31; i++) {
					
				readTime = din.readDouble();
				readtrycount = din.readInt();
				readClear = din.readUTF();
				
				System.out.println(i + "���� " + "�ð� : " + readTime + " Ƚ�� : " + readtrycount + " �������� : " + readClear);
				}
				
				
				fin.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch(IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("ó�� �����Ѱ����Դϴ�.");
		}
		
		for (int i = 0; i < 4; ++i) {
			answer_builer.append((int) (Math.random() * 10));
		}
		String answer = answer_builer.toString();
		
		System.out.printf("�̹� ���� [%s]\n", answer);
		
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
				System.out.printf("�õ� %d >> ", tryCount + 1);
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
					System.out.println("4�ڸ� ���ڸ� �Է��ϼž� �մϴ�.");
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
				System.out.println("�����Դϴ�.");
				lose = 1;
			}
		}
		
		System.out.println("���� ����!");
		
		if(lose == 1) {
			clear = "����";
		} else {
			clear = "����";
		}
		
		double clearTime = (endtime - starttime)/1000;
		System.out.println("������ ���µ� �ɸ� �ð��Դϴ�" + clearTime);
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
