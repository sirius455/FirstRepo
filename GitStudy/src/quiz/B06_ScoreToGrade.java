package quiz;

import java.util.Scanner;

public class B06_ScoreToGrade {
	
	/*
	   
	   점수를 입력받으면 점수에 해당하는 등급을 출력해주는 프로그램을 작성해보세요
	   
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.print("점수를 입력하세요 : ");
	    
	    int score = sc.nextInt();
	    
	    char grade;
	    
	    grade = 'F';
	    
	    if (score < 0 || score > 100) {
	    	System.out.println("잘못된 점수입력입니다.");
	    } else if (score >= 90) {
	    	grade = 'A';
	    } else if (score >= 80) {
	    	grade = 'B';
	    } else if (score >= 70) {
	    	grade = 'C';
	    } else if (score >= 60) {
	    	grade = 'D';
	    } 
	    
	    System.out.printf("당신은 점수 %d점으로 [ %c ] 입니다. \n", score, grade);
	}

}