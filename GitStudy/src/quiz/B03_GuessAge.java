package quiz;

import java.util.Scanner;

public class B03_GuessAge {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("����� �¾ �ظ� �Է����ּ��� : ");
		
		int born_year = sc.nextInt();
		
		System.out.print("������ �⵵�� �Է����ּ��� : ");
		
		int now_year = sc.nextInt();
		
		System.out.print("����� ���̴�  " + (now_year - born_year) + "�Դϴ�.");
		
		
		
	}

}
