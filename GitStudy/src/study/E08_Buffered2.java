package study;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E08_Buffered2 {

	
	public static void main(String[] args) {
		
		File frankenstein = new File("./data/text/frankenstein.txt");

		long start = System.currentTimeMillis();
		
		try {
			FileInputStream fin = new FileInputStream(frankenstein);
			
			byte[] buffer = new byte[8196];
			
			
			int len;
			while ((len = fin.read(buffer)) != -1) {
				System.out.println(new String(buffer, 0, len));
			
			}			
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		long end = (System.currentTimeMillis() - start);
		System.out.println("------------" + end + "---------------");
		
	}
	
}
