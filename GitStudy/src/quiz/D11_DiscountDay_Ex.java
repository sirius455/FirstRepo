package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class D11_DiscountDay_Ex {
	
	public static void main(String[] args) {
		
		int year = 2050;
		 
		printAllEventDays(year);
		
	}
	
	// �� Calendar Ŭ������ � �ʵ带 �����ϸ� ������ �ʵ嵵 ��Ȳ�� �°� �˾Ƽ� ������Ʈ �ȴ�
	public static void printAllEventDays(int year) {
		SimpleDateFormat eventFormat = new SimpleDateFormat("yyyy�� M�� d��");
		Calendar event = Calendar.getInstance(TimeZone.getTimeZone("Asia/seoul"));
		
		event.set(year, 0, 1, 0, 0, 0);
		
		int count = 1;
		
		//		for(int i = 0; i< 12; i++) 
		while(event.get(Calendar.YEAR) == year) {

		//		event.set(Calendar.MONTH, i);
		event.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY); //����Ϸ� �ٲٰ�
		event.set(Calendar.DAY_OF_WEEK_IN_MONTH, 2);// �̹� �� �� ��° ���Ϸ� ����
		
		
		System.out.printf(eventFormat.format(event.getTime()) + "\t[%d��° ���]\n", count++);
		
		event.set(Calendar.DAY_OF_WEEK_IN_MONTH, 4); // �̹� �� �� ��° ���Ϸ� ���� 
		
		
		System.out.printf(eventFormat.format(event.getTime()) + "\t[%d��° ���]\n", count++);
		
		// add() : ���ϴ� �ʵ带 ���ϴ� ��ġ��ŭ ���ϰų� �� �� �ִ�
		event.add(Calendar.MONTH, 1);	
		
		}
	}
}
