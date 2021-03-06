package quiz;

import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.regex.Pattern;


public class D13_carNumber {
	
	/*
	  
	  출입제한 끝번호 월 1 6
	 목 4 9
	 화 2 7
	 금 5 0 
	 수 3 8 
	   제외차량 /장애인, 유아동승, 경차
	   
	   차의 타입 = 
	 */
	public static void main(String[] args) {
	
	Calendar korea = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
	Scanner sc = new Scanner(System.in);
	
	System.out.print("무슨 차량인지를 입력하세요 > ");
	String carType = sc.nextLine();
	System.out.print("차량 번호를 입력하세요 > ");
	String carNumber = sc.nextLine();
	
	notPassDay(carType, carNumber);

	} 

	public static void notPassDay(String carType, String carNumber) {
		
		Calendar korea = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
		
		int dow = korea.get(Calendar.DAY_OF_WEEK);
		int lastIndex = carNumber.length()-1;	
		
			boolean disabledCar = Pattern.matches("장애인차량", carType);
			boolean withChildCar = Pattern.matches("유아동승차량", carType);
			boolean smallCar = Pattern.matches("경차", carType);
			
			if(Pattern.matches("^[\\d&&\\S]{2}[가-힣][\\d&&\\S]{4}$", carNumber) == false) {
				System.out.println("잘못된 차량번호를 입력하셨습니다.");
			} else if(Pattern.matches("^[가-히]+$", carType) == false )  {
				System.out.println("차량종류를 잘못 입력하셨습니다");
			} else if(disabledCar == true || withChildCar == true || smallCar == true)  {
				System.out.println("차량 요일제 제외 차량입니다");
			} else if(dow == 2 && (carNumber.charAt(lastIndex) == '1' ||  carNumber.charAt(lastIndex) == '6') )  {
				System.out.println("귀하의 차는 월요일에 주차금지입니다");
			} else if (dow == 3 && (carNumber.charAt(lastIndex) == '2' ||  carNumber.charAt(lastIndex) == '7')) {
				System.out.println("귀하의 차는 화요일에 주차금지입니다");	
			} else if (dow == 4 && (carNumber.charAt(lastIndex) == '3' ||  carNumber.charAt(lastIndex) == '8')) {
				System.out.println("귀하의 차는 수요일에 주차금지입니다");	
			} else if (dow == 5 && (carNumber.charAt(lastIndex) == '4' ||  carNumber.charAt(lastIndex) == '9')) {
				System.out.println("귀하의 차는 목요일에 주차금지입니다");	
			} else if (dow == 6 && (carNumber.charAt(lastIndex) == '5' ||  carNumber.charAt(lastIndex) == '0')) {
				System.out.println("귀하의 차는 금요일에 주차금지입니다");	
			} else if (dow == 1 || dow == 7) {
				System.out.println("주말에는 모든차량 주차가능입니다.");	
			} else {
				System.out.println("오늘 주차가능 차량입니다");
			}
		
	}
	
}
