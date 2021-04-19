package study;

public class A03_VarTypes {
	
	public static void main(String[] args) {
		
		/*
		  
		  	# 정수타입
		  	    - byte
		  	    
		  	    1byte => 8bit
		  	    
		  	    - short (2byte signed 부호가있음)
		  	    2byte => 16bit
		  	    65536가지
		  	     short 양수의 범위 = 32767
		  	     short 음수의 범위 = -32768
		  	     
		  	    - char (2byte, unsigned 부호가없음)
		  	     2byte => 16bit
		  	     65536가지
		  	     양수의 범위만 나타냄 0~65535의 양수만 저장할 수 있는 타입
		  	     주로 문자 코드를 저장하는데에 사용한다 (문자 타입)
		  	     
		  	 	- int  (4byte)
		  	 	
		  	 	 4byte -> 32 bit
		  	 	 2 ^ 32 -> 4,294,967,296가지 
		  	 	 
		  	 	 양수범위 0~2,147,483,647
		  	 	 음수범위 `1 ~ -2,147,483,648
		  	 	
		  	 	- long (8byte)
		  	 	 8byte => 32bit
		  	 	2^64 -> 18,446,744,073,709,551,616가지
		  	 	...
		  */
		byte minByte = -128;
		byte maxByte = 127;
		System.out.println("byte타입에 저장할 수 있는 가장 큰 값은 " + maxByte + "이고,"
				+ "가장 작은 값은"  +  minByte + "입니다.");
		
		short minShort = -32768;
		short maxShort = 32767;
		System.out.println("short 타입에 저장할 수 있는 가장 큰 값은 " + maxShort + "이고,"
				+ "가장 작은 값은"  +  minShort + "입니다.");
		
		
		char maxChar = 65535;
		char minChar = 0;
		
		char ch = 65;
		System.out.println("char 타입에 저장된 값은 기본적으로 문자로 출력된다. " + ch);
		System.out.println("char 타입에 저장된 값은 코드값을 확인하고 싶으면 (int)를 붙인다. " + (int)ch);
		System.out.println("char 타입에 저장할 수 있는 가장 큰 값은 " + (int)maxChar + "이고, "
				+ "가장 작은 값은 "  +  (int)minChar + "입니다.");
		
		int maxInt = 2147483647;
		int minInt = -2147483648;
		System.out.println("int 타입에 저장할 수 있는 가장 큰 값은 " + maxInt + "이고, "
				+ "가장 작은 값은 "  +  minInt + "입니다.");
		// 숙제 
		
		long e = 10;
		// int의 범위를 넘어가는 숫자를 사용할 때는 L을 붙여야 한다.
		
		long _long = 2_147_483_648L;

		
		/*
		    # 실수 타입
		    
		    	-float(4byte)
		    	-double(8byte)
		        
		        실수는 주로 그래픽 계산에 사용된다.
		        부동 소수점 방식을 사용한다.
		 */
		// 그냥 소수만 적는것은 기본적으로 double타입니다.
		// float 타입의 소수는 뒤에 F를 붙여야 한다.
		float weight = 65.66F;
		double height = 177.77;
		
		
		/*
		        
		    # boolean 타입
		        
		        참과 거짓을 표현하는데에 사용되는 타입
		        값은 true와 false밖에 없다.
		        
		    # 참조형 타입 (클래스 타입)
		  
		 */
		boolean hasFood = true;
		boolean over130cm = false;
		
		/*
		 	#참조형 타입 (클래스 타입_
		 		
		 		참조형 타입은 기본형 타입들과는 다르게 대문자로 시작한다.
		 		-String : 문자열
		 		-그 외 모든 클래스들...
		 */
		String hellowMessage = "Hello, my name is john Doe.";
		String byeMessage = "Good bye. ";
		
		System.out.println(hellowMessage);
		System.out.println("hellowMessage");
		
		System.out.println(byeMessage + byeMessage + byeMessage);
		
		
		
	}

}
