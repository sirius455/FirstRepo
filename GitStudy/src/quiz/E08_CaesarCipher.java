package quiz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Random;
import java.util.regex.Pattern;

public class E08_CaesarCipher {

	/*
	 * # 암호화 - 평문을 알아볼수 없는 형태로 변환하는 것 - 전달 과정에서 내용을 누가 훔쳐가더라도 알아볼 수 없게 하는 것이 목적이다
	 * 
	 * 
	 * # 복호화 - 암호화 된 암호문을 다시 평문으로 되돌리는 것
	 * 
	 * # 키 - 암호화 또는 복호화에 사용되는 값
	 * 
	 * # 시저 암호 "Hello, world!"----- key : 5 ---->"Mjqqt, btwqi"
	 * ABCDEFGHIJKLMNOPQRSTUVWXYZ
	 * 
	 * 암호화 : key만큼 오른쪽으로 문자를 이동시킴 복호화 : key만큼 왼쪽으로 문자를 이동시킴
	 * 
	 * # "frankenstein.txt"를 1 ~ 25사이의 랜덤 키로 암호화한 파일 "frankenstein.encrypted.txt를
	 * 생성해보세요 (단, 알파벳만 암호화 할것)
	 */

	public static void main(String[] args) {

		File frankenstein = new File("./data/frankenstein.txt");
		Random ran = new Random();

		StringBuilder sb = new StringBuilder();
		int key_num = 0;
		try (FileInputStream in = new FileInputStream(frankenstein);) {

			int ch = -1;
			while ((ch = in.read()) != -1) {
				sb.append((char) ch);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		int key = 1;
		try {
			FileWriter bout = new FileWriter(new File("./data/text/frankenstein.encrypted.txt"));

			for (int i = 0; i < sb.length(); i++) {
				key_num = (sb.charAt(i) + key);
				int original_num = sb.charAt(i);
				if (key_num > 'Z' && key_num > 'A' && original_num <= 'Z') {
					key_num = 64 + (key_num - 'Z');
				} else if (key_num > 'z' && key_num > 'a' && original_num >= 'Z') {
					key_num = 96 + (key_num - 'z');
				} else if (original_num >= '0' && original_num <= '9') {
					key_num = key_num - key;
				} else if (!(key_num >= 'A' && key_num <= 'Z' || key_num >= 'a' && key_num <= 'z')) {
					key_num = key_num - key;
				}
				bout.write((char) key_num);

			}

			bout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
