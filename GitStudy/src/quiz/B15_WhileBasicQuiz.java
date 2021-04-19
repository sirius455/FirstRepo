package quiz;

public class B15_WhileBasicQuiz {

	/*
	 * while���� �̿��Ͽ�
	 * 
	 * 1. 1���� 100������ 3�� ����� ����
	 * 
	 * 2. 200���� 1���� ���
	 * 
	 * 3. continue�� �̿��Ͽ� 300 ���� 500������ 7�� ����� ���
	 * 
	 * 4. 1���� 200������ ���� �� 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���ڵ��� ����
	 * 
	 */

	public static void main(String[] args) {

		int a = 0;
		int sum = 0;

		while (a++ <= 100) {

			if (a % 3 == 0) {
				sum += a;
			}
		}

		System.out.printf("1���� 100������ 3�� ����� ������ [%d]�Դϴ�.\n", sum);

		int b = 200;

		while (b >= 1) {
			System.out.println(b--);
		}

		int c = 299;

		while (c++ <= 500) {

			if (c % 7 != 0) {
				continue;
			}
			System.out.println(c);
		}

		int d = 0;
		int sum2 = 0;

		while (d++ < 200) {

			if (d % 2 != 0 && d % 3 != 0) {

				sum2 += d;
			}

		}

		System.out.printf("1���� 200������ 2�ǹ���� 3�� ������ƴѰ��� ���� [%d]�Դϴ� ", sum2);

	}

}
