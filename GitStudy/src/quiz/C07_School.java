package quiz;

import myobj.school.MachineRunning;
import myobj.school.NetWorkStudent;
import myobj.school.ProgrammingStudent;
import myobj.school.Student;



public class C07_School {

	int sno;
	
	public C07_School() {
		sno = 100000;
		
		Student[] program = new Student[30];
		Student[] network = new Student[30];
		Student[] machine_learning = new Student[30];
		
		for (int i = 0; i < program.length; ++i) {
			program[i] = new ProgrammingStudent(sno++);
			program[i].printGradeCard();
		}
		
		for (int i = 0; i <network.length; ++i) {
			network[i] = new NetWorkStudent(sno++);
			network[i].printGradeCard();
		}
		
		for (int i = 0; i <machine_learning.length; ++i) {
			machine_learning[i] = new MachineRunning(sno++);
			machine_learning[i].printGradeCard();
		}

	}
	
	public static void main(String[] args) {
	
	new C07_School();

		
//	Student[] program = new Student[30];
//	
//	for(int i = 0; i < program.length; ++i)  {
//		program[i] = new ProgrammingStudent();
//		program[i].printGradeCard();
//	}
//}
	}
}
