package study;

public class A05_print {
	
public static void main(String[] args) {
		
		/*
		 
		 	#�ֿܼ� ����ϱ� ���� �������� �Լ���
		 	
		 	1. print()
		 		-���� �ڵ����� �ٲ��� �ʴ� ���� �⺻ ���
		 	2. println()
		 		-���� �ڵ����� �ٲ��ָ� ����ϴ� �Լ�
		 		-()�� ������ ������ �� �ڿ� '\n'�� �߰��Ͽ� ����Ѵ�
		 		-()�� �ƹ��͵� �������������� '\n'�� ����Ѵ�
		 		
		 	3. printf()
		 		-���� ���ڸ� �̿��� �� �ִ� ��� �Լ�
		 		-����� ���¸� �̸� �����, ���� ���� �ڸ��� ���� ä���� ����Ѵ�
		 		-���ڿ� +�� �̾���̴� �� ���� ������ ����ϴ� ��찡 ���Ҷ��� �ִ�
		 		-���� �ڵ����� �ٲ����� �ʴ´�.('\n'�� ���� �Է��ؾ��Ѵ�)
		 		
		 
		 */
		
		System.out.print("Hello");
		System.out.print("Hello");
		System.out.print("Hello");
		System.out.println();
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
		int year =2021, month = 3, day = 17, hour = 11, minute = 9, second=38,  millisec = 1234; 
		
		System.out.println(year + "�� " + month + "�� " + day +"�� /" +
				hour +": " +minute + ": " + second +"." + millisec);
		//%d �ڸ��� ���ڸ� �ϳ��� ä���� ����Ѵ�
		System.out.printf("%d�� %d�� %d�� / %d:%d:%d.%d\n",
			year, month, day, hour, minute, second, millisec);
		
		/*
		  	#���� ������ ����
		  	
		  		%d : �ش��ڸ��� ������ ������  10������ ������ش�.
		  		%x %X : �ش��ڸ��� ������ ������  16������ ������ش�.(%X�� �빮��)
		  		%o : �ش��ڸ��� ������ ������  8������ ������ش�.
		  		%f : �ش��ڸ��� ������ ������  �Ǽ��� ������ش�.
		  		%c : ���� (character)
		  		%s : ���ڿ�(string)
		  		
		 */
		
		int testNum = 25;
		
		System.out.printf("16�����δ� %d�� %x�Դϴ�.\n", testNum, testNum);
		System.out.printf("16�����δ� %d�� %X�Դϴ�.\n", testNum, testNum);
		System.out.printf("8�����δ� %d�� %o�Դϴ�.\n", testNum, testNum);
		System.out.printf("10�����δ� %d�� %d�Դ�\n", testNum, testNum);
		
		// #���Ĺ��� �ɼǵ�
		//	*���Ĺ��� �ڸ����� d�� �־�� �ϴ� ���� �ƴ�
		//%����d : ���ڸ�ŭ ĭ�� Ȯ���� �� ������ �����Ͽ� ����Ѵ�
		
		System.out.printf("��� : %d��\n", 10);
		System.out.printf("��� : %10d��\n", 10);
		System.out.printf("��� : %20d��\n", 10);
		
		System.out.printf("[[%s]]\n", "Hello, World!");
		System.out.printf("[[%25s]]\n", "Hello, World!");
		System.out.printf("[[%50s]]\n", "Hello, World!");
		
		
		//%-����d : ���ڸ�ŭ ĭ�� Ȯ���� �� ������ �����Ͽ� ����Ѵ�
		System.out.printf("��� : %d��\n", 10);
		System.out.printf("��� : %-10d��\n", 10);
		System.out.printf("��� : %-20d��\n", 10);
		
		System.out.printf("[[%s]]\n", "���");
		System.out.printf("[[%-7s]]\n", "��");
		System.out.printf("[[%-10s]]\n", "�ٳ���");
		
		//%0����d : ���ڸ�ŭ ĭ�� Ȯ���� �� �� ĭ�� 0�� ä���� ����Ѵ�.
		System.out.printf("%d��\n", 5);
		System.out.printf("%02d��\n", 5);
		System.out.printf("%03d��\n", 5);
		System.out.printf("%010f��\n", 3.141234);
		System.out.printf("%020f��\n", 3.141234);
		
		// %+d : ����տ��� ��ȣ�� �ٿ��ش�
		System.out.printf("���: %d, ����: %d\n", 5, -5);
		System.out.printf("���: %+d, ����: %+d\n", 5, -5);
		
		//%.����f : �Ҽ� �ڸ����� �����Ѵ�
		double avg = 123.125555;
		
		System.out.printf("������� : %f\n", avg);
		System.out.printf("������� : %.2f\n", avg);
	
		
	}

}
