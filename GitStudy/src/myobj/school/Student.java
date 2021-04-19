package myobj.school;

import java.util.Random;

public abstract class Student {
	
	final static String[] lastnameList = {"강", "고", "구", "권", "김", "나",
			"박", "최", "오", "제갈", "독고", "이", "신", "차", "남궁", "배", "서",
			"경", "임", "안",
	};
	
	final static String[] firstnameList = {"태현", "태환", "태영", "태희", "태욱", "태준",
			"세현", "재선", "현식", "혜승", "지혜", "우현", "예림", "승미", "광민", "충민", "승운",
	};
	
	String name;
	int sno;
	int kor;
	int eng;
	
	Random ran;
	
	public Student(int sno) {
		this.sno = sno;
		
		ran = new Random();
		
		kor = getRandomScore();
		eng = getRandomScore();
		name = getRandomname();
	}
	// 하위클래스에서 작성 
	public abstract void printGradeCard();
	
	int getRandomScore() {
		return ran.nextInt(101);
	}
	
	String getRandomname() {
		return lastnameList[ran.nextInt(lastnameList.length)] +
				firstnameList[ran.nextInt(firstnameList.length)];
	}
}
