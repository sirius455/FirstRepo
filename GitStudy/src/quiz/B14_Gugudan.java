package quiz;

public class B14_Gugudan {

	/*
	 * 
	 * 1. 구구단을 다음과 같이 가로로 출력해보세요
	 * 
	 * 2단: 2x1 = 2 2x2 =4 2x3=6 .. 3단: 3x1 = 3 3x2 =6 3x3=9 .. 4단: 4x1 = 4 4x2 =8
	 * 4x3=12 ..
	 * 
	 * 2. 구구단을 다음과 같이 세로로 출력해보세요
	 * 
	 * 2단 3단 4단 2x1=2 3x1=3 4x1=4
	 * 
	 * 
	 */

	public static void main(String[] args) {
//		for (int dan = 2; dan <= 9; ++dan) {
//
//			System.out.print("\n" + dan + "단  :\t");
//
//			for (int gop = 1; gop <= 9; ++gop) {
//
//				System.out.printf("%d x %d = %d\t", dan, gop, dan * gop);
//			}
//		}
//		
		for (int dan = 2; dan <= 9; ++dan) {

			System.out.print(dan + "단  : ");//줄의 시작

			for (int gop = 1; gop <= 9; ++gop) {

				System.out.printf("%dx%d= %-2d", dan, gop, dan * gop);
			}
			System.out.println();//줄의 끝
		}

		
			for (int dan = 2; dan <= 9; ++dan) {
			
			System.out.print( + dan + "단 " );
			
			for (int gop = 1; gop <= 9; ++gop) {
				
				System.out.printf("%d x %d = %d\n", dan, gop, dan * gop);
			}
		}

		System.out.println("==================================");

		for (int line = 0; line <= 9; ++line) {

			for (int dan = 2; dan <= 9; ++dan) {

				if (line == 0) {
					System.out.print(dan + "단\t");
				} else {
					System.out.printf("%dx%d=%d\t", dan, line, dan * line);
				}

			}
			System.out.println();
		}
	}
}
