package quiz;

/*
[ �˸��� ���ǽ��� �������� ]

1. char�� ���� a�� 'q'�Ǵ� 'Q'�� �� true
   2. char�� ���� b�� �����̳� ���� �ƴ� �� true
3. char�� ���� c�� ����('0' ~ '9')�� �� true
4. char�� ���� d�� ������(�빮�� �Ǵ� �ҹ���)�� �� true
5. char�� ���� e�� �ѱ��� �� true
6. char�� ���� f�� �Ϻ����� �� true        
7. ����ڰ� �Է��� ���ڿ��� exit�� �� true
*/        

public class B05_CounditionQuizz2 {
	
	public static void main(String [] args) {
		
		char a = 'q';
		char b = 'y';
		char c = '0';		
		char d = 'Z';
		char e = '��';
		char f = 'd';
		String _string = "exit";
		
		System.out.println((int)d);
		
		System.out.println(a == (char)113 || a == (char)81);
		System.out.println(b != '\n'  && b != ' ' );
		System.out.println(c >= (char)48 && c <= (char)57);
		System.out.println(d >= (char)65 && d <= (char)122);
		System.out.println(e >= (char)12593 && d <= (char)55203);
		System.out.println(f >= (char)12354 && f <= (char)12532);
		System.out.println(_string.equals("exit") );
		
		
		
		
	}

}
