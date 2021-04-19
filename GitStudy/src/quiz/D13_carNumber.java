package quiz;

import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.regex.Pattern;


public class D13_carNumber {
	
	/*
	  
	  ÃâÀÔÁ¦ÇÑ ³¡¹øÈ£ ¿ù 1 6
	 ¸ñ 4 9
	 È­ 2 7
	 ±İ 5 0 
	 ¼ö 3 8 
	   Á¦¿ÜÂ÷·® /Àå¾ÖÀÎ, À¯¾Æµ¿½Â, °æÂ÷
	   
	   Â÷ÀÇ Å¸ÀÔ = 
	 */
	public static void main(String[] args) {
	
	Calendar korea = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
	Scanner sc = new Scanner(System.in);
	
	System.out.print("¹«½¼ Â÷·®ÀÎÁö¸¦ ÀÔ·ÂÇÏ¼¼¿ä > ");
	String carType = sc.nextLine();
	System.out.print("Â÷·® ¹øÈ£¸¦ ÀÔ·ÂÇÏ¼¼¿ä > ");
	String carNumber = sc.nextLine();
	
	notPassDay(carType, carNumber);

	} 

	public static void notPassDay(String carType, String carNumber) {
		
		Calendar korea = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
		
		int dow = korea.get(Calendar.DAY_OF_WEEK);
		int lastIndex = carNumber.length()-1;	
		
			boolean disabledCar = Pattern.matches("Àå¾ÖÀÎÂ÷·®", carType);
			boolean withChildCar = Pattern.matches("À¯¾Æµ¿½ÂÂ÷·®", carType);
			boolean smallCar = Pattern.matches("°æÂ÷", carType);
			
			if(Pattern.matches("^[\\d&&\\S]{2}[°¡-ÆR][\\d&&\\S]{4}$", carNumber) == false) {
				System.out.println("Àß¸øµÈ Â÷·®¹øÈ£¸¦ ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù.");
			} else if(Pattern.matches("^[°¡-È÷]+$", carType) == false )  {
				System.out.println("Â÷·®Á¾·ù¸¦ Àß¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù");
			} else if(disabledCar == true || withChildCar == true || smallCar == true)  {
				System.out.println("Â÷·® ¿äÀÏÁ¦ Á¦¿Ü Â÷·®ÀÔ´Ï´Ù");
			} else if(dow == 2 && (carNumber.charAt(lastIndex) == '1' ||  carNumber.charAt(lastIndex) == '6') )  {
				System.out.println("±ÍÇÏÀÇ Â÷´Â ¿ù¿äÀÏ¿¡ ÁÖÂ÷±İÁöÀÔ´Ï´Ù");
			} else if (dow == 3 && (carNumber.charAt(lastIndex) == '2' ||  carNumber.charAt(lastIndex) == '7')) {
				System.out.println("±ÍÇÏÀÇ Â÷´Â È­¿äÀÏ¿¡ ÁÖÂ÷±İÁöÀÔ´Ï´Ù");	
			} else if (dow == 4 && (carNumber.charAt(lastIndex) == '3' ||  carNumber.charAt(lastIndex) == '8')) {
				System.out.println("±ÍÇÏÀÇ Â÷´Â ¼ö¿äÀÏ¿¡ ÁÖÂ÷±İÁöÀÔ´Ï´Ù");	
			} else if (dow == 5 && (carNumber.charAt(lastIndex) == '4' ||  carNumber.charAt(lastIndex) == '9')) {
				System.out.println("±ÍÇÏÀÇ Â÷´Â ¸ñ¿äÀÏ¿¡ ÁÖÂ÷±İÁöÀÔ´Ï´Ù");	
			} else if (dow == 6 && (carNumber.charAt(lastIndex) == '5' ||  carNumber.charAt(lastIndex) == '0')) {
				System.out.println("±ÍÇÏÀÇ Â÷´Â ±İ¿äÀÏ¿¡ ÁÖÂ÷±İÁöÀÔ´Ï´Ù");	
			} else if (dow == 1 || dow == 7) {
				System.out.println("ÁÖ¸»¿¡´Â ¸ğµçÂ÷·® ÁÖÂ÷°¡´ÉÀÔ´Ï´Ù.");	
			} else {
				System.out.println("¿À´Ã ÁÖÂ÷°¡´É Â÷·®ÀÔ´Ï´Ù");
			}
		
	}
	
}
