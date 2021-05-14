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
	   
	    - JavaScript�� objectŸ�԰� ������ ������ ������ ������ ǥ�� ���
	    - ���ڿ������� �پ��� �����͸� �����ϰ� ǥ���� �� �־ �αⰡ ����
	    - { "Key" : Value, "Key" : Value , ...}
	    
	    # JSON�� Value�� ǥ�� ������ Ÿ�Ե�
	    
	     - '', "" : String
	     - ����, �Ҽ� : Number
	     - [] : Array
	     - {} : object (JAVA�� Map)
	  
	 */
	
	public static void main(String[] args) {
		
		// maMap�� ����� �����͵��� JSON������ ���ڿ��� ����� ���Ͽ� ����ϴ�
		// �޼��带 ��������
		// (Ȯ���ڴ� .json)
		
		
		
		
		HashMap<String, Object> myMap = new HashMap<>();
		myMap.put("name", "ȫ�浿");
		myMap.put("age", 123);
		myMap.put("tel", "010-1234-1234");
		myMap.put("tel2", null);
		myMap.put("language", new String[] {"C", "JAVA", "Javascript", "React"});
		myMap.put("lotte", new Integer[] {1, 2, 3, 4, 5, 6, 7});
		
		
		mapToJsonFile(myMap);
		mapToJsonstr(myMap);
		//jsonFileToMap();
		
		
		
		//�ۼ��� ������ ������ �ٽ� JAVA ������ �ε��ϴ� �޼��带 ��������
	}
	
	
		private static void mapToJsonFile(HashMap<String, Object> myMap) {
			
			File jsonFile = new File("./data/jsondata.json");
			
			try {
				OutputStreamWriter out = new OutputStreamWriter(
                                    new FileOutputStream(jsonFile));                       
              
				String name = "�⺻����";
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
		
			String name = "�⺻����";
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
	









