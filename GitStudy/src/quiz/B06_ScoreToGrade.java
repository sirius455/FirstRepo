package quiz;

import java.util.Scanner;

public class B06_ScoreToGrade {
	
	/*
	   
	   ������ �Է¹����� ������ �ش��ϴ� ����� ������ִ� ���α׷��� �ۼ��غ�����
	   
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.print("������ �Է��ϼ��� : ");
	    
	    int score = sc.nextInt();
	    
	    char grade;
	    
	    grade = 'F';
	    
	    if (score < 0 || score > 100) {
	    	System.out.println("�߸��� �����Է��Դϴ�.");
	    } else if (score >= 90) {
	    	grade = 'A';
	    } else if (score >= 80) {
	    	grade = 'B';
	    } else if (score >= 70) {
	    	grade = 'C';
	    } else if (score >= 60) {
	    	grade = 'D';
	    } 
	    
	    System.out.printf("����� ���� %d������ [ %c ] �Դϴ�. \n", score, grade);
	}

}