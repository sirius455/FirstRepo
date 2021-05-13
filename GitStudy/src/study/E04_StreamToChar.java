package study;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class E04_StreamToChar {
	/*
	  	
	  	# Reader/writer
	  	
	  		- InputStream�� OutputStream�� �����͸� ����Ʈ ������ �а� ����
	  		- ����Ʈ ������ �����͸� ����ϱ� ������ ���ϴ� Ÿ�������� �籸���� �ʿ��ϴ�
	  		- Reader�� Writer�� �����͸� ���� ������ �а� ���� Ŭ�������̴�
	  		- InputerStream/OutputStream�� Reader/writer�� �ѹ� �� ���μ� ����Ѵ�
	  		
	  		# abstract class Reader
	  		 - bufferedReader, InputStreamReader, FileReader ... ����
	  		      ��� Reader Ŭ������ ��ӹ޾� ������ Ŭ�������̴�
	  		 - Stream���� ���� �����͸� ���ڷ� �籸���Ͽ� ���α׷��Ӱ� ����ϱ� ���ϰ� ���ش�
	  		 - ���ڷ� ��ġ�ų� ����Ʈ�� ��ȯ�� �� ����� ���ڵ� Ÿ���� ������ �� �ִ�
	  		 
	  		 
	 */
	
	public static void main(String[] args) {
		
		try {
			InputStreamReader in = new InputStreamReader(
						new FileInputStream(new File("./note/Git ��� ����.txt")), 
						Charset.forName("MS949"));
			
			int ch;
			while((ch = in.read()) != -1) {
				System.out.print((char) ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			OutputStreamWriter out = new OutputStreamWriter(
					new FileOutputStream("./data/output.py"),
					Charset.forName("UTF-8"));
			
			out.append("print('hello, python')\n");
			out.append("if true:\n");
			out.append("\tprint('that\\'s true)");
			
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
	}
	
}
