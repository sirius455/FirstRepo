package quiz;

import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class D11_DiscountDay {
	
	/*
	 	어떤 카페에서 짝수번째 목요일마다 할인행사를 진행한다고 할때 
	 	년도를 입력하면 해당 년도의 모든 할인 날짜를 출력해보세요	 
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		System.out.print("년도를 입력해 주세요 > ");
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
			
			System.out.printf("%d:%d:%d %d번째 할인행사 입니다\n", year, month , date, count);
			}
		}
		
		System.out.println();
	}
}
