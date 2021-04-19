package quiz;

public class B15_Count369ver3 {
	
	public static void main(String[] args) {
		int input = 5678;
		int clap = 0;

		for (int i = 1; i <= input; ++i) {
			
			int testValue = i;
			System.out.print((i + ": "));
			
			
			while (testValue > 0) {
				int digit = testValue % 10;
				
				if (digit % 10 !=0 && digit % 3 == 0) {
					clap++;
					System.out.print("¦");
				}
				testValue /= 10;
			}
			System.out.println();
		}
	
	}

}
