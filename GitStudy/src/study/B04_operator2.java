package study;

public class B04_operator2 {
	
	public static void main(String[] args) {
		
		/* 
		  
		 # �� ������
		 - �� ������ ����� �� �Ǵ� �����̴� (boolean Ÿ���̴�)
		 - ��� ����� �񱳿����� �Բ� ������ ��� ������ ���� ����Ѵ�
		 
		*/
		
		int a = 8, b = 5;
		
		System.out.printf("a= %d, b = %d �� ��\n", a, b);
		System.out.println("a > b : " + (a > b));
		System.out.println("a < b : " + (a < b));
		System.out.println("a >= b : " + (a >= b));
		System.out.println("a <= b : " + (a <= b));
		
		System.out.println("a == b : " + (a == b)); // �� ���� ������ true
		System.out.println("a != b : " + (a != b)); // �� ���� �ٸ��� true
		
		/*
		  #�� ������
		  
		  -boolean Ÿ�� ������ �ϴ� ����
		  -&& : �� ���� ���� ��� true�� ���� true(AND)
		  -|| : �� ���� �� �� �ϳ��� true���� true (OR)
		  -!  : true�� false, false�� true (NOT)
		  
		 */
		
		System.out.println("\n----AND----");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("\n----OR----");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\n----NOT----");
		System.out.println(!true);
		System.out.println(!false);
		
		int x = 4, y = 5, z = 7;
		
		System.out.println(x > 5 && x % 3 ==0);
		System.out.println("3���� ����� ��� 3�� ����� ��� : "
				+ (x % 3 ==0 && y % 3 == 0 && z% 3 ==0));
		
		
	
		System.out.println("3���� ��� 3�ǹ���� �ƴҶ� : "
				+ (x % 3 !=0 && y % 3 != 0 && z% 3 !=0));
	}

}
