package quiz;

import java.util.Scanner;

public class B03_celTooFahr {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	 
		System.out.print("¼·¾¾(¡É)¿Âµµ¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
		
		double celsius = sc.nextDouble();
		
		
		
		System.out.printf("¼·¾¾¸¦ È­¾¾·Î ¹Ù²Ù°ÔµÇ¸é :  %.1f\n", celsius*1.8 + 32);
	}

}
