package quiz;

import java.util.Scanner;

public class B11_palindrome_ex {
	
	/*
	 	����ڷκ��� �ܾ �ϳ� �Է¹ް�
	 	�ش� �ܾ ȸ���̶�� "PALINDROME"�� ���
	 	ȸ���� �ƴ϶�� "NOT PALINDROME"�� ����غ�����
	 	
	 	*ȸ��? MON. BOB���� �¿��Ī�� �ܾ�
	 	
	 	*/
	
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.print("�ܾ� >> ");

		String str = sc.next();
		String anw = "PALINDROME";
		
		
		for(int i = 0; i < str.length() / 2; ++i) {
			char word = str.charAt(i);
			char word2 = str.charAt(str.length() - i -1);
			
			if (word != word2){
				anw = "NOT PALINDROME";
			}
			
				
//			System.out.println("-------------------------");
//			System.out.println("�̹��� �˻��� ���� :" + word);
//			System.out.println("���ϰ� �Ǵ� ���� :" + word2);
		}
		
		System.out.printf("[%s]�� ����� %s�Դϴ�.\n", str, anw );
	}
}