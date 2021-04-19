package quiz;

public class B04_ConditionQuiz {
	
	/*
    [ 알맞은 비교연산을 만들어보세요 ]
        
    1. int형 변수 a가 10보다 크고 20보다 작을 때 true
    2. int형 변수 b가 짝수일 때 true                
    3. int형 변수 c가 7의 배수일 때 true
    4. int형 변수 hour가 0미만 24이상이 아니고, 12이상일 때 true
    5. int형 변수 d와 e의 차이가 30일 때 true                
    6. int형 변수 year가 400으로 나누어 떨어지면 true  
       또는 4로 나누어 떨어지고 100으로 나누어떨어지지 않을 때 true
    7. 민수가 철수보다 2살 많으면 true
    8. 민수가 철수보다 생일이 3달 빠르면 true  
    9. boolean형 변수 powerOn이 false일 때 true
    10. 문자열 참조변수 str이 "yes"일 때 true
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
		
		// 문자열(참조형 타입)은 ==으로 비교하면 안된다.
		// 참조형 타입의 값을 비교할 때는 해당 클래스에 정의도어 있는 equals()라는
		// 메서드르 이용해야 한다
		System.out.println(str == "yes");
		System.out.println(str.equals("yes"));
		
		// #기본형 타입과 참조형 타입의 차이점
		// - 기본 타입은 내부 데이터의 크기를 예측하기 쉽다
		// (차곡차곡 쌓이는 메모리를 사용한다 stack)
		// - 참조형 타입은 내부 데이터의 크기를 예측하기 어렵다
		// (여기저기 막 쓰는 메모리를 사용한다 heap)
		
		String str1 = "yes";
		String str2 = new String("yes");
		String str3 = "yes";
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1 == str3 : " + (str1 == str3));
	}

}
