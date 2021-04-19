package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz2 {
	/*
	  	# ������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����
	  	
	  	1. �ִ밪�� �Ű������� ���޹�����
	  	   0���� �ִ밪 �̸��� ��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
	  	   range �Լ��� ��������
	  		ex : range(10)�� ��� -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	  	2. �ּҰ��� �ִ밪�� �Ű������� ������ �� ���̿� �����ϴ�
	 	      ��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ� 
	  	   range�Լ��� ��������(�ּҰ� �̻�, �ִ밪 �̸�)
	  	   
	  	   ex : range(5, 10)�� ��� -> [5, 6, 7, 8, 9]
	  	   
	  	3. �ּҰ��� �ִ밪�� �������� �Ű������� ������ 
	  	      �ּҰ����� �����Ͽ� �ִ밪���� ��������ŭ �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
	  	   range �Լ��� ����� ������ (�ּҰ� �̻�, �ִ밪 �̸�)
	  	   
	  	   ex : range(50, 56, 5)�� ��� -> [50, 55]
	  	   		range(50, 55, 5)�� ��� -> [50]	
	  	   
	 */
	
	//�ִ밪 �̸��� ��
	   public static int[] interval_value(int num) {
		boolean[] divide = new boolean[num];
		int count = 0;

		for (int i = 0; i < num; ++i) {
			if (num > i ) {
				divide[i] = true;
				count++;
			}
		}

		int[] result = new int[count];
		int index = 0;

		for (int i = 0; i < divide.length; i++) {
			if (divide[i]) {
				result[index++] = i ;
			}
		}

		return result;
	}
	   //�ִ� �ּ�
	   public static int[] max_min(int min, int max) {
			boolean[] divide = new boolean[max];
			int count = 0;

			for (int i = min; i < max; ++i) {
				if (max > i ) {
					divide[i] = true;
					count++;
				}
			}

			int[] result = new int[count];
			int index = 0;

			for (int i = 0; i < divide.length; i++) {
				if (divide[i]) {
					result[index++] = i ;
				}
			}

			return result;
		}
	   
	   //�ִ� �ּ� ������
	   public static int[] max_min_plus(int min, int max, int plus) {
			boolean[] divide = new boolean[max];
			int count = 0;

			for (int i = min; i < max; i += plus) {
				if (max > min) {
					divide[i] = true;
					count++;
				}
			}

			int[] result = new int[count];
			int index = 0;
 
			for (int i = 0; i < divide.length; i++) {
				if (divide[i]) {
					result[index++] = i ;
				}
			}

			return result;
		}
	

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(interval_value(10)));
		System.out.println(Arrays.toString(max_min(5, 10)));
		System.out.println(Arrays.toString(max_min_plus(0, 10, 2)));
	}
	
}

	
