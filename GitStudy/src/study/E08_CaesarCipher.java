package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E08_CaesarCipher {
	
	/*
	  	# 암호화
	  	 - 평문을 알아볼수 없는 형태로 변환하는 것
	  	 - 전달 과정에서 내용을 누가 훔쳐가더라도 알아볼 수 없게 하는 것이 목적이다
	  	 
	  	 
	  	# 복호화
	  	 - 암호화 된 암호문을 다시 평문으로 되돌리는 것
	  	
	  	# 키
	  	 - 암호화 또는 복호화에 사용되는 값
	 	
	 	# 시저 암호
	  	"Hello, world!"----- key : 5 ---->"Mjqqt, btwqi"
	  	ABCDEFGHIJKLMNOPQRSTUVWXYZ
	  	
	  	암호화 : key만큼 오른쪽으로 문자를 이동시킴
	  	복호화 : key만큼 왼쪽으로 문자를 이동시킴
 	  	
 	  	# "frankenstein.txt"를 1 ~ 25사이의 랜덤 키로 암호화한 파일
 	  	  "frankenstein.encrypted.txt를 생성해보세요
 	  	  (단, 알파벳만 암호화 할것)
	*/
	
	public static void main(String[] args) {
		
		File frankenstein = new File("./data/text/frankenstein.txt");
		
		try(FileInputStream in = new FileInputStream(frankenstein);) {
			
			StringBuilder sb = new StringBuilder();
			int ch = -1;
			while((ch = in.read()) != -1) {
					System.out.print((char)ch);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	
		
	}
		
	
	
	
}
