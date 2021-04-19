package quiz;

import java.util.Scanner;

public class B08_ConvertSecond2 {
	
	/*
	 	�ʸ� �Է¹����� ��/��/�ð�/��/�� ��ȯȭ�� ����� ������
	 	
	 	���ʿ���� ������ ������� ����
	    ex: 0�� 0�� 5�ð� 0�� 20���� ��� 0�� 0���� ������ �ʾƾ� ��
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ʸ� �Է����ּ��� : ");
		
		int second = sc.nextInt(); 
		
		final int SECOND_PER_YEAR = 31536000;
		final int SECOND_PER_DAY = 86400;
		final int SECOND_PER_HOUR = 3600;
		final int SECOND_PER_MINUTE = 60;
		
		int y = 0, d = 0, h = 0, m = 0, s = 0;  
		int original = second;
		
		y = second / SECOND_PER_YEAR;
		second %= SECOND_PER_YEAR;
		
		d = second / SECOND_PER_DAY;
		second %= SECOND_PER_DAY;
		
		h = second / SECOND_PER_HOUR;
		second %= SECOND_PER_HOUR;
		
		m = second / SECOND_PER_MINUTE;
		second %= SECOND_PER_MINUTE;
		
		s = second; 
		
		System.out.printf("'%d'�ʴ� ��ȯ�ϸ� ",original);
		
		boolean exist = false;
		
		if (y != 0 ) {
			System.out.print(y + "��");
			exist = true;
		}
		if (exist || d != 0 ) {
			System.out.print(d + "��");
			exist = true;
		}
		if (exist || h != 0 ) {
			System.out.print(h + "�ð�");
			exist = true;
		}
		if (exist || m != 0 ) {
			System.out.print(m + "��");
		}
		System.out.print(s + "�� �Դϴ�.");
		
	}
}
