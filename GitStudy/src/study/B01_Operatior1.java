package study;

public class B01_Operatior1 {
	
	public static void main(String[] args) {
		/*
		 	#������(Operator1)
		 		- ����� �� ����ϴ� ��
		 		
		 	*/
		
		// # ��� ������
		
		int a = 10, b = 7;
		double c = 7.0;
		
		System.out.println("+ : " + (a + b));
		System.out.println("- : " + (a - b));
		System.out.println("* : " + a * b);
		
		//�������� ������ �� ���´�.
		System.out.println("/ : " + a / b); //������
		//������ �Ǽ��� ������ ��Ȯ�� ���� ����Ѵ�
		System.out.println("/ : " + a / c); 
		System.out.println("/(double) : " + a /(double)b);
		System.out.println("/(float) : " + a / (float)b);
		
		//�������� ���ϴ� ������
		System.out.println("% : " + a % b);
		//������ ���ϴ� ������
		System.out.println("���� : " + Math.pow(a, 3));
		//�������� ���ϴ� �Լ�
		System.out.println("������ : " + Math.sqrt(52.33));
		//���밪�� ���ϴ� �Լ�
		System.out.println("���밪 : " + Math.abs(-25));
		System.out.println("���밪 : " + Math.abs(-25));
		//�Ҽ� ù° �ڸ����� �ݿø�(Math.round()�Լ��� �Ҽ� ù° �ڸ������� �ݿø� �� �� �ִ�.	
		System.out.println("�ݿø� : " + Math.round(3.335));
		System.out.println("�ݿø� : " + Math.round(3.635));
		//�Ҽ� ��° �ڸ����� �ݿø�(���� ���ϴ� �ڸ����� �Ҽ����� �ø��� ����� �Ŀ� �ٽ� ������ �ش�)
		System.out.println("�ݿø� : " + Math.round(3.335*100)/100.0);
		
		//�ø��ϱ�
		System.out.println("�ø� : " + Math.ceil(1.011));
		//�����ϱ�	
		System.out.println("�ø� : " + Math.floor(1.999));
		
		//�� ū ����, �� ���� ����
		System.out.println("�� ū ���� ����� : " + Math.max(1000, 1500));
		System.out.println("�� ���� ���� ����� : " + Math.min(1000, 1500));
		
		System.out.println("* : " + (a ^ b)); // ^ = ������ �ƴϴ�.
		
		// # ��Ʈ����
		// &, |, ^, >>, <<
		System.out.println("a & b : " + (a & b));  //AND �Ѵ� 1�̿��� �̴�.
		System.out.println("a | b : " + (a | b));  //OR ���� �ϳ��� 1�̿��� 1�̴�.
		System.out.println(a ^ b); //XOR ���ΰ����� 0 �ٸ��� 1�̴�.
		System.out.println(8 << 2); //SHIFT �������� ��Ʈ�� ���ڸ�ŭ �δ�.
		System.out.println(8 >> 2); //SHIFT
	}
}
