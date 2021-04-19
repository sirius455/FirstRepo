package quiz;

import java.util.Scanner;

public class B08_ConvertSecond {
	
	/*
	 	�ʸ� �Է¹����� ��/��/�ð�/��/�� ��ȯȭ�� ����� ������
	 	
	 	���ʿ���� ������ ������� ����
	    ex: 0�� 0�� 5�ð� 0�� 20���� ��� 0�� 0���� ������ �ʾƾ� ��
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ʸ� �Է����ּ��� : ");
		
		int time = sc.nextInt(); 
		
		if(time < 1) {
			System.out.println("�߸��� �Է��Դϴ�.");
		} else if (time >= 31536000){
			System.out.println((time/31536000 + "��") + (time%31536000)/86400 + "��" + 
		    (time%86400)/3600 + "��"  + (time%3600)/60 + "��"  + (time%60) + "��");
		} else if (time >= 86400){
			System.out.println(time/86400 + "��" + 
				    (time%86400)/3600 + "��"  + (time%3600)/60 + "��"  + (time%60) + "��");
		} else if (time >= 3600){
			System.out.println( time/3600 + "��"  + (time%3600)/60 + "��"  + (time%60) + "��");
		} else if (time >= 60){
			System.out.println( time/60 + "��"  + (time%60) + "��");
		} else {
			System.out.println( time + "��");
		}
		
		
		//(time/31536120) + (time/86400) + (time/7200) 
		//+ (time/60) + (time));
	}
}
