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
	 * # ��ȣȭ - ���� �˾ƺ��� ���� ���·� ��ȯ�ϴ� �� - ���� �������� ������ ���� ���İ����� �˾ƺ� �� ���� �ϴ� ���� �����̴�
	 * 
	 * 
	 * # ��ȣȭ - ��ȣȭ �� ��ȣ���� �ٽ� ������ �ǵ����� ��
	 * 
	 * # Ű - ��ȣȭ �Ǵ� ��ȣȭ�� ���Ǵ� ��
	 * 
	 * # ���� ��ȣ "Hello, world!"----- key : 5 ---->"Mjqqt, btwqi"
	 * ABCDEFGHIJKLMNOPQRSTUVWXYZ
	 * 
	 * ��ȣȭ : key��ŭ ���������� ���ڸ� �̵���Ŵ ��ȣȭ : key��ŭ �������� ���ڸ� �̵���Ŵ
	 * 
	 * # "frankenstein.txt"�� 1 ~ 25������ ���� Ű�� ��ȣȭ�� ���� "frankenstein.encrypted.txt��
	 * �����غ����� (��, ���ĺ��� ��ȣȭ �Ұ�)
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
