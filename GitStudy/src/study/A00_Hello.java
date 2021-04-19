package study;

/*
   #�ּ��� ���α׷��Ӱ� �ϰ������ �ϴ°� 
   �ؿ� ���� ����ڹٸ� ����Ѵ�.
   Eclipse ����� ����
   
   ctrl + [+,-] :���� ũ�� ����
   ctrl + f11 : �ҽ� �ڵ� ������ �� ����(run)
   alt + ����Ű : �ҽ��ڵ� ������ ������� �̵�(�� �ȱ��
   - tap : �鿩����
	- shift + tap : �Ųٷ� �鿩����
	- shift + end : Ŀ���� ���� ��ġ���� �� �ڱ��� �������
	- shift + home : Ŀ���� ���� ��ġ���� �� �� �ձ��� �������
) */
/* �������� ����Ҽ� �ִ� �ּ�*/
// ���ٸ� ����Ҽ��ִ� �ּ� //
/**����ȭ hello = �ȳ� �ּ� */
// public class�� �̸��� �ݵ�� ���ϸ�� ���ƾ��Ѵ�. // 
// ���� ���� ������ ���� �װ��� Ŀ���� �ΰ� F2�� ������
// ������ ���� ������ �ذ�å�� �����ִ�.
public class A00_Hello {
	
	/*
	 * # main()�Լ�
	 * 
	 *  - ���α׷��� ���� ����
	 *  - ����ڰ� ���α׷��� �����ϸ� ���� ���� main() �Լ��� ã�Ƽ� �����Ų��
	 *  - main()�Լ��� ������ �߰�{}�� �����ȴ�.
	 
		�Լ� = � �ܾ� �ڿ�  ()�� �ִ� ���� ��� �Լ���� �θ���.
	    
    	# �ܼ�
    		- ���ڸ� ������ ���� ȭ�� (���� ��ǻ�� ȭ��)
    		- Eclipse������ �׽�Ʈ������ �Ͼ� ������ �ܼ��� �����Ѵ�
    		- ctrl + F11�� ������ �츮�� ���� ���α׷��� 
    		  �׽�Ʈ�� �ܼ� �󿡼� ������ �� �� �ִ�.
    		- �츮�� ���� �ҽ� �ڵ�(.java)�� �������(.class) bin������ ����Ǿ� �ִ�   
	     
	    GUI ȯ�� = �������̴� ȯ��
	 */
	public static void main(String[] args) {
		// ���α׷� ��������
		
		// #System.out.println()�� �Լ���
		/* -()�ȿ� ������ �����͸� �ֿܼ� ����ϴ� �Լ�
		 * */
		System.out.println("hello, world!");
		System.out.println("����������������������������������������");
		System.out.println("�� 1. New Game      ��");
		System.out.println("�� 2. Load Game     ��");
		System.out.println("�� 3. Exit          ��");
		System.out.println("����������������������������������������");
		System.out.println(12345+55);
		System.out.println("hello, world! 5");
		/* �ڹ��� �����͵� (���ͷ�)
		 * 1. ""���̿� ���� �͵� : ���ڿ�(String), ���ڸ� ������ �� �� �ִ� ������ Ÿ��
		 * 2. ''���̿� ���� �� : ����(character), ���� �� �ϳ��� �� �� �ִ� ������ Ÿ��
		 * 3. ���ڸ� ���� �� : ����(Integer)
		 * 4. �Ҽ��� ���� �� : �Ǽ�(Float, Double)
		 * 5. true, false
		 */
		System.out.println("ABCDEFG");
		System.out.println('��');
		System.out.println('��');
		System.out.println('��');
		System.out.println('��');
		System.out.println(1000+500);
		System.out.println(123.45678 + 10.5);
		System.out.println(true);
		System.out.println(false);
		
		// # ���ڵ��� �����δ� ���ڰ��� ������ �ִ�.
		// �츮���� ���϶��� ���ڷ� ���̴� ���̴�
		System.out.println('A');
		System.out.println((int)'A');
		System.out.println((int)'��'); // (int)�� ��Ȱ - ���ڸ� ���ڷ� ���̰� ��
		System.out.println((int)'��');
		System.out.println((char)54621); // (char)�� ��Ȱ - ���ڸ� ���ڷ� ���̰���
		System.out.println((char)54622);
		System.out.println((int)'��');
		
		System.out.println((char)('A'+ 1));
		System.out.println((char)('A'+ 0));
		System.out.println((char)('A'+ 2));
		System.out.println((char)('A'+ 3));
		System.out.println((char)('a'+ 1));
		System.out.println((char)('a'+ 2));
		
		System.out.println((int)'a');
		
		//* # ���ڿ� Ÿ�԰� �ٸ� Ÿ���� ���ϸ� ����� �ϴ°��� �ƴ϶� �̾���δ�.
		System.out.println("A�� �������� ��� : "+ 'A');
		System.out.println("'A'�� �ڵ尪 : "+ (int)'A');
		System.out.println("'1'�� �ڵ尪 : "+ (int)'1');
		
		System.out.println("1" + 5);
		//���� 1 + ����5�⶧���� =15
		System.out.println('1' + 5);
		// '1'�� �ƽ�Ű�ڵ忡 �����̵ȴ� �� �ڵ尩 + ����
		System.out.println(1 + 5);
		// ���� + ����
		
		// # ���� + �Ǽ��� �Ǽ��� �ȴ�.
		System.out.println(10+10.123);
		
		//# ���� + ���ڴ� ������ �ȴ�.
		System.out.println('a'+ 10);
		System.out.println((char)('a'+ 10));
		
		// ; (����Ŭ��)
		// - �� ��ɾ �������� �˸���
		// ���α׷� ��
	}
}
	
		
