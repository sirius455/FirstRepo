package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C13_InputRightThing {

	/*
	 * ����ڷκ��� ���ڸ� ����� �Է¹��� ������ ��� �Է¹޴� ���α׷��� �������� (�߸��� ���� �ԷµǾ �������� ���� �ʰ�, �ùٸ� ����
	 * �ԷµǸ� ��� �� ���α׷� ����)
	 */

	public static void main(String[] args) {

		int a = inputInt("���� > ");
		int b = inputInt("�ι�° ���� > ");

		System.out.println("input �Լ��� �Է¹��� ��: " + a);
		System.out.println("input �Լ��� �Է¹��� ��: " + b);
		System.out.println("���α׷��� ���������� ����Ǿ����ϴ�.");

//		Scanner sc = new Scanner(System.in);
//
//		int a;
//
//		while (true) {
//
//			try {
//				System.out.print("���� : ");
//				int num = sc.nextInt();
//				System.out.println("�Է��Ͻ� ���� " + num + "�Դϴ�. ");
//				break;
//			} catch (InputMismatchException e) {
//				System.out.println("�߸����Է��Դϴ� ");
//				String stuck = sc.nextLine();
//				System.out.println("�ɷ��ִ� �� ��  : " + stuck );
//			}
//
//		}
//		
//		System.out.println("���α׷��� ���������� ����Ǿ����ϴ�.");

	}

	Scanner sc = new Scanner(System.in);

	public static int inputInt(String message) {

		Scanner sc = new Scanner(System.in);
		int num;

		while (true) {
			try {
				System.out.println(message);
				num = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				sc.nextLine();
			}
		}
		// sc.close(); // �� �̻� ���� ���� ��ĳ�ʸ� ����
		return num;
	}
}
