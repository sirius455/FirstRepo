package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz {
	
	/*
	 	# ������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ�غ�����
	 	
	 	 1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 	 2. ������ ���ڰ� 3�� ����̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 	 3. ���ڸ� �ϳ� �����ϸ� ���ڿ� "¦���Դϴ�" �Ǵ� "Ȧ���Դϴ�"�� ��ȯ�ϴ� �Լ�
	 	 4. ���ڸ� �����ϸ� �ش� ������ ����� ���  �迭 ���·� ��ȯ�ϴ� �Լ�
	 	 5. ������ ���ڰ� �Ҽ���� true�� ��ȯ�ϰ� �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 	 6. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
	 	 	factorial: (n)*(n-1)*(n-2) ...3*2*1	 	
	 */	
	public static void main(String[] args) {
		
		System.out.println(word('1'));
		System.out.println(multiple(30));
		System.out.println(oddtoeven(0));
		System.out.println(prime_number(8));
		System.out.println(fact(5));
		System.out.println(Arrays.toString(findDivide(40)));
	}
	// ���ĺ�
	public static boolean word(char userword) {
		
		
		return ( userword >= 'A' &&  userword <= 'Z' || userword >= 'a' &&  userword <= 'z');
	}
	
	// 3�� ���
	public static boolean multiple(int usernum) {

		boolean result = true;

		if (usernum % 3 == 0) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}
	// Ȧ��¦��
	public static String oddtoeven(int usernum) {

		String result = " ";

		if (usernum % 2 == 0) {
			result = "¦���Դϴ�";
		} else {
			result = "Ȧ���Դϴ�";
		}

		return result;
	}
	
	//�迭
	public static int[] findDivide(int usernum) {

		boolean[] divide = new boolean[usernum];
		int count = 0;
		
		for (int i = 1; i <= usernum; i++) {
			
			if (usernum % i == 0) {
				divide[i - 1] = true;
				count++;
			}
		}
		
		int[] result = new int[count];
		int index = 0;
		for (int i = 0; i < divide.length; i++) {
			if(divide[i]) {
				result[index++] = i + 1;
			}
		}
		return result;
	}
	
	// �Ҽ�
	public static boolean prime_number(int usernum) {

		boolean result = true;
		

		for (int i = 2; i <= usernum; i++) {
			
			int cnt = 0;
			
			for(int j = 2; j <= Math.sqrt(i); ++j) {
				
				if(i % j == 0) {
					cnt++;
					break;
				}
			}
			
			if(cnt == 0) {
				result = true;
			} else {
				result = false;
			}
		}
		
		return result;
	}
	
	//���丮��
	public static int fact(int usernum) {
		
		if (usernum == 2) {
			return 2;
		}
		
		return usernum * fact(usernum - 1);
		
//		for (int i = usernum - 1; i > 0; i--) {
//			
//			if(i > 0 ) {
//				usernum *= i;
//			}
//		}
//		
//		return usernum;		
	}
	
}
