package study;

/*
   #주석은 프로그래머가 하고싶은말 하는건 
   밑에 언어는 헬로자바를 출력한다.
   Eclipse 단축기 정리
   
   ctrl + [+,-] :글자 크기 조절
   ctrl + f11 : 소스 코드 컴파일 및 실행(run)
   alt + 방향키 : 소스코드 한줄을 마음대로 이동(줄 옴기기
   - tap : 들여쓰기
	- shift + tap : 거꾸로 들여쓰기
	- shift + end : 커서의 현재 위치부터 맨 뒤까지 블록지정
	- shift + home : 커서의 현재 위치부터 줄 맨 앞까지 블록지정
) */
/* 여러줄을 사용할수 있는 주석*/
// 한줄만 사용할수있는 주석 //
/**문서화 hello = 안녕 주석 */
// public class의 이름은 반드시 파일명과 같아야한다. // 
// 빨간 줄이 생겼을 때는 그곳에 커서를 두고 F2는 누르면
// 에러에 대한 정보와 해결책을 볼수있다.
public class A00_Hello {
	
	/*
	 * # main()함수
	 * 
	 *  - 프로그램의 시작 지점
	 *  - 사용자가 프로그램을 시작하면 가장 먼저 main() 함수를 찾아서 실행시킨다
	 *  - main()함수의 범위는 중괄{}로 결정된다.
	 
		함수 = 어떤 단어 뒤에  ()가 있는 것은 모두 함수라고 부른다.
	    
    	# 콘솔
    		- 글자만 나오는 검은 화면 (옛날 컴퓨터 화면)
    		- Eclipse에서는 테스트용으로 하얀 바탕의 콘솔을 제공한다
    		- ctrl + F11을 누르면 우리가 만든 프로그램을 
    		  테스트용 콘솔 상에서 실행해 볼 수 있다.
    		- 우리가 만든 소스 코드(.java)의 결과물은(.class) bin폴더에 저장되어 있다   
	     
	    GUI 환경 = 눈에보이는 환경
	 */
	public static void main(String[] args) {
		// 프로그램 시작지점
		
		// #System.out.println()은 함수다
		/* -()안에 전달한 데이터를 콘솔에 출력하는 함수
		 * */
		System.out.println("hello, world!");
		System.out.println("┌──────────────────┐");
		System.out.println("│ 1. New Game      │");
		System.out.println("│ 2. Load Game     │");
		System.out.println("│ 3. Exit          │");
		System.out.println("└──────────────────┘");
		System.out.println(12345+55);
		System.out.println("hello, world! 5");
		/* 자바의 데이터들 (리터럴)
		 * 1. ""사이에 적는 것들 : 문자열(String), 문자를 여러개 쓸 수 있는 데이터 타입
		 * 2. ''사이에 적는 것 : 문자(character), 문자 단 하나만 쓸 수 있는 데이터 타입
		 * 3. 숫자를 적는 것 : 정수(Integer)
		 * 4. 소수를 적는 것 : 실수(Float, Double)
		 * 5. true, false
		 */
		System.out.println("ABCDEFG");
		System.out.println('한');
		System.out.println('글');
		System.out.println('자');
		System.out.println('☆');
		System.out.println(1000+500);
		System.out.println(123.45678 + 10.5);
		System.out.println(true);
		System.out.println(false);
		
		// # 문자들은 실제로는 숫자값을 가지고 있다.
		// 우리눈에 보일때만 문자로 보이는 것이다
		System.out.println('A');
		System.out.println((int)'A');
		System.out.println((int)'한'); // (int)의 역활 - 문자를 숫자로 보이게 함
		System.out.println((int)'가');
		System.out.println((char)54621); // (char)의 혁활 - 숫자를 문자로 보이게함
		System.out.println((char)54622);
		System.out.println((int)'핟');
		
		System.out.println((char)('A'+ 1));
		System.out.println((char)('A'+ 0));
		System.out.println((char)('A'+ 2));
		System.out.println((char)('A'+ 3));
		System.out.println((char)('a'+ 1));
		System.out.println((char)('a'+ 2));
		
		System.out.println((int)'a');
		
		//* # 문자열 타입과 다른 타입을 더하면 계산을 하는것이 아니라 이어붙인다.
		System.out.println("A의 보여지는 모습 : "+ 'A');
		System.out.println("'A'의 코드값 : "+ (int)'A');
		System.out.println("'1'의 코드값 : "+ (int)'1');
		
		System.out.println("1" + 5);
		//문자 1 + 숫자5기때문에 =15
		System.out.println('1' + 5);
		// '1'은 아스키코드에 적용이된다 즉 코드갑 + 숫자
		System.out.println(1 + 5);
		// 숫자 + 숫자
		
		// # 정수 + 실수는 실수가 된다.
		System.out.println(10+10.123);
		
		//# 정수 + 문자는 정수가 된다.
		System.out.println('a'+ 10);
		System.out.println((char)('a'+ 10));
		
		// ; (세미클론)
		// - 한 명령어가 끝났음을 알린다
		// 프로그램 끝
	}
}
	
		
