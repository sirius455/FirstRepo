package study;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.HashMap;


public class E07_JSON {
	
	/*
	   # JSON
	   
	    - JavaScript의 object타입과 굉장히 유사한 형태의 데이터 표현 방식
	    - 문자열만으로 다양한 데이터를 간결하게 표현할 수 있어서 인기가 많다
	    - { "Key" : Value, "Key" : Value , ...}
	    
	    # JSON의 Value에 표현 가능한 타입들
	    
	     - '', "" : String
	     - 숫자, 소수 : Number
	     - [] : Array
	     - {} : object (JAVA의 Map)
	  
	 */
	
	public static void main(String[] args) {
		
		// maMap에 저장된 데이터들을 JSON형태의 문자열로 만들어 파일에 출력하는
		// 메서드를 만들어보세요
		// (확장자는 .json)
		
		
		
		
		HashMap<String, Object> myMap = new HashMap<>();
		myMap.put("name", "홍길동");
		myMap.put("age", 123);
		myMap.put("tel", "010-1234-1234");
		myMap.put("tel2", null);
		myMap.put("language", new String[] {"C", "JAVA", "Javascript", "React"});
		myMap.put("lotte", new Integer[] {1, 2, 3, 4, 5, 6, 7});
		
		
		mapToJsonFile(myMap);
		mapToJsonstr(myMap);
		//jsonFileToMap();
		
		
		
		//작성된 파일의 내용을 다시 JAVA 맵으로 로드하는 메서드를 만들어보세요
	}
	
	
		private static void mapToJsonFile(HashMap<String, Object> myMap) {
			
			File jsonFile = new File("./data/jsondata.json");
			
			try {
				OutputStreamWriter out = new OutputStreamWriter(
                                    new FileOutputStream(jsonFile));                       
              
				String name = "기본정보";
				out.write(name + " = " + "{\n");
			for(String key : myMap.keySet()) {
				Object value = myMap.get(key);
				
				if(value instanceof String) {
					String str = (String)value;					
					out.write(String.format("\"%s\" : \"%s\",\n",  key, str));		
				}   else if (value instanceof Integer){
					Integer Integer = (Integer)value;
					out.write(String.format(("\"%s\" : %d,\n"), key, Integer));
				} else if (value instanceof Integer[]){
					out.write("\"" + key + "\"" + " : " + "[");
					Integer[] Integerarr = (Integer[])value;
					for(int i = 0; i < Integerarr.length; i++) {
						out.write(Integerarr[i] + ",");
					}
					out.write("],\n");
				} else if(value instanceof String[]) {
					out.write("\"" + key + "\"" + ":" + "[");
					String[] Stringarr = (String[]) value;
					for(int i = 0; i < Stringarr.length; ++i) {
						out.write("\"" + Stringarr[i] + "\"" + ",");
					}
					out.write("],\n");
				} 
			}
			out.write("}");
			    out.close();
			  } catch (FileNotFoundException e) {                                
                e.printStackTrace();
			  } catch (IOException e) {
                e.printStackTrace();
			  }
		}

		
	private static void mapToJsonstr(HashMap<String, Object> myMap) {
		
			String name = "기본정보";
			System.out.println(name + "=" + "{");
			for(String key : myMap.keySet()) {
				Object value = myMap.get(key);
				
				if(value instanceof String) {
					String str = (String)value;					
					System.out.println(String.format("\"%s\" : \"%s\",",  key, str));		
				}   else if (value instanceof Integer){
					Integer Integer = (Integer)value;
					System.out.println(String.format(("\"%s\" : %d,"), key, Integer));
				} else if (value instanceof Integer[]){
					System.out.print(String.format(("\"%s\" : ["), key));
					Integer[] Integerarr = (Integer[])value;
					for(int i = 0; i < Integerarr.length; i++) {
						System.out.print(String.format(("%d,"), Integerarr[i]));
					}
					System.out.println("],");
				} else if(value instanceof String[]) {
					System.out.print(String.format(("\"%s\" : ["), key));
					String[] Stringarr = (String[]) value;
					for(int i = 0; i < Stringarr.length; ++i) {
						System.out.print(String.format(("\"%s\","), Stringarr[i]));
					}
					System.out.println("],");
				} 
			}
			System.out.println("}\n");
		}
	
	private static void jsonFileToMap() {
		
		File json = new File("./data/jsondata.json");
		
		try {
			InputStreamReader in = new InputStreamReader(
						new FileInputStream(json));
			
			int ch;
			while((ch = in.read()) != -1) {
				System.out.print((char) ch);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
}
	









