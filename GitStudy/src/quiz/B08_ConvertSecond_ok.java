package quiz;

import java.util.Scanner;

public class B08_ConvertSecond_ok {
	
	/*
	 	�ʸ� �Է¹����� ��/��/�ð�/��/�� ��ȯȭ�� ����� ������
	 	
	 	���ʿ���� ������ ������� ����
	    ex: 0�� 0�� 5�ð� 0�� 20���� ��� 0�� 0���� ������ �ʾƾ� ��
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ʸ� �Է����ּ��� : ");
		
		int time = sc.nextInt(); 
		
		int year = 31536000;
		int day = 86400;
		int our = 3600;
		int min = 60; 
		
		if(time < 1) {
			System.out.println("�߸��� �Է��Դϴ�.");
		} else if (time >= year){
			System.out.printf("�Է��Ͻô� �ʴ� [%d]�� [%d]�� [%d]�� [%d]�� [%d]���Դϴ�.",
					(time/year) , (time%year)/day , (time%day)/our , (time%our)/min , (time%min));
		} else if (time >= day){
			System.out.printf("�Է��Ͻô� �ʴ� [%d]�� [%d]�� [%d]�� [%d]���Դϴ�.",
					(time%year)/day , (time%day)/our , (time%our)/min , (time%min));
		} else if (time >= our){
			System.out.printf("�Է��Ͻô� �ʴ�  [%d]�� [%d]�� [%d]���Դϴ�.",
					(time%day)/our , (time%our)/min , (time%min));
		} else if (time >= min){
			System.out.printf("�Է��Ͻô� �ʴ� [%d]�� [%d]���Դϴ�.",
					(time%our)/min , (time%min));
		} else {
			System.out.println( time + "��");
		}
		
		
		//(time/31536120) + (time/86400) + (time/7200) 
		//+ (time/60) + (time));
	}
}
