package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class D01_StudentList {
	
	/*
	  	�л� Ŭ������ ��ҷ� ���� ArrayList�� �����ϰ� �л��� 30�� �߰��غ�����
	  	
	  	1. �� �л��� ������ �������� �����˴ϴ�.
	  	
	  	2. ������ ��/��/�� �ۿ� �����ϴ�
	  	
	  	3. 30���� ����� ������ּ���
	  	
	  	4. 30���� ���� ������ ���� �л��� �̸��� ������ ������ּ���
	  	
	  	5. �̸��� ������ ���� �����˴ϴ�.
	  	
	  		�л�000000
	  		�л�000001
	  		�л�000002
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
		
		
		student.add("�л�00000" + i + " ����: " + korean + " ����: " + math + " ����: " + english + 
				" ����: " + (korean + math + english) + " ���: " + (korean + math + english) / 3 + "\n");	
		
		if((korean + math + english) >= max) {
			max = (korean + math + english);
		}
		
		
		sum += korean + math + english;
		mean = (sum/3) / student.size();;
		
		
	}
	
	///Collections.sort(student);
	System.out.println(student);
	System.out.println("30���� ��� : " + mean);
	//System.out.println(student.get(29));
	System.out.println("�ְ��� " + max);
	}
}
