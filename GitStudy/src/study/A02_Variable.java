package study;

public class A02_Variable {
	
	public static void main(String[] args) {
		
		/*
		    # 변수(variavle)
		    - 데이터를 담을 수 있는 공간
		    - 자바에서는 변수를 반드시 선언한 뒤에 사용해야 한다.
		    - 변수 선언시에는 그 변수에 저장될 데이터의 타입을 정해줘야 한다.
		    - ""나 ''가 없는 모든 문자열 또는 문자는 변수이다.
		    - 같은 이름의 변수는 다시 선언할 수 없다.
		    
		    # 번수의 선언 (declare, declaration)
		    
		      #타입 변수명 : 값
		 */
		
		// int 타입의 변수 a를 앞으로 쭉 사용하겠다. (변수 선업)\
		// int는 정수만 저장가능한 타입 
		
		int a;
		// 원래 알고 있던 = : 두값이 서로 같다는 의미
		// 프로그래밍 언어에서의 = : 왼쪽의 변수에 오른쪽의 값을 넣어라 (값을 대입)
		a = 5000;
		int apple;
		apple = a+50;
		System.out.println(a);
		System.out.println(apple);
		
		//여러가지 변수선언 방식
		
		a=50;
		System.out.println(a);
		
		int b; // 변수 하나만 선언하기
		// 값이 한 번도 대입된적이 없는 변수는 사용할 수 없다.
		//(초기화 되지 않은 변수)
		
		//선언한 변수에 최초로 값을 대입하는 것을 '초기화(initialize, init)'라고 한다.
		b = 100;
		System.out.println(b);
		
		int c, d; //변수를 한번에 여러개 선언하기
		//선언을 안했으므로 사용한수 없는 상태이다.
		int e = 55; //변수 선언과 동시게 값을 대입
		
		//4. 변수 여러개를 선언과 동시에 값을 댕비
		
		int f= 99, g = 999;
		
		System.out.println("f에 들어있는 값 : " +f);
		System.out.println("g에 들어있는 값 : " +g);
		
		e = 50;
		System.out.println(e);
	}

}
