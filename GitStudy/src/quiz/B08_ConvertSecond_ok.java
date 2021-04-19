package quiz;

import java.util.Scanner;

public class B08_ConvertSecond_ok {
	
	/*
	 	초를 입력받으면 년/일/시간/분/초 변환화여 출력해 보세요
	 	
	 	※필요없는 단위는 출력하지 말것
	    ex: 0년 0일 5시간 0분 20초인 경우 0년 0일은 나오지 않아야 함
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초를 입력해주세요 : ");
		
		int time = sc.nextInt(); 
		
		int year = 31536000;
		int day = 86400;
		int our = 3600;
		int min = 60; 
		
		if(time < 1) {
			System.out.println("잘못된 입력입니다.");
		} else if (time >= year){
			System.out.printf("입력하시는 초는 [%d]년 [%d]일 [%d]시 [%d]분 [%d]초입니다.",
					(time/year) , (time%year)/day , (time%day)/our , (time%our)/min , (time%min));
		} else if (time >= day){
			System.out.printf("입력하시는 초는 [%d]일 [%d]시 [%d]분 [%d]초입니다.",
					(time%year)/day , (time%day)/our , (time%our)/min , (time%min));
		} else if (time >= our){
			System.out.printf("입력하시는 초는  [%d]시 [%d]분 [%d]초입니다.",
					(time%day)/our , (time%our)/min , (time%min));
		} else if (time >= min){
			System.out.printf("입력하시는 초는 [%d]분 [%d]초입니다.",
					(time%our)/min , (time%min));
		} else {
			System.out.println( time + "초");
		}
		
		
		//(time/31536120) + (time/86400) + (time/7200) 
		//+ (time/60) + (time));
	}
}
