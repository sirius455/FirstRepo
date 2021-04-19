package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz2_ex {
	/*
	  	# 다음의 함수를 정의하고 올바르게 동작하는지 테스트 해보세요
	  	
	  	1. 최대값을 매개변수로 전달받으면
	  	   0부터 최대값 미만의 모든 값을 포함하는 int 배열을 생성하여 반환하는
	  	   range 함수를 만들어보세요
	  		ex : range(10)의 결과 -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	  	2. 최소값과 최대값을 매개변수로 받으면 그 사이에 존재하는
	 	      모든 값을 포함하는 int 배열을 생성하여 반환하는 
	  	   range함수를 만들어보세요(최소값 이상, 최대값 미만)
	  	   
	  	   ex : range(5, 10)의 결과 -> [5, 6, 7, 8, 9]
	  	   
	  	3. 최소값과 최대값과 증가값을 매개변수로 받으면 
	  	      최소값에서 시작하여 최대값까지 증가값만큼 증가하는 int 배열을 생성하여 반환하는
	  	   range 함수를 만들어 보세요 (최소값 이상, 최대값 미만)
	  	   
	  	   ex : range(50, 56, 5)의 결과 -> [50, 55]
	  	   		range(50, 55, 5)의 결과 -> [50]	
	  	   
	 */
	
	//최대값 미만의 수
	   public static int[] range(int end) {
		int[] bound = new int[end];
		
		for (int i = 0; i < end; i++) {
			bound[i] = i;
			
		}
		
		return bound;
	}
	   //최대 최소
	   public static int[] range(int start, int end) {
		   //수치가 잘못된 경우 return으로 함수를 빠르게 종료
		   if(start >= end) {
			   return null;
		   }
		   
			int[] bound = new int[end - start];

			for (int i = 0, num = start; i < bound.length; ++i, ++num) {
				bound[i] = num;
				}
			
			return bound;
		}
	   
	   // 매개변수의 개수 혹은 타입이 다르면 같은이름의 함수를 사용할 수 있다.
	   // (함수의 오버로딩, function overloading)
	   
	   //최대 최소 증가갑
	   public static int[] range(int start, int end, int increment) {
			
		   int len = (int)Math.ceil((end-start)/(double)increment);
		   
		   int[] bound = new int[len];
		   
		   for (int i = 0; i < bound.length; i++) {
			bound[i] = start;
			start += increment;
		}
		   
			return bound;
		}
	
	   
	public static void main(String[] args) {
		
		
		
		System.out.println(Arrays.toString(range(10)));
		// range 함수의 3번째 값을 불러온다
		System.out.println(range(10)[3]);
		System.out.println(Arrays.toString(range(10, 25)));
		System.out.println(Arrays.toString(range(25, 10)));
		System.out.println(Arrays.toString(range(50, 56, 5)));
	}
	
}

	
