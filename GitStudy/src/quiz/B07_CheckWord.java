package quiz;

import java.util.Scanner;

public class B07_CheckWord {
	
	public static void main(String[] args) {
		
		/*
		  
		  ����ڷκ��� �ܾ �ϳ� �Է¹ް�
		  ù ��° ���ڿ� ������ ��° ���ڰ� ��ġ�ϸ�  "OK"�� ���
		  �ƴ϶��  "NOT OK"�� ����غ�����
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ܾ �Է��� �ּ��� : ");
		
		// next() :  ���� �ܾ StringŸ������ �޾ƿ���(�������, \t)
		// apple banana orange = apple�� ������
		
		// nextLine() : ���� �� ���� StringŸ������ �޾ƿ��� (\n����)
		// i love you \n i hate you = i love you�� ������
		
		String word = sc.next();
		
		int lastIndex = word.length()-1;
		
		if (word.charAt(0) == word.charAt(lastIndex)) {
			System.out.println("OK");
		} else {
			System.out.println("NOT OK");
		}
		
		
	}

}