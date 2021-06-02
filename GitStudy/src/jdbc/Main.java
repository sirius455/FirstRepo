package jdbc;

import java.nio.charset.Charset;
import java.time.ZoneOffset;

public class Main {
	
	public static void main(String[] args) {
		
		
		for (String charset : Charset.availableCharsets().keySet()) {
			System.out.println(charset);
		}
		
		
		for (String id : ZoneOffset.getAvailableZoneIds()) {
			System.out.println(id);
		}
		
	}
	
}	
