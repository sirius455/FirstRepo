package study;

public class B06_If {
	
	public static void main(String[] args) {
		
		/*
		  	#if문
		  	- ()안의 값이 true일 때  {}안의 내용을 실행한다
		  	- ()안의 값이 false일 때는 {}안의 내용을 무시한다
		  	- {}안에 들어갈 내용이 단 한 줄이라면 {}을 생략할 수 있다.
		  	
		  	#else if 문
		  	 - 위에 있는 if문이 실행되지 않았다면 if문처럼 동작한다
		  	 - else if는 단독으로 사용할 수 없다
		  	 - else if는 여러번 사용할 수 있다.
		  	 
		  	#else문
		  	 - 위에 있는 if, else if,가 모두 실행되지 않았다면 {}안의 내용을 무조건 실행한다.
		  	 - if 바로 다음에 쓸 수도 있다.
		  	 * else가 붙어있는 조건절은 최소 한번은 실행된다.
		  	
		 	*/
		int a = -9;
		
		if(a == 5) { 
			System.out.println("Hello");
			System.out.println("Hello2");
		
		}
		// 위에 있는 if문이 실행되었다면 아예 실행하지 않는다
		else if (a > 0) {
			System.out.println("Nice to meet you!");
		}else if (a > -10) {
			System.out.println("Greeting!");
		}else if (a > -20) {
			System.out.println("Good to see you!");
		}
		
		char ch = 'あ';
		
		if (ch >= '가' && ch <='힣') {
			System.out.println("ch에 들어있는 값은 한글입니다. " + ch);
		} else if (ch >= 0x3040 && ch <= 0x30FF) {
			System.out.println("ch에 들어있는 값은 일본어 입니다. " + ch);
		} else {
			System.out.println("ch에 들어있는 값은 한글이 아닙니다." + ch);
		}
		
		System.out.println("프로그램이 끝났습니다.");
		
	}
}