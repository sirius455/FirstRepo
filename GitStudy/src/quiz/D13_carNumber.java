package quiz;

import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.regex.Pattern;


public class D13_carNumber {
	
	/*
	  
	  �������� ����ȣ �� 1 6
	 �� 4 9
	 ȭ 2 7
	 �� 5 0 
	 �� 3 8 
	   �������� /�����, ���Ƶ���, ����
	   
	   ���� Ÿ�� = 
	 */
	public static void main(String[] args) {
	
	Calendar korea = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
	Scanner sc = new Scanner(System.in);
	
	System.out.print("���� ���������� �Է��ϼ��� > ");
	String carType = sc.nextLine();
	System.out.print("���� ��ȣ�� �Է��ϼ��� > ");
	String carNumber = sc.nextLine();
	
	notPassDay(carType, carNumber);

	} 

	public static void notPassDay(String carType, String carNumber) {
		
		Calendar korea = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
		
		int dow = korea.get(Calendar.DAY_OF_WEEK);
		int lastIndex = carNumber.length()-1;	
		
			boolean disabledCar = Pattern.matches("���������", carType);
			boolean withChildCar = Pattern.matches("���Ƶ�������", carType);
			boolean smallCar = Pattern.matches("����", carType);
			
			if(Pattern.matches("^[\\d&&\\S]{2}[��-�R][\\d&&\\S]{4}$", carNumber) == false) {
				System.out.println("�߸��� ������ȣ�� �Է��ϼ̽��ϴ�.");
			} else if(Pattern.matches("^[��-��]+$", carType) == false )  {
				System.out.println("���������� �߸� �Է��ϼ̽��ϴ�");
			} else if(disabledCar == true || withChildCar == true || smallCar == true)  {
				System.out.println("���� ������ ���� �����Դϴ�");
			} else if(dow == 2 && (carNumber.charAt(lastIndex) == '1' ||  carNumber.charAt(lastIndex) == '6') )  {
				System.out.println("������ ���� �����Ͽ� ���������Դϴ�");
			} else if (dow == 3 && (carNumber.charAt(lastIndex) == '2' ||  carNumber.charAt(lastIndex) == '7')) {
				System.out.println("������ ���� ȭ���Ͽ� ���������Դϴ�");	
			} else if (dow == 4 && (carNumber.charAt(lastIndex) == '3' ||  carNumber.charAt(lastIndex) == '8')) {
				System.out.println("������ ���� �����Ͽ� ���������Դϴ�");	
			} else if (dow == 5 && (carNumber.charAt(lastIndex) == '4' ||  carNumber.charAt(lastIndex) == '9')) {
				System.out.println("������ ���� ����Ͽ� ���������Դϴ�");	
			} else if (dow == 6 && (carNumber.charAt(lastIndex) == '5' ||  carNumber.charAt(lastIndex) == '0')) {
				System.out.println("������ ���� �ݿ��Ͽ� ���������Դϴ�");	
			} else if (dow == 1 || dow == 7) {
				System.out.println("�ָ����� ������� ���������Դϴ�.");	
			} else {
				System.out.println("���� �������� �����Դϴ�");
			}
		
	}
	
}
