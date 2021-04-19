package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz2 {
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
	   public static int[] interval_value(int num) {
		boolean[] divide = new boolean[num];
		int count = 0;

		for (int i = 0; i < num; ++i) {
			if (num > i ) {
				divide[i] = true;
				count++;
			}
		}

		int[] result = new int[count];
		int index = 0;

		for (int i = 0; i < divide.length; i++) {
			if (divide[i]) {
				result[index++] = i ;
			}
		}

		return result;
	}
	   //최대 최소
	   public static int[] max_min(int min, int max) {
			boolean[] divide = new boolean[max];
			int count = 0;

			for (int i = min; i < max; ++i) {
				if (max > i ) {
					divide[i] = true;
					count++;
				}
			}

			int[] result = new int[count];
			int index = 0;

			for (int i = 0; i < divide.length; i++) {
				if (divide[i]) {
					result[index++] = i ;
				}
			}

			return result;
		}
	   
	   //최대 최소 증가갑
	   public static int[] max_min_plus(int min, int max, int plus) {
			boolean[] divide = new boolean[max];
			int count = 0;

			for (int i = min; i < max; i += plus) {
				if (max > min) {
					divide[i] = true;
					count++;
				}
			}

			int[] result = new int[count];
			int index = 0;
 
			for (int i = 0; i < divide.length; i++) {
				if (divide[i]) {
					result[index++] = i ;
				}
			}

			return result;
		}
	

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(interval_value(10)));
		System.out.println(Arrays.toString(max_min(5, 10)));
		System.out.println(Arrays.toString(max_min_plus(0, 10, 2)));
	}
	
}

	
