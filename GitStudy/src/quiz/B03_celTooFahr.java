package quiz;

import java.util.Scanner;

public class B03_celTooFahr {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	 
		System.out.print("����(��)�µ��� �Է��ϼ��� : ");
		
		double celsius = sc.nextDouble();
		
		
		
		System.out.printf("������ ȭ���� �ٲٰԵǸ� :  %.1f\n", celsius*1.8 + 32);
	}

}
