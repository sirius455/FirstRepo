package study;

public class A01_Escape {
	
	public static void main(String[] args) {
		/*
		  
		  	#Escape ����
		  		
		  		-Ư���� ����� ���� ���ڵ�
		  		-�׳� ����Ϸ��� �ϸ� ������ �߻��ϴ� Ư���� ���ڵ�
		  		-�տ� \(��������)�� ���� ���ڴ� Escape���ڷ� �����Ѵ�
		  		-�տ� ���� \�� �ڿ� ���ڰ� �������� �ϳ��� ���ڷ� �νĵȴ�		 
		 */
		
		
		System.out.println("1. �ȳ��ϼ���, �ݰ����ϴ�.");
		
		// \n : �� �ٲ��� ����� ���� Ư�� ����(linefeed, breakline, newline, ...)
		System.out.println("2. �ȳ��ϼ���, ��\n��\n���ϴ�.");
		
		// \t : tabŰ�� ����� ���� Ư�� ����
		System.out.println("3. �ȳ��ϼ���, ��\t��\t���ϴ�.");
		
		// \\: Escape������ ����� �̿����� �ʰ� �׳� ����ϰ� ���� ��
		System.out.println("3. �ȳ��ϼ���, ��\\t��\\t���ϴ�.");
		// ex > Jdk�� ��Ḧ ����ϰ� ���� ��
		System.out.println("c:\\program Files\\JAVA\\JDK");
		
		// \" : �׳� ū ����ǥ�� ����ϰ� ���� �� ����Ѵ�
		System.out.println("������ �������� \"�Ŷ��\"�� �Ծ�߰ڴ�.");
		
		// \' : �׳� ���� ����ǥ�� ����ϰ� ���� �� ����Ѵ�
		System.out.println('\'');
	}

}
