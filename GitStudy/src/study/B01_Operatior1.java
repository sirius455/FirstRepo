package study;

public class B01_Operatior1 {
	
	public static void main(String[] args) {
		/*
		 	#연산자(Operator1)
		 		- 계산할 때 사용하는 것
		 		
		 	*/
		
		// # 산술 연산자
		
		int a = 10, b = 7;
		double c = 7.0;
		
		System.out.println("+ : " + (a + b));
		System.out.println("- : " + (a - b));
		System.out.println("* : " + a * b);
		
		//정수끼리 나누면 몫만 나온다.
		System.out.println("/ : " + a / b); //나누기
		//정수와 실수를 나누면 정확한 값을 계산한다
		System.out.println("/ : " + a / c); 
		System.out.println("/(double) : " + a /(double)b);
		System.out.println("/(float) : " + a / (float)b);
		
		//나머지를 구하는 연산자
		System.out.println("% : " + a % b);
		//제곱을 구하는 연산자
		System.out.println("제곱 : " + Math.pow(a, 3));
		//제곱근을 구하는 함수
		System.out.println("제곱근 : " + Math.sqrt(52.33));
		//절대값을 구하는 함수
		System.out.println("절대값 : " + Math.abs(-25));
		System.out.println("절대값 : " + Math.abs(-25));
		//소수 첫째 자리에서 반올림(Math.round()함수는 소수 첫째 자리에서만 반올림 할 수 있다.	
		System.out.println("반올림 : " + Math.round(3.335));
		System.out.println("반올림 : " + Math.round(3.635));
		//소수 셋째 자리에서 반올림(먼저 원하는 자리까지 소수점을 올리고 계산한 후에 다시 나누어 준다)
		System.out.println("반올림 : " + Math.round(3.335*100)/100.0);
		
		//올림하기
		System.out.println("올림 : " + Math.ceil(1.011));
		//내림하기	
		System.out.println("올림 : " + Math.floor(1.999));
		
		//더 큰 숫자, 더 작은 숫자
		System.out.println("더 큰 숫자 남기기 : " + Math.max(1000, 1500));
		System.out.println("더 작은 숫자 남기기 : " + Math.min(1000, 1500));
		
		System.out.println("* : " + (a ^ b)); // ^ = 제곱이 아니다.
		
		// # 비트연산
		// &, |, ^, >>, <<
		System.out.println("a & b : " + (a & b));  //AND 둘다 1이여야 이다.
		System.out.println("a | b : " + (a | b));  //OR 둘중 하나만 1이여도 1이다.
		System.out.println(a ^ b); //XOR 서로같으면 0 다르면 1이다.
		System.out.println(8 << 2); //SHIFT 방향으로 비트를 숫자만큼 민다.
		System.out.println(8 >> 2); //SHIFT
	}
}
