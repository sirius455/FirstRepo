package study;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E03_FileIo {
	
	/*
	 	# Stream
	 	 - �����͵��� ������ ���
	 	 - ���α׷����� ���� �� ����ϴ� ��θ� InputStream�̶�� �Ѵ�
	 	 - ���α׷����� ó���� �� ���� �� ����ϴ� ��θ� outputStream�̶�� �Ѵ�
	 	
	 	# FileOutputStream�� ���� �޼���
	 	 - read() : ��Ʈ������ ���� ������ �� ����Ʈ�� �о�´�. EOF(end of file)�� �����ϸ� -1�� ��ȯ
	 	 - read(bate[]) : byte[]�� ���� �����ϸ� �ű⿡ ����ش�
	 	 - read(byte, off, len) : byte[]�� ���� �����ϵ� ���ϴ� ��ŭ 
	 	 						    ���ϴ� ��ġ�� �д´�
		 - close() : �� ����� ��Ʈ���� �ݴ´�. ���� ������ ��� �޸𸮸� �����ϰ� �ְ� �ȴ�.
	 	
	 	# FileInputStream�� ���� �޼���
	 	 - write(int) : �� ���ھ� ����
	 	 - write(byte[]) : byte[]�� ��� ������ �ѹ��� ����
	 	 - flush() : write�� ��Ƴ��� ������� ��� ��������
	 	 - close() : �� ����� ��Ʈ���� �ݴ´�.
	 	 			  ���� ������ ��� �޸𸮸� �����ϰ� �ְ� �ȴ�.
	 	 			 ���� �����Ͱ� �ִٸ� flush()�Ѵ�.
	 		
	 	
	 */
	
	public static void main(String[] args) {
		
		File git = new File("./note/Git ��� ����.txt");
		
		
		
		System.out.println(git.exists());
		
		try {
			FileInputStream fin = new FileInputStream(git);
			
			byte[] buffer = new byte[2000];
			
			// �� ���ϴ� ����Ʈ ũ�⸸ŭ�� �б�
			int len;
			while ((len = fin.read(buffer)) != -1) {
				System.out.println(new String(buffer, 0, len));
				
			}
			
			//�ȳ��ϼ��� �ݰ����ϴ�!!
			
			//3ĭ�� ���� �� ����
			
			// �ȳ���
			// ����
			// �ݰ���
			// �ϴ�!
			// ! ��!
			// ��1 1����Ʈ�� �б�
			
//			int _byte;
//			while((_byte = fin.read()) != -1) {
//					System.out.print((char)_byte);	

//			}
			
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		File newFlie = new File("./note/my first file output.txt");
		try {
			FileOutputStream fout = new FileOutputStream(newFlie);
			
			fout.write(65);
			fout.write(66);
			fout.write(67);
			fout.write(68);
			fout.write('\n');
			
			// 2. byte[]�� �̿��ϴ� ���
			fout.write("�ȳ��ϼ���!\n".getBytes());
			
			fout.close();
	    } catch (FileNotFoundException e) {
	    	e.printStackTrace();
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
	}

	
}
