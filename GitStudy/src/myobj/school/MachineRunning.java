package myobj.school;

public class MachineRunning extends Student{
	
	static String[] subject_name = {"����", "����", "sta", "p1"};
	
	int sta;
	int p1;
	
	public MachineRunning(int sno) {
		super(sno);
		sta = getRandomScore();
		p1 = getRandomScore();
	}
	
	@Override
	public void printGradeCard() {
		System.out.printf("�й�\t�̸�\t%s\t%s\t%s\t%s\t����\t���\n",
				subject_name[0], subject_name[1], subject_name[2], subject_name[3]);
		
		System.out.printf("%X\t%s\t%d\t%d\t%d\t%d\t%d\t%.2f\n",
				sno, name, kor, eng , sta, p1, kor + eng + sta + p1,
				(kor + eng + sta + p1) / 4.0);
		
		System.out.println("----------------------------------------------------------------");
	}
		
	

}
