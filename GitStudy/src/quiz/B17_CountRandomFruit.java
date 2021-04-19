package quiz;

import java.util.Random;
import java.util.Scanner;

public class B17_CountRandomFruit {
		/* 
		  	1. 사용자로부터 배열의 크기를 입력받는다
		  	
		  	2. 해당 크기만큼의 배열에 랜덤 과일 문자열을 저장한다
		  	(apple, banana, kiwi, orange, peach, strawberry, pineapple)
		  	
		  	3. 각 과일이 몇 번 등장했는지 모두 기록하고 출력해본다.
		  
		 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		System.out.print("배열의 크기를 입력해주세요 : ");
		int arr = sc.nextInt();
		String[] fruit = new String[] { "apple", "banana", "kiwi", "orange", "peach", "strawberry", "pineapple"};
		int apple = 0, banana = 0, kiwi = 0, orange= 0, peach = 0, strawberry = 0, pineapple = 0;

		for (int i = 0; i < arr; ++ i) {
			
			//배열이 가변할경우 변수지정을 하는법??? .length
			int ch = ran.nextInt(fruit.length);
			
			if(ch <= arr || ch > arr) {
			String count = fruit [ch];
		
			//String 배열크기가 높으면 어케 식을 맞추는가..
			//for(int j = 0; j < fruit.length; j++)
			
			int[] a = new int[fruit.length];
			for (int j = 0; j < a.length; j++) {
				
			}
			
			
			if(fruit[ch].equals(fruit[0])) {			
				apple++;
			} else if (fruit[ch].equals(fruit[1])) {
				banana++;
			} else if (fruit[ch].equals(fruit[2])) {
				kiwi++;
			} else if (fruit[ch].equals(fruit[3])) {
				orange++;
			} else if (fruit[ch].equals(fruit[4])) {
				peach++;
			} else if (fruit[ch].equals(fruit[5])) {
				strawberry++;
			} else if (fruit[ch].equals(fruit[6])) {
				pineapple++;				
			
			}
			System.out.println(count);
		}
		}
		
	
		
		System.out.printf("사과의 나온횟수 [%d], 바나나의 나온횟수 [%d] 키위의 나온횟수 [%d]\n", apple, banana, kiwi);
		System.out.printf("오렌지의 나온횟수 [%d], 복숭아의 나온횟수 [%d] 딸기의 나온횟수 [%d] 파인에플의 나온횟수 [%d]" , orange, peach, strawberry, pineapple);
	}
}
