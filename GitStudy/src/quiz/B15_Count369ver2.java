package quiz;

public class B15_Count369ver2 {

	public static void main(String[] args) {

		int input = 33;
		int clap = 0;
		// 2 ������ Ǯ��
		for (int i = 0; i <= input; ++i) {
			int testValue = i;
			int digit = 1;

			int n = 1;
			
			System.out.print(i + ":");

			while ((n *= 10) <= testValue) {
				//System.out.println(n + " < " + testValue);
				digit++;

			}

			//System.out.println("count : " + digit);
			
			for (int j = digit; j > 0; --j) {
				
				int value = testValue % (int)Math.pow(10,  j) / (int)Math.pow(10,  j - 1);
				
				if (value == 3 || value == 6 || value == 9) {
					clap++;
					System.out.print("¦");
				}
				
				//testValue %=  (int)Math.pow(10,  j);
			}
			System.out.println();
		}

	}
}
