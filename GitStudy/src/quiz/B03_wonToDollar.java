package quiz;
import java.util.Scanner;

public class B03_wonToDollar {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ѱ� ���� �Է��� �ּ��� : ");
		
		int won = sc.nextInt();
		
		double dollar = 1123.30;
		
		System.out.printf("�޷��� ȯ���� �� �ݾ��� : %.2f\n", 
		((won/dollar) - (won/dollar*0.0175)));
		
		
		
		  
		  //final�� �Բ� ����� ������ ���߿� ���� ������ �� ����.
		   final double WON_TO_DOLLAR = 0.00089;
		   
		   System.out.print("�ѱ� ���� �Է����ּ���. �޷��� �ٲ�帳�ϴ�. (������ 1.75%) > ");
		   int korMoney = sc.nextInt();
		   
		   double usd = korMoney *  WON_TO_DOLLAR;
		   
		  // System.out.printf("%d���� %.2fUSD�Դϴ�.\n", korMoney, (usd*0.9825));
		  
		   System.out.println(Math.round(usd*0.9825*100)/100.0 + "$");
		
	}
}
