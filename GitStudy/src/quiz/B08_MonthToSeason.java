package quiz;

import java.util.Scanner;

public class B08_MonthToSeason {
	
	/*
	 	����ڷκ��� ���� �Է¹����� �ش��ϴ� ������ ����غ�����
	 	(switch-case���� �̿�)
	  
	  
	 */
	
	public static void main(String[] args) {
		
		Scanner word = new Scanner(System.in);
		
		System.out.print("����� ���� �Է����ּ��� : ");
		
		int month = word.nextInt();
		String season;
		
		
		switch(month) {
		case 11: case 12: case 1: case 2:
			season = "�ܿ�";
			break;
		case 3: case 4: case 5:
			season = "��";
			break;
		case 6: case 7: case 8:
			season = "����";
			break;
		case 9: case 10:
			season = "����";
			break;	
		default:
			season = "�߸��� ����";
			break;
		}	
		
		System.out.printf("%d���� [%s]�Դϴ�.\n", month, season);
			
//		switch(month) {
//		case 11: case 12: case 1: case 2:
//			System.out.print("�ܿ��Դϴ�.");
//			break;
//		case 3: case 4: case 5:
//			System.out.print("���Դϴ�.");
//			break;
//		case 6: case 7: case 8:
//			System.out.print("�����Դϴ�.");
//			break;
//		case 9: case 10:
//			System.out.print("�����Դϴ�.");
//			break;	
//		default:
//			System.out.println("�߸��� �Է��Դϴ�.");
//			break;
//		}
	
		
	}

}