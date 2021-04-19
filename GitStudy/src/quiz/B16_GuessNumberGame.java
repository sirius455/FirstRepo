package quiz;

import java.util.Random;
import java.util.Scanner;

public class B16_GuessNumberGame {

	/*
	 * ������ ���۵Ǹ� �������� 4�ڸ��� ���ڰ� �����ȴ�.
	 * 
	 * 1.�÷��̾�� 8���� �õ��� �Ҽ� �ִ�
	 * 
	 * 2. �� �õ����� 4�ڸ��� ���ڸ� �Է��ϸ� ������ ���� �˷��ش�. ���ڿ� ��ġ�� �� ������� - Strike ���ڸ� ������� - ball
	 * 
	 * ex : ������ 3456�϶� ��� >> 5634 4 ball >> 3789 1 strike
	 * 
	 * ���߰� ���� �� ������ ������� �˷��ֱ�
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int count = 0;
		int player = 0;
		int trun = 0;
		int i = 0;

		while (true) {

			int anwser = ran.nextInt(9001) + 1000;
			System.out.println("��ǻ�� ���� : " + anwser);
			
			for (i = 0; i <= 8; i++) {

				int user = 1;

				
				while (true) {
					System.out.print("4�ڸ� ���ڸ� �Է��ϼ��� > ");
					user = sc.nextInt();

					if (user > 999 && user <= 9999) {
						break;
					} else {
						System.out.println("�߸��� ���Դϴ�. 4�ڸ� ���ڸ� �����ּ���");
					}
				}

				String user_num = "" + user;
				String anwser_num = "" + anwser;
				int strike = 0;
				int ball = 0;
				
				
				for (int j = 0; j <= user_num.length() - 1; j++) {

					char num_us = user_num.charAt(j);
					char num_an = anwser_num.charAt(j);

					if (num_us == num_an) {

						strike++;
					} 
					
					if(num_us != num_an) {
					
					while(num_us != num_an && anwser_num.charAt(0) == num_us) {
						ball ++;
						break;
					}
					while(num_us != num_an && anwser_num.charAt(1) == num_us) {
						ball ++;
						break;
					}  while(num_us != num_an && anwser_num.charAt(2) == num_us) {
						ball ++;
						break;
					} while (num_us != num_an && anwser_num.charAt(3) == num_us) {
						ball ++;
						break;
					} 
					
					}
					
				}
				if(strike == 4) {
					System.out.println("�¸��ϼ̽��ϴ�");
					break;
				}
				
				System.out.printf("��Ʈ����ũ Ƚ����%d ��Ƚ���� %d �Դϴ�\n", strike, ball);
				count++;
				System.out.println("���� �Է��Ͻ� Ƚ����" + count );
			}

			if (count > 8) {
				System.out.println("�й��ϼ̽��ϴ�");
				break;
			}
		}

	}
}
