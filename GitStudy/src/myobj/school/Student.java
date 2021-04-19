package myobj.school;

import java.util.Random;

public abstract class Student {
	
	final static String[] lastnameList = {"��", "��", "��", "��", "��", "��",
			"��", "��", "��", "����", "����", "��", "��", "��", "����", "��", "��",
			"��", "��", "��",
	};
	
	final static String[] firstnameList = {"����", "��ȯ", "�¿�", "����", "�¿�", "����",
			"����", "�缱", "����", "����", "����", "����", "����", "�¹�", "����", "���", "�¿�",
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
	// ����Ŭ�������� �ۼ� 
	public abstract void printGradeCard();
	
	int getRandomScore() {
		return ran.nextInt(101);
	}
	
	String getRandomname() {
		return lastnameList[ran.nextInt(lastnameList.length)] +
				firstnameList[ran.nextInt(firstnameList.length)];
	}
}
