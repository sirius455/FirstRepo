package quiz;

public class B04_ConditionQuiz {
	
	/*
    [ �˸��� �񱳿����� �������� ]
        
    1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true
    2. int�� ���� b�� ¦���� �� true                
    3. int�� ���� c�� 7�� ����� �� true
    4. int�� ���� hour�� 0�̸� 24�̻��� �ƴϰ�, 12�̻��� �� true
    5. int�� ���� d�� e�� ���̰� 30�� �� true                
    6. int�� ���� year�� 400���� ������ �������� true  
       �Ǵ� 4�� ������ �������� 100���� ����������� ���� �� true
    7. �μ��� ö������ 2�� ������ true
    8. �μ��� ö������ ������ 3�� ������ true  
    9. boolean�� ���� powerOn�� false�� �� true
    10. ���ڿ� �������� str�� "yes"�� �� true
*/        
	
	public static void main(String[] args) {
		
		int a = 11;
		int	b = 8;
		int c = 14;
		int hour = 15;
		int d = 3;
		int e = 33;
		int year = 400;
		int minsu_age = 22;
		int chulsu_age =20;
		int minsu_birth = 6;		
		int chulsu_brith = 9;
		boolean powerOn = false;
		String str = "yes";
		
		System.out.println(10 < a && a < 20);
		System.out.println(b % 2 == 0);
		System.out.println(c % 7 == 0);
		System.out.println(0 < hour && hour < 24 && hour >= 12);
		System.out.println(!(hour < 0 || hour >= 24) && hour >= 12);
		System.out.println((d - e) == 30 || (d - e) == -30);
		System.out.println(Math.abs(d-e) == 30);
		System.out.println(year % 400 == 0 || (year % 4 == 00 && year % 100 != 0));
		System.out.println((minsu_age - chulsu_age) == 2);
		System.out.println((minsu_birth - chulsu_brith) == -3);
		System.out.println(powerOn != true);
		
		// ���ڿ�(������ Ÿ��)�� ==���� ���ϸ� �ȵȴ�.
		// ������ Ÿ���� ���� ���� ���� �ش� Ŭ������ ���ǵ��� �ִ� equals()���
		// �޼��帣 �̿��ؾ� �Ѵ�
		System.out.println(str == "yes");
		System.out.println(str.equals("yes"));
		
		// #�⺻�� Ÿ�԰� ������ Ÿ���� ������
		// - �⺻ Ÿ���� ���� �������� ũ�⸦ �����ϱ� ����
		// (�������� ���̴� �޸𸮸� ����Ѵ� stack)
		// - ������ Ÿ���� ���� �������� ũ�⸦ �����ϱ� ��ƴ�
		// (�������� �� ���� �޸𸮸� ����Ѵ� heap)
		
		String str1 = "yes";
		String str2 = new String("yes");
		String str3 = "yes";
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1 == str3 : " + (str1 == str3));
	}

}
