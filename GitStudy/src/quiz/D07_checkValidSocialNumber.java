package quiz;

public class D07_checkValidSocialNumber {
	
	/*
	  	����ڰ� �ֹε�� ��ȣ�� �Է��ϸ�
	  	�� �ֹε�� ��ȣ�� ��ȿ���� �˻��ϴ� ���α׷��� ����� ������
	  	
	  	�Ǿ�2�ڸ� ����
	  	���ڸ��� 01~12�̳��� ����
	  	���ڸ��� 01~31�̳��� ����
	  	(1, 3, 5, 7, 8, 10, 12���̸� 31 / 4, 6, 9, 11���̸� 30 / 2���� �����϶� 29 �ƴϸ� 28)
	  	7��° �ڸ� '-' 
	  	�Ǿ��ڸ� 1 ~ 4
	 */
	
	private static boolean checkNumeric(char ch) {
		return ch >= '0' && ch <= '9'; 
	}
	
	public static boolean checkValidSociaNumber (String SociaNumber) {
		int len = SociaNumber.length();
		
		if(len !=14) {
			System.out.println("[invalid] ���̰� �ùٸ��� ����");
			return false;
		}
		
		for (int i = 0; i < len; i++) {
			
			char ch = SociaNumber.charAt(i);
			
			if(i < 2 && !checkNumeric(ch)) {
				System.out.println("[invalid] �Ǿ� 2�ڸ��� ���� �ƴѰ��� ����");
				return false;
			} else if(i == 6 && ch != '-') {
				System.out.println("[invalid] ������ �ڸ��� �ùٸ��� ����");
				return false;
			} else if (i == 2  && !('0' <= ch && '2' > ch) ) {
				System.out.println("[invalid] ���ڸ��� �߸��Է��ϼ̽��ϴ�");
				return false;
			} else if ((i == 3 && SociaNumber.charAt(2) == '0' && !('0' <= ch && '9' >= ch))
					|| (i == 3 && SociaNumber.charAt(2) == '1' && !('0' <= ch && '2' >= ch))) {
				System.out.println("[invalid] ���ڸ��� �߸��Է��ϼ̽��ϴ�");
				return false;
			} else if ((i == 4 && !('0' <= ch && '3' >= ch)) || 
					(i == 4 && SociaNumber.charAt(2) == '0' && SociaNumber.charAt(3) == '2' && !('0' <= ch && '2' >= ch))) {
				System.out.println("[invalid] ���ڸ��� �߸��Է��ϼ̽��ϴ�");
				return false;
			} else if ((i == 5 && !('0' <= ch && '9' >= ch)) ||
					(i == 5 && SociaNumber.charAt(4) == '3' && !('0' <= ch && '1' >= ch)) ||
					(i == 5 && SociaNumber.charAt(4) == '3' && SociaNumber.charAt(3) == '4' && !('0' == ch)) ||
					(i == 5 && SociaNumber.charAt(4) == '3' && SociaNumber.charAt(3) == '6' && !('0' == ch)) ||
					(i == 5 && SociaNumber.charAt(4) == '3' && SociaNumber.charAt(3) == '9' && !('0' == ch)) ||
					(i == 5 && SociaNumber.charAt(4) == '3' && SociaNumber.charAt(2) == '1' && SociaNumber.charAt(3) == '1' && !('0' == ch))) {
				System.out.println("[invalid] ���ڸ��� �߸��Է��ϼ̽��ϴ�");
				return false;
			} else if(i == 7 && !('0' < ch && '3' >= ch)) {
				System.out.println("[invalid] ������ �߸��Է��ϼ̽��ϴ�");
				return false;
			} else if(i >= 7 && !checkNumeric(ch)) {
				System.out.println("[invalid] ���ڸ��� ���ڸ� �Է����ּ���");
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		if (checkValidSociaNumber("881231-1021546")) {
			System.out.println("�ùٸ� �ֹε�� ��ȣ�Դϴ�!");
		}
	}
	
	

}
