package quiz;

import java.util.Random;
import java.util.Scanner;

public class B17_CountRandomFruit {
		/* 
		  	1. ����ڷκ��� �迭�� ũ�⸦ �Է¹޴´�
		  	
		  	2. �ش� ũ�⸸ŭ�� �迭�� ���� ���� ���ڿ��� �����Ѵ�
		  	(apple, banana, kiwi, orange, peach, strawberry, pineapple)
		  	
		  	3. �� ������ �� �� �����ߴ��� ��� ����ϰ� ����غ���.
		  
		 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		System.out.print("�迭�� ũ�⸦ �Է����ּ��� : ");
		int arr = sc.nextInt();
		String[] fruit = new String[] { "apple", "banana", "kiwi", "orange", "peach", "strawberry", "pineapple"};
		int apple = 0, banana = 0, kiwi = 0, orange= 0, peach = 0, strawberry = 0, pineapple = 0;

		for (int i = 0; i < arr; ++ i) {
			
			//�迭�� �����Ұ�� ���������� �ϴ¹�??? .length
			int ch = ran.nextInt(fruit.length);
			
			if(ch <= arr || ch > arr) {
			String count = fruit [ch];
		
			//String �迭ũ�Ⱑ ������ ���� ���� ���ߴ°�..
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
		
	
		
		System.out.printf("����� ����Ƚ�� [%d], �ٳ����� ����Ƚ�� [%d] Ű���� ����Ƚ�� [%d]\n", apple, banana, kiwi);
		System.out.printf("�������� ����Ƚ�� [%d], �������� ����Ƚ�� [%d] ������ ����Ƚ�� [%d] ���ο����� ����Ƚ�� [%d]" , orange, peach, strawberry, pineapple);
	}
}
