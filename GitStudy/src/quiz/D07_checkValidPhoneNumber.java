package quiz;
import java.util.Scanner;

public class D07_checkValidPhoneNumber {
	
	


	/*
	  	����ڷκ��� �ڵ�����ȣ�� �Է¹�����
	  	�ùٸ� ��ȭ��ȣ���� �����ϴ� ���α׷��� ��������	  
	  	���� 3�ڸ��� ����
	  	2��° ���ڴ� 3�ڸ� Ȥ�� 4�ڸ�
	  	����° ���ڴ� 4�ڸ� 
	  	4��° �Ǵ� 8��°  �Ǵ�9��° ���ڴ� '-'
	*/
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String phoneNumber;
		
		
		System.out.print("�ڵ��� ��ȣ�� �Է��ϼ��� >");
		phoneNumber = sc.nextLine();
		
		for (int i = 0; i < phoneNumber.length(); i++) {
			char num = phoneNumber.charAt(i); 
			
			if(!(13 >= phoneNumber.length() || 12 < phoneNumber.length())) {
				System.out.println("�߸��� �Է��Դϴ�");
				break;
			} else if (i < 3) {
				if(!('0' <= num && '9' >=num)) {
					System.out.println("�߸��Է��ϼ̽��ϴ�");
					break;
				}		
			} else if((i == 3 || i == 7 || i == 8)) {
				if(num != '-') {
					System.out.println("�߸��Է��ϼ̽��ϴ�");
					break;
				}
			}
		}
		
		System.out.println(phoneNumber);
		// break;
	}
}
