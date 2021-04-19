package study;
import quiz.A03_ex;	
	
	public class B02_import {
	
 /*
 	#improt 
 		-다른 패키지에 정의되어있는 클래스를 사용하기 위해서는 
 		 해당 클래스의 정확한 경로를 import 해야 한다.
 		-같은 패키지에 존해하는 클래스는 import 없이도 사용할 수 있다. 
 */

	
	public static void main(String[] args){
	
		//같은 default package의 자원
		A04_VarNaming.main(null);
		A05_print.main(null);
		
		//다른 패키지(quiz)의 자원을 사용하기 위해서는 import가 필요하다
		
		A03_ex.main(null);
		
		//Scanner sc = new Scanner(System.in); // ctrl + shift +o
			
	}	
	
}
