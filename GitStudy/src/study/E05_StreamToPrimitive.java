package study;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E05_StreamToPrimitive {

	/*
	 
	 	# DateInputStream/DataOutputStream
	 	
	 	  - Reader/Writer�� Stream�� ���ڷ� �ս��� �ٷ�� ���� Ŭ�������ٸ�
	 	    DataInputStream/DataOutputStream�� �⺻�� Ÿ������ �ս��� �ٷ�� ���� Ŭ������
	 
	 */
	
	public static void main(String[] args) { 
		
		File file = new File("./data/myData.data");
		
		try {
			FileOutputStream fout = new FileOutputStream(new File("./data/myData.data"));
			DataOutputStream dout = new DataOutputStream(fout);
			
			dout.writeInt(9990);
			dout.writeInt(3000);
			dout.writeInt(850);
			dout.writeFloat(123.123F);
			dout.writeDouble(12345.123123454);
			dout.writeUTF("UTFŸ������ ����");
			dout.writeBoolean(false);
			
			//����� ��Ʈ���� ���� �ֱٿ� ���� �� ���� ���ʴ�� �ݾ���� �Ѵ�
			// �� JAVA15 �������δ� dout�� �ݾƵ� fout�� �Բ� ������.(�׽�Ʈ��� �ϳ��� �ݾƵ� �Ǵµ�)
			dout.close();
			fout.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		FileInputStream fin;
		DataInputStream din; 
		try {
			
			fin = new FileInputStream(file);
			din = new DataInputStream(fin);
			
			// �� writeInt�� ���� ���� readInt�� �о�� �Ѵ�
			// 	���Ͽ� ���� ������� ������ �����͸� �ٽ� ������ �� �ִ�
			
			System.out.println("�Ʊ� ������ ù��° ��" + din.readInt());
			System.out.println("�Ʊ� ������ �ι�° ��" + din.readInt());
			System.out.println("�Ʊ� ������ ����° ��" + din.readInt());
			System.out.println("�Ʊ� ������ �׹�° ��" + din.readFloat());
			System.out.println("�Ʊ� ������ �ټ���° ��" + din.readDouble());
			System.out.println("UTF : " + din.readUTF());
			System.out.println("Boolean : " + din.readBoolean());
			
			din.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
