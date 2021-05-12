package quiz;

import java.io.File;
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
		
		
		File newFlie = new File("./note/my first file output.txt");
		
		final int PLAYER = 0, COMPUTER = 1;
		
		
		Random ran = new Random();
		
		int player = 0;
		int computer = 0;

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
				System.out.println();
			} else if (player == 1 && computer == 2 || player == 2 && computer == 3 || player == 3 && computer == 1) {
				System.out.println("�÷��̾ �̰���ϴ�");
				break;
			}  else if (player == 2 && computer == 1 || player == 3 && computer == 2 || player == 1 && computer == 3) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�");
				break;
			}
		}		
	}
}
