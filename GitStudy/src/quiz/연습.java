package quiz;

import java.util.Random;
import java.util.Scanner;

public class ���� {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		// 31������ ��������
	
		int PLAYER = 0, COMPUTER = 1;
		int trun = ran.nextInt(2);
		int num = 0;
		// while true�� ������ �� �ɰ� ���߿� break�� ������
		
		while(true) {
			
			if (trun == PLAYER) {
				
				int user = 1;
				
				while(true) {
					
					System.out.print("�÷��̾������Դϴ� : ");
					user = sc.nextInt();
					
					if(user > 0 && user <=3) {
						break;
					} else {
						System.out.println("�߸��Է��ϼ˽��ϴ�.");
					}
					
				}
				
				num += user;
				trun = COMPUTER;
				
			} else if (trun == COMPUTER) {
					int com = ran.nextInt(3) + 1;
					
					num += com;
					trun = PLAYER;
					System.out.printf("��ǻ�Ͱ� �Է��� ���ڴ� %d ���� ���ڴ� [%d]\n", com, num );
				}
				

			if (num >= 31) {
				String winner = (trun == PLAYER ? "�÷��̾�" : "��ǻ��");
				System.out.printf("�¸��ڴ� [%s] �Դϴ�.\n", winner);
				break;
 			}
		}
			
		System.out.println("������ �������ϴ�." );	
		}
		
	}
	
