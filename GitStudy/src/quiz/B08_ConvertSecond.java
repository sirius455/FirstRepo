package quiz;

import java.util.Scanner;

public class B08_ConvertSecond {
	
	/*
	 	초를 입력받으면 년/일/시간/분/초 변환화여 출력해 보세요
	 	
	 	※필요없는 단위는 출력하지 말것
	    ex: 0년 0일 5시간 0분 20초인 경우 0년 0일은 나오지 않아야 함
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초를 입력해주세요 : ");
		
		int time = sc.nextInt(); 
		
		if(time < 1) {
			System.out.println("잘못된 입력입니다.");
		} else if (time >= 31536000){
			System.out.println((time/31536000 + "년") + (time%31536000)/86400 + "일" + 
		    (time%86400)/3600 + "시"  + (time%3600)/60 + "분"  + (time%60) + "초");
		} else if (time >= 86400){
			System.out.println(time/86400 + "일" + 
				    (time%86400)/3600 + "시"  + (time%3600)/60 + "분"  + (time%60) + "초");
		} else if (time >= 3600){
			System.out.println( time/3600 + "시"  + (time%3600)/60 + "분"  + (time%60) + "초");
		} else if (time >= 60){
			System.out.println( time/60 + "분"  + (time%60) + "초");
		} else {
			System.out.println( time + "초");
		}
		
		
		//(time/31536120) + (time/86400) + (time/7200) 
		//+ (time/60) + (time));
	}
}
