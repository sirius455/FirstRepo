package quiz;
import java.util.Scanner;

public class B03_wonToDollar {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한국 돈을 입력해 주세요 : ");
		
		int won = sc.nextInt();
		
		double dollar = 1123.30;
		
		System.out.printf("달러로 환전을 한 금액은 : %.2f\n", 
		((won/dollar) - (won/dollar*0.0175)));
		
		
		
		  
		  //final이 함께 선언된 변수는 나중에 값을 변경할 수 없다.
		   final double WON_TO_DOLLAR = 0.00089;
		   
		   System.out.print("한국 돈을 입력해주세요. 달러로 바꿔드립니다. (수수료 1.75%) > ");
		   int korMoney = sc.nextInt();
		   
		   double usd = korMoney *  WON_TO_DOLLAR;
		   
		  // System.out.printf("%d원은 %.2fUSD입니다.\n", korMoney, (usd*0.9825));
		  
		   System.out.println(Math.round(usd*0.9825*100)/100.0 + "$");
		
	}
}
