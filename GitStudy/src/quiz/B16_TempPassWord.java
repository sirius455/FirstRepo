package quiz;

public class B16_TempPassWord {

    /*
            4자리의 랜덤 임시비밀번호를 생성하는 프로그램을 만들어보세요.
            (비밀번호를 구성하는 문자는 영어 대문자와 숫자입니다)         
    */
    public static void main(String[] args) {
            
            StringBuilder tempPassword = new StringBuilder();
            int size = 4;
            
            for (int i = 0; i < size; ++i) {                        
                    switch ((int)(Math.random() * 2)) {
                    case 0:
                            tempPassword.append((char)(Math.random() * 26 + 'A'));
                            break;
                    case 1:
                            tempPassword.append((char)(Math.random() * 10 + '0'));
                            break;                                
                    }
            }
            
            System.out.println("임시 비밀번호: " + tempPassword.toString());
            
    }
}