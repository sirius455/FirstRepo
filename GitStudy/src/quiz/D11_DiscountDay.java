package quiz;

import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class D11_DiscountDay {
	
	/*
	 	� ī�信�� ¦����° ����ϸ��� ������縦 �����Ѵٰ� �Ҷ� 
	 	�⵵�� �Է��ϸ� �ش� �⵵�� ��� ���� ��¥�� ����غ�����	 
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		System.out.print("�⵵�� �Է��� �ּ��� > ");
		int year = sc.nextInt();
		
		Calendar korea = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
		
		korea.set(Calendar.YEAR, year);
		korea.set(Calendar.MONTH, 1);
		
		
		System.out.println(korea);
		
		for(int i = 0; i < 365; i++) {
			korea.set(Calendar.DATE, i);
			int month = korea.get(Calendar.MONTH);
			int date = korea.get(Calendar.DATE);
			int dow = korea.get(Calendar.DAY_OF_WEEK);
			int dowim = korea.get(Calendar.DAY_OF_WEEK_IN_MONTH);
					
		if(dow == Calendar.THURSDAY && (dowim == 2 || dowim ==4)) {
			count++;
			
			System.out.printf("%d:%d:%d %d��° ������� �Դϴ�\n", year, month , date, count);
			}
		}
		
		System.out.println();
	}
}
