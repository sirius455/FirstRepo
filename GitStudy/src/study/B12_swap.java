package study;

public class B12_swap {
	
	public static void main(String[] args) {
		
		int a = 10, b = 20;
		//tmp는 잠시 보관
		int tmp;
		System.out.printf("a : %d, b : %d\n", a, b);
		
		tmp = a;
		a = b;
		b = tmp; 
		
		System.out.printf("a : %d, b : %d\n", a, b);
	}
	

}
