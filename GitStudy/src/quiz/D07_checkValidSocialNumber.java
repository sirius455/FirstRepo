package quiz;

public class D07_checkValidSocialNumber {
	
	/*
	  	사용자가 주민들록 번호를 입력하면
	  	그 주민등록 번호가 유효한지 검사하는 프로그램을 만들어 보세요
	  	
	  	맨앞2자리 숫자
	  	월자리에 01~12이내의 숫자
	  	일자리에 01~31이내의 숫자
	  	(1, 3, 5, 7, 8, 10, 12월이면 31 / 4, 6, 9, 11월이면 30 / 2월은 윤년일때 29 아니면 28)
	  	7번째 자리 '-' 
	  	맨앞자리 1 ~ 4
	 */
	
	private static boolean checkNumeric(char ch) {
		return ch >= '0' && ch <= '9'; 
	}
	
	public static boolean checkValidSociaNumber (String SociaNumber) {
		int len = SociaNumber.length();
		
		if(len !=14) {
			System.out.println("[invalid] 길이가 올바르지 않음");
			return false;
		}
		
		for (int i = 0; i < len; i++) {
			
			char ch = SociaNumber.charAt(i);
			
			if(i < 2 && !checkNumeric(ch)) {
				System.out.println("[invalid] 맨앞 2자리에 숫자 아닌것이 있음");
				return false;
			} else if(i == 6 && ch != '-') {
				System.out.println("[invalid] 하이픈 자리가 올바르지 않음");
				return false;
			} else if (i == 2  && !('0' <= ch && '2' > ch) ) {
				System.out.println("[invalid] 월자리를 잘못입력하셨습니다");
				return false;
			} else if ((i == 3 && SociaNumber.charAt(2) == '0' && !('0' <= ch && '9' >= ch))
					|| (i == 3 && SociaNumber.charAt(2) == '1' && !('0' <= ch && '2' >= ch))) {
				System.out.println("[invalid] 월자리를 잘못입력하셨습니다");
				return false;
			} else if ((i == 4 && !('0' <= ch && '3' >= ch)) || 
					(i == 4 && SociaNumber.charAt(2) == '0' && SociaNumber.charAt(3) == '2' && !('0' <= ch && '2' >= ch))) {
				System.out.println("[invalid] 일자리를 잘못입력하셨습니다");
				return false;
			} else if ((i == 5 && !('0' <= ch && '9' >= ch)) ||
					(i == 5 && SociaNumber.charAt(4) == '3' && !('0' <= ch && '1' >= ch)) ||
					(i == 5 && SociaNumber.charAt(4) == '3' && SociaNumber.charAt(3) == '4' && !('0' == ch)) ||
					(i == 5 && SociaNumber.charAt(4) == '3' && SociaNumber.charAt(3) == '6' && !('0' == ch)) ||
					(i == 5 && SociaNumber.charAt(4) == '3' && SociaNumber.charAt(3) == '9' && !('0' == ch)) ||
					(i == 5 && SociaNumber.charAt(4) == '3' && SociaNumber.charAt(2) == '1' && SociaNumber.charAt(3) == '1' && !('0' == ch))) {
				System.out.println("[invalid] 일자리를 잘못입력하셨습니다");
				return false;
			} else if(i == 7 && !('0' < ch && '3' >= ch)) {
				System.out.println("[invalid] 성별을 잘못입력하셨습니다");
				return false;
			} else if(i >= 7 && !checkNumeric(ch)) {
				System.out.println("[invalid] 뒷자리에 숫자를 입력해주세요");
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		if (checkValidSociaNumber("881231-1021546")) {
			System.out.println("올바른 주민등록 번호입니다!");
		}
	}
	
	

}
