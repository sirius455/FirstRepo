package study;

public class A01_Escape {
	
	public static void main(String[] args) {
		/*
		  
		  	#Escape 문자
		  		
		  		-특수한 기능을 가진 문자들
		  		-그냥 출력하려고 하면 문제가 발생하는 특수한 문자들
		  		-앞에 \(역슬래시)가 붙은 문자는 Escape문자로 간주한다
		  		-앞에 붙은 \와 뒤에 문자가 합쳐져서 하나의 문자로 인식된다		 
		 */
		
		
		System.out.println("1. 안녕하세요, 반갑습니다.");
		
		// \n : 줄 바꿈의 기능을 가진 특수 문자(linefeed, breakline, newline, ...)
		System.out.println("2. 안녕하세요, 반\n갑\n습니다.");
		
		// \t : tab키의 기능을 가진 특수 문자
		System.out.println("3. 안녕하세요, 반\t갑\t습니다.");
		
		// \\: Escape문자의 기능을 이용하지 않고 그냥 출력하고 싶을 때
		System.out.println("3. 안녕하세요, 반\\t갑\\t습니다.");
		// ex > Jdk의 경료를 출력하고 싶을 때
		System.out.println("c:\\program Files\\JAVA\\JDK");
		
		// \" : 그냥 큰 따옴표를 출력하고 싶을 때 사용한다
		System.out.println("오늘은 점심으로 \"컵라면\"을 먹어야겠다.");
		
		// \' : 그냥 작은 따옴표를 출력하고 싶을 때 사용한다
		System.out.println('\'');
	}

}
