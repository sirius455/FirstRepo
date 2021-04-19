package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class D01_StudentList {
	
	/*
	  	학생 클래스를 요소로 갖는 ArrayList를 생성하고 학생을 30명 추가해보세요
	  	
	  	1. 각 학생의 점수는 랜덤으로 설정됩니다.
	  	
	  	2. 과목은 국/영/수 밖에 없습니다
	  	
	  	3. 30명의 평균을 출력해주세요
	  	
	  	4. 30명중 가장 총점이 높은 학생의 이름과 성적을 출력해주세요
	  	
	  	5. 이름은 다음과 같이 생성됩니다.
	  	
	  		학생000000
	  		학생000001
	  		학생000002
	 */
	public static void main(String[] args) {
		
	ArrayList<String> student = new ArrayList<>();
	
	int i;
	int sum = 0;
	int mean = 0;
	Random ran = new Random();
	int max = 0;
	
	for(i = 0; i < 30; i++) {
	
		int korean = ran.nextInt(101);
		int math = ran.nextInt(101);
		int english = ran.nextInt(101);
		
		
		student.add("학생00000" + i + " 국어: " + korean + " 영어: " + math + " 수학: " + english + 
				" 총점: " + (korean + math + english) + " 평균: " + (korean + math + english) / 3 + "\n");	
		
		if((korean + math + english) >= max) {
			max = (korean + math + english);
		}
		
		
		sum += korean + math + english;
		mean = (sum/3) / student.size();;
		
		
	}
	
	///Collections.sort(student);
	System.out.println(student);
	System.out.println("30명의 평균 : " + mean);
	//System.out.println(student.get(29));
	System.out.println("최고점 " + max);
	}
}
