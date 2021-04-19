package quiz;

import java.util.Arrays;
import java.util.Random;

public class B18_Array2Quiz {
	
	public static void main(String[] args) {
		
		// 1. NUMARR�� ��� ���� 0 ~ 100������ ���� ������ �ٲ㺸����
		
		// 2. NUMARR�� ���հ� ��� (�Ҽ��� ���� �ڸ�)�� ���ؼ� ����غ�����
		
		// 3. NUMARR�� �� ���� ���� ��� ���ؼ� ����غ�����
		
		// 4. NUMARR�� �� ���� ���� ��� ���ؼ� ����غ�����
		
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

		System.out.printf("numArr�� ������ [%d], ������� [%.2f]", sum, mean);
		
		int[] rowSum = new int[numArr.length];
		
		for (int i = 0; i < rowSum.length; i++) {
			
			for (int j = 0; j < numArr[i].length; j++) {
				rowSum[i] += numArr[i][j];
				
			}
			
		}
		// Arrays.toString(): �迭 ���ϰ� ����ϱ�
	    System.out.println("���� �� : " + Arrays.toString(rowSum));
	    
	    //�� row : ��, column : ��
	    
	    
	    // ���� �� �迭 ã��
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
	    
	    System.out.println("���� ��: " + Arrays.toString(colSum));
	    
	}
}
