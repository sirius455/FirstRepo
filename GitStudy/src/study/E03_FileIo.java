package study;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E03_FileIo {
	
	/*
	 	# Stream
	 	 - 데이터들이 오가는 통로
	 	 - 프로그램으로 들어올 때 사용하는 통로를 InputStream이라고 한다
	 	 - 프로그램에서 처리된 후 나갈 때 사용하는 통로를 outputStream이라고 한다
	 	
	 	# FileOutputStream의 공통 메서드
	 	 - read() : 스트림으로 부터 다음의 한 바이트를 읽어온다. EOF(end of file)에 도달하면 -1을 반환
	 	 - read(bate[]) : byte[]을 만들어서 전달하면 거기에 담아준다
	 	 - read(byte, off, len) : byte[]을 만들어서 전달하되 원하는 만큼 
	 	 						    원하는 위치에 읽는다
		 - close() : 다 사용한 스트림을 닫는다. 닫지 않으면 계속 메모리를 차지하고 있게 된다.
	 	
	 	# FileInputStream의 공통 메서드
	 	 - write(int) : 한 글자씩 쓴다
	 	 - write(byte[]) : byte[]에 담긴 내용을 한번에 쓴다
	 	 - flush() : write로 모아놓은 내용들을 모두 내보낸다
	 	 - close() : 다 사용한 스트림을 닫는다.
	 	 			  닫지 않으면 계속 메모리를 차지하고 있게 된다.
	 	 			 남은 데이터가 있다면 flush()한다.
	 		
	 	
	 */
	
	public static void main(String[] args) {
		
		File git = new File("./note/Git 사용 설명서.txt");
		
		
		
		System.out.println(git.exists());
		
		try {
			FileInputStream fin = new FileInputStream(git);
			
			byte[] buffer = new byte[2000];
			
			// ※ 원하는 바이트 크기만큼씩 읽기
			int len;
			while ((len = fin.read(buffer)) != -1) {
				System.out.println(new String(buffer, 0, len));
				
			}
			
			//안녕하세요 반갑습니다!!
			
			//3칸씩 읽을 수 있음
			
			// 안녕하
			// 세요
			// 반갑습
			// 니다!
			// ! 다!
			// ※1 1바이트씩 읽기
			
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
			
			int a = 20;
			String b = String.format("%s", a);
			
			// 2. byte[]를 이용하는 방식
			fout.write(b .getBytes());
			
			fout.close();
	    } catch (FileNotFoundException e) {
	    	e.printStackTrace();
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
	}

	
}
