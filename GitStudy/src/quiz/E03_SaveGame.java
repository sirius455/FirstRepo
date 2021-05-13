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
	   1. ��ǻ�Ϳ� �����ϴ� ������ ���������� ������ ���� ��
	   
	   	- ó�� �����ϸ� �̸��� �Է���
	   	- ���α׷� ����� �÷��̾��� ������ ���Ͽ� ������ ������
	   	  (������ �� ���ϸ��� �̸�.txt)
	   	    
	   2. ���α׷� ����� �̸��� �Է����� �� �ش� ������ �ִٸ� 
	            ������ �ҷ��� �� ����ǵ��� ��������	    
	 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Random ran = new Random();
		
		int player = 0;
		int computer = 0;
		int playerwin = 0;
		int playerlose = 0;
		int playerdraw = 0;
		
		System.out.print("�̸��� �Է����ּ��� > ");
		String name = sc.nextLine();
		
		
		File newFlie = new File("./note/" + name + ".txt");
		
	
		if(newFlie.exists()) {
			System.out.println("�ҷ��������� �ֽ��ϴ�");
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
			System.out.println("�ҷ��������� �����ϴ�");
		}
		System.out.println();
		System.out.println("------�÷��̾� ����----------");
		System.out.println("�÷��̾� ��" + playerwin);
		System.out.println("�÷��̾� ��" + playerlose);
		System.out.println("�÷��̾� ���" + playerdraw);
		System.out.println();
		
		for (int i = 0; i < 10; i++) {		
			
				System.out.println("�� = 1 �� = 2 �� = 3 ���ϳ��� ������");
				player = ran.nextInt(3) + 1;
				
				if(player == 1) {
					System.out.println("�÷��̾ �� ���� ��");
				} else if (player == 2) {
					System.out.println("�÷��̾ �� ���� ��");
				} else if (player == 3) {
					System.out.println("�÷��̾ �� ���� ��");
				}
				
				computer = ran.nextInt(3) + 1;
				
				if(computer == 1) {
					System.out.println("��ǻ�Ͱ� �� ���� ��");
				} else if (computer == 2) {
					System.out.println("��ǻ�Ͱ� �� ���� ��");
				} else if (computer == 3) {
					System.out.println("��ǻ�Ͱ� �� ���� ��");
				}
			
			
			if (player == computer) {
				System.out.println("�����ϴ�");
				playerdraw++;
				System.out.println();
			} else if (player == 1 && computer == 2 || player == 2 && computer == 3 || player == 3 && computer == 1) {
				System.out.println("�÷��̾ �̰���ϴ�");
				playerwin++;
			}  else if (player == 2 && computer == 1 || player == 3 && computer == 2 || player == 1 && computer == 3) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�");
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
