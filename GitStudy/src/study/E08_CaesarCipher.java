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
	  	# ��ȣȭ
	  	 - ���� �˾ƺ��� ���� ���·� ��ȯ�ϴ� ��
	  	 - ���� �������� ������ ���� ���İ����� �˾ƺ� �� ���� �ϴ� ���� �����̴�
	  	 
	  	 
	  	# ��ȣȭ
	  	 - ��ȣȭ �� ��ȣ���� �ٽ� ������ �ǵ����� ��
	  	
	  	# Ű
	  	 - ��ȣȭ �Ǵ� ��ȣȭ�� ���Ǵ� ��
	 	
	 	# ���� ��ȣ
	  	"Hello, world!"----- key : 5 ---->"Mjqqt, btwqi"
	  	ABCDEFGHIJKLMNOPQRSTUVWXYZ
	  	
	  	��ȣȭ : key��ŭ ���������� ���ڸ� �̵���Ŵ
	  	��ȣȭ : key��ŭ �������� ���ڸ� �̵���Ŵ
 	  	
 	  	# "frankenstein.txt"�� 1 ~ 25������ ���� Ű�� ��ȣȭ�� ����
 	  	  "frankenstein.encrypted.txt�� �����غ�����
 	  	  (��, ���ĺ��� ��ȣȭ �Ұ�)
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
