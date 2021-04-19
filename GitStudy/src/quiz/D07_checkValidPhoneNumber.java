package quiz;
import java.util.Scanner;

public class D07_checkValidPhoneNumber {
	
	


	/*
	  	사용자로부터 핸드폰번호를 입력받으면
	  	올바른 전화번호인지 구분하는 프로그램을 만들어보세요	  
	  	앞의 3자리가 숫자
	  	2번째 숫자는 3자리 혹은 4자리
	  	세번째 숫자는 4자리 
	  	4번째 또는 8번째  또는9번째 문자는 '-'
	*/
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String phoneNumber;
		
		
		System.out.print("핸드폰 번호를 입력하세요 >");
		phoneNumber = sc.nextLine();
		
		for (int i = 0; i < phoneNumber.length(); i++) {
			char num = phoneNumber.charAt(i); 
			
			if(!(13 >= phoneNumber.length() || 12 < phoneNumber.length())) {
				System.out.println("잘못된 입력입니다");
				break;
			} else if (i < 3) {
				if(!('0' <= num && '9' >=num)) {
					System.out.println("잘못입력하셨습니다");
					break;
				}		
			} else if((i == 3 || i == 7 || i == 8)) {
				if(num != '-') {
					System.out.println("잘못입력하셨습니다");
					break;
				}
			}
		}
		
		System.out.println(phoneNumber);
		// break;
	}
}
