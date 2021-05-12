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
		int computer = 1;
		char rack = '��';
		char scissors = '��';
		char paper = '��';
		int playerwin = 0;
		int computerwin = 0;
		int draw = 0;

		while(true) {
			
			if(PLAYER == 0) {	
				System.out.println("�� = 1 �� = 2 �� = 3");
				player = ran.nextInt(2) + 1;
				
				if(player == 1) {
					System.out.println("�÷��̾ �� ���� " + rack);
				} else if (player == 2) {
					System.out.println("�÷��̾ �� ���� " + scissors);
				} else if (player == 3) {
					System.out.println("�÷��̾ �� ���� " + paper);
				}
				
			}   
				if (COMPUTER == 1) {
				System.out.println("�� = 1 �� = 2 �� = 3");
				computer = ran.nextInt(2) + 1;
				
				if(computer == 1) {
					System.out.println("��ǻ�Ͱ� �� ���� " + rack);
					
				} else if (computer == 2) {
					System.out.println("��ǻ�Ͱ� �� ���� " + scissors);
					
				} else if (computer == 3) {
					System.out.println("��ǻ�Ͱ� �� ���� " + paper);
				}
			}
			
			if (player == computer) {
				System.out.println("�����ϴ� �ѹ���");
				draw++;
				System.out.println();
			} else if (player == 1 && computer == 2 || player == 2 && computer == 3 || player == 3 && computer == 1) {
				System.out.println("�÷��̾ �̰���ϴ�");
				playerwin++;
				break;
			}  else if (player == 2 && computer == 1 || player == 3 && computer == 2 || player == 1 && computer == 3) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�");
				computerwin++;
				break;
			}
			
		}
		
		System.out.println(playerwin);
		
	}
}
