package quiz;

/*
[ 알맞은 조건식을 만들어보세요 ]

1. char형 변수 a가 'q'또는 'Q'일 때 true
   2. char형 변수 b가 공백이나 탭이 아닐 때 true
3. char형 변수 c가 문자('0' ~ '9')일 때 true
4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
5. char형 변수 e가 한글일 때 true
6. char형 변수 f가 일본어일 때 true        
7. 사용자가 입력한 문자열이 exit일 때 true
*/        

public class B05_CounditionQuizz2 {
	
	public static void main(String [] args) {
		
		char a = 'q';
		char b = 'y';
		char c = '0';		
		char d = 'Z';
		char e = '갉';
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
