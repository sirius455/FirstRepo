package myobj.school;

public class MachineRunning extends Student{
	
	static String[] subject_name = {"국어", "영어", "sta", "p1"};
	
	int sta;
	int p1;
	
	public MachineRunning(int sno) {
		super(sno);
		sta = getRandomScore();
		p1 = getRandomScore();
	}
	
	@Override
	public void printGradeCard() {
		System.out.printf("학번\t이름\t%s\t%s\t%s\t%s\t총점\t평균\n",
				subject_name[0], subject_name[1], subject_name[2], subject_name[3]);
		
		System.out.printf("%X\t%s\t%d\t%d\t%d\t%d\t%d\t%.2f\n",
				sno, name, kor, eng , sta, p1, kor + eng + sta + p1,
				(kor + eng + sta + p1) / 4.0);
		
		System.out.println("----------------------------------------------------------------");
	}
		
	

}
