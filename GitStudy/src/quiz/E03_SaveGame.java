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
		int countwin = 0;
		int countlose = 0;
		int countdraw = 0;
		
		System.out.print("�̸��� �Է����ּ��� > ");
		String name = sc.nextLine();
		
		File newFlie = new File("./note/" + name + ".txt");
		
		try {
			FileInputStream rankread = new FileInputStream(newFlie);
			
			byte[] buffer = new byte[100];
			
			// �� ���ϴ� ����Ʈ ũ�⸸ŭ�� �б�
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
				System.out.println("�����ϴ� �ѹ���");
				playerdraw++;
				System.out.println();
			} else if (player == 1 && computer == 2 || player == 2 && computer == 3 || player == 3 && computer == 1) {
				System.out.println("�÷��̾ �̰���ϴ�");
				playerwin++;
				break;
			}  else if (player == 2 && computer == 1 || player == 3 && computer == 2 || player == 1 && computer == 3) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�");
				playerlose++;
				break;
			}
			
		}
			
		 countwin += playerwin;
		 countlose += playerlose;
		 countdraw += playerwin;
		
		try {
			FileOutputStream ranks = new FileOutputStream(newFlie);
			
			ranks.write("�÷��̾� �¸�Ƚ�� >\n".getBytes());
			ranks.write("�÷��̾� �й�Ƚ�� >\n".getBytes());
			ranks.write("�÷��̾� ���Ƚ�� >\n".getBytes());
			ranks.close();
			
	    } catch (FileNotFoundException e) {
	    	e.printStackTrace();
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
		
	}
}
