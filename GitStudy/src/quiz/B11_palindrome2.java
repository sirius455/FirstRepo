package quiz;

import java.util.Scanner;

public class B11_palindrome2 {

	/*
	 * ����ڷκ��� �ܾ �ϳ� �Է¹ް� �ش� �ܾ ȸ���̶�� "PALINDROME"�� ��� ȸ���� �ƴ϶�� "NOT PALINDROME"��
	 * ����غ�����
	 * 
	 * ȸ��? MON. BOB���� �¿��Ī�� �ܾ�
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��� �ּ��� > ");
		String str = sc.nextLine();
		
		boolean palindrome = true;
		
		for (int i = 0, j = str.length()- 1; i < str.length() / 2; ++i, --j ) {
			
			//System.out.printf("'%c' VS '%c'\n", word.charAt(i), word.charAt(j));
			
			if (str.charAt(i) != str.charAt(j)) {
				palindrome = false;
				break;
			}
			
		}
		System.out.println(palindrome ? "ȸ���Դϴ�." : "ȸ���� �ƴմϴ�.");
	}
}
