package myobj;

import java.util.Random;

public class LotteNumber {
	
	static Random ran = new Random();
	int num = 0;
	
	private static int getRandomNumber() {
		return ran.nextInt(45)+1;
	}
	
	int number = getRandomNumber();
	
	public int getLotteNumber() {
		return num =  number;
	}
		
}
