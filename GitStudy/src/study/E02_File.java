package study;
import java.io.File;

public class E02_File {
	
	/*
	  	# java.util.File
	  	
	  	 - ���� �ý����� ���� ������ ���� �� �ִ� ���� Ŭ����
	  	 - �ν��Ͻ��� ����ִ� ������ �������� ���ο� �����̳� ���丮�� ������ �� �ִ�
	  	 - �̹� �����ϴ� ���� �Ǵ� ���丮�� ������ �ҷ����⵵�Ѵ�
	  
	 */
	
	public static void main(String[] args) {
		File a = new File("a.txt");
		File b = new File("b.txt");
		File dir = new File("D:/files");
		File dir2 = new File("D:/images/");
		
		System.out.println("�б� ��ȯ�� �ִ� �����ΰ���?" + a.canRead());
		System.out.println("���� ������ �ִ� �����ΰ���?" + b.canExecute());
		System.out.println("���� ������ �ִ� �����ΰ���?" + a.canWrite());
		
		//���� ��� �˾ƿ���
		System.out.println(a.getAbsolutePath());
		
		//a�� ��� ��ΰ� ���� ����ΰ�
		System.out.println(a.isAbsolute());
		
		// a�� ��� ���� �ν��Ͻ��� ���丮�ΰ�?
		System.out.println("Is a  directory? " + a.isDirectory());
		System.out.println("Is dir a directory? " + dir.isDirectory());
		
		System.out.println("a�� ���� �����ϴ°� " + a.exists());
		System.out.println("dir�� ���� �����ϴ°� " + dir.exists());
		System.out.println("dir2�� ���� �����ϴ°� " + dir2.exists());
		
		// ���� ���� ������ 
		if(!dir2.exists()) {
			dir2.mkdir();
		} else {
			System.out.println("�̹� �����ϴ� ���丮�Դϴ�.");
		}
	}
	
}
