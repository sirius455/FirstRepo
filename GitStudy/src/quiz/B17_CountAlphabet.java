package quiz;

import java.util.Scanner;

public class B17_CountAlphabet {
	
	/*
	   ����ڷκ��� ������ �ϳ� �Է¹ް�
	   �ش� ���忡 � ���ĺ��� �� �� �����ߴ��� ��� ��� ����غ�����
	 (��ҹ��� ���о��� ����) 
	  
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		System.out.print("������ �Է����ּ��� : ");
		
		String sentence = sc.nextLine();
		
		// # ���ڿ��� ���� �빮�� �Ǵ� �ҹ��ڷ� ��ȯ�ϱ�
		sentence = sentence.toUpperCase();
		
		int[] count = new int[26];
		
		for (int i = 0; i < sentence.length(); ++ i) {
			
			char ch = sentence.charAt(i);
			
			if(ch >= 'A' && ch <= 'Z') {
			count[ch - 'A']++;
						
			System.out.println(ch);
		}
		}
		
	}
}
		
	

