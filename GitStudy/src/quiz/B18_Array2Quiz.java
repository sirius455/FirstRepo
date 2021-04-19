package quiz;

import java.util.Arrays;
import java.util.Random;

public class B18_Array2Quiz {
	
	public static void main(String[] args) {
		
		// 1. NUMARR의 모든 값을 0 ~ 100사이의 랜덤 정수로 바꿔보세요
		
		// 2. NUMARR의 총합과 평균 (소수점 둘재 자리)을 구해서 출력해보세요
		
		// 3. NUMARR의 각 행의 합을 모두 구해서 출력해보세요
		
		// 4. NUMARR의 각 열의 합을 모두 구해서 출력해보세요
		
		int[][] numArr = new int[][] {
			{1, 1, 1, 1,},
			{1, 1, 1, 1, 1, 1, 1},
			{1, 1, 1, 1, 1, 1},
			{1, 1,},
			{1, 1, 1, 1, 1}
		};
		
		
		Random ran = new Random();
		int random;
		int sum = 0;
		int count = 0;
		float mean = 0;
	
		
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				
				int ran2 = ran.nextInt(101);
				numArr[i][j] = ran2;
				
				int plus = numArr[i][j];
				count++;
				sum += plus;
				
				
				mean = sum/(float)count;							

			}

		}

		System.out.printf("numArr의 총합은 [%d], 나누기는 [%.2f]", sum, mean);
		
		int[] rowSum = new int[numArr.length];
		
		for (int i = 0; i < rowSum.length; i++) {
			
			for (int j = 0; j < numArr[i].length; j++) {
				rowSum[i] += numArr[i][j];
				
			}
			
		}
		// Arrays.toString(): 배열 편하게 출력하기
	    System.out.println("행의 합 : " + Arrays.toString(rowSum));
	    
	    //※ row : 행, column : 열
	    
	    
	    // 제일 긴 배열 찾기
	    int longest = 0;
	    for (int i = 0; i < numArr.length; ++i) {
	    	longest = Math.max(longest, numArr[i].length);
	    }
	    int[] colSum =  new int[longest];
	    
	    for (int i = 0; i < colSum.length; ++i) {
	    	
	    	for (int j = 0; j < numArr.length; ++ j) {
	    		
	    		
	    		if(numArr[j].length > i) {
	    			colSum[i] += numArr[j][i];
	    		}
	    	}
	    }
	    
	    System.out.println("열의 합: " + Arrays.toString(colSum));
	    
	}
}
