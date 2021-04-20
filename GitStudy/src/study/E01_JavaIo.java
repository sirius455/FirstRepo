package study;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E01_JavaIo {
	/*
	 * # JAVA IO (Input/Output)
	 * 
	 * - �ڹٴ� ��Ʈ���̶�� ������ �̿��� ������� �ٷ�� - ���α׷����� ������ ��� �����͵��� �Է��̶�� �θ��� (Input) -
	 * ���α׷��� �����ؼ� �������� ��� �����͵��� ����̶�� �θ��� (Output)
	 * 
	 * # Stream
	 * 
	 * - �����͵��� ������ ��� - �Է� ���� �� �����͵��� ���α׷����� ������ ��θ� InputStream�̶�� �θ��� - ��� �� ��
	 * �����͵��� ������ ��θ� OutPutStream�̶�� �θ��� - �����ʹ� Stream���� �̵��ϱ� ���ؼ��� �ش� �����͸� byte Ÿ������
	 * ��ȯ�Ǿ�� �Ѵ�
	 * 
	 */
	public static void main(String[] args) {
		
		FileOutputStream fout = null;
		try {
			/* 
			  	# ���� ��ο� ��� ���
			  	
			  	 - ���ϴ� �ڿ������� ��θ� �Ѹ�(root)���� ��� ���°��� �����ζ�� �Ѵ�
			  	   (C:\, D:\, E:\, http://, https://, ftp://, file://, /)
			  	   
			  	  * ������ �� D:\pictures\animals\penguin.jpg
			  	  
			  	  - ���ϴ� �ڿ������� ��θ� ���� ��ġ���� ã�ư��� ���� ����ζ�� �Ѵ�
			  	 	��� ��δ�  ./�� �����Ѵ�(.//�� ������ �����ϴ�)
			  	 	(./) : ���� ��ġ���� ����
			  	 	(./)../ : ���� ����
			  	  * ��� ����� ��
			  	   - ./../../penguin.jpg
			  	   - ./../images/penguin.jpg
			  	  
			 */
			
			
			// * �ҽ������� (./)���� ��ġ�� ������Ʈ�� root�̴�
			fout = new FileOutputStream("b.txt", true);
			
			for (int i = 0; i < 10; i++) {
				fout.write(String.format("������ ������ �� ���׿�..%d\n", i).getBytes());
			}
			
			// I/O Stream�� �������� close()�� ȣ������� �Ѵ� (�޸� ȸ��)
			// fout.close();
			
			System.out.println("���� ���� �Ϸ�");
		} catch (FileNotFoundException e) {
			System.out.println("���� �� ã�� �ͼ���");
		} catch (IOException e) {
			System.out.println("�����͸� ���ٰ� ������ ������");
		} finally {
			try {
				if (fout != null) fout.close();
			} catch (IOException e) {}
		}
	}
}