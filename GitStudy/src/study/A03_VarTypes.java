package study;

public class A03_VarTypes {
	
	public static void main(String[] args) {
		
		/*
		  
		  	# ����Ÿ��
		  	    - byte
		  	    
		  	    1byte => 8bit
		  	    
		  	    - short (2byte signed ��ȣ������)
		  	    2byte => 16bit
		  	    65536����
		  	     short ����� ���� = 32767
		  	     short ������ ���� = -32768
		  	     
		  	    - char (2byte, unsigned ��ȣ������)
		  	     2byte => 16bit
		  	     65536����
		  	     ����� ������ ��Ÿ�� 0~65535�� ����� ������ �� �ִ� Ÿ��
		  	     �ַ� ���� �ڵ带 �����ϴµ��� ����Ѵ� (���� Ÿ��)
		  	     
		  	 	- int  (4byte)
		  	 	
		  	 	 4byte -> 32 bit
		  	 	 2 ^ 32 -> 4,294,967,296���� 
		  	 	 
		  	 	 ������� 0~2,147,483,647
		  	 	 �������� `1 ~ -2,147,483,648
		  	 	
		  	 	- long (8byte)
		  	 	 8byte => 32bit
		  	 	2^64 -> 18,446,744,073,709,551,616����
		  	 	...
		  */
		byte minByte = -128;
		byte maxByte = 127;
		System.out.println("byteŸ�Կ� ������ �� �ִ� ���� ū ���� " + maxByte + "�̰�,"
				+ "���� ���� ����"  +  minByte + "�Դϴ�.");
		
		short minShort = -32768;
		short maxShort = 32767;
		System.out.println("short Ÿ�Կ� ������ �� �ִ� ���� ū ���� " + maxShort + "�̰�,"
				+ "���� ���� ����"  +  minShort + "�Դϴ�.");
		
		
		char maxChar = 65535;
		char minChar = 0;
		
		char ch = 65;
		System.out.println("char Ÿ�Կ� ����� ���� �⺻������ ���ڷ� ��µȴ�. " + ch);
		System.out.println("char Ÿ�Կ� ����� ���� �ڵ尪�� Ȯ���ϰ� ������ (int)�� ���δ�. " + (int)ch);
		System.out.println("char Ÿ�Կ� ������ �� �ִ� ���� ū ���� " + (int)maxChar + "�̰�, "
				+ "���� ���� ���� "  +  (int)minChar + "�Դϴ�.");
		
		int maxInt = 2147483647;
		int minInt = -2147483648;
		System.out.println("int Ÿ�Կ� ������ �� �ִ� ���� ū ���� " + maxInt + "�̰�, "
				+ "���� ���� ���� "  +  minInt + "�Դϴ�.");
		// ���� 
		
		long e = 10;
		// int�� ������ �Ѿ�� ���ڸ� ����� ���� L�� �ٿ��� �Ѵ�.
		
		long _long = 2_147_483_648L;

		
		/*
		    # �Ǽ� Ÿ��
		    
		    	-float(4byte)
		    	-double(8byte)
		        
		        �Ǽ��� �ַ� �׷��� ��꿡 ���ȴ�.
		        �ε� �Ҽ��� ����� ����Ѵ�.
		 */
		// �׳� �Ҽ��� ���°��� �⺻������ doubleŸ�Դϴ�.
		// float Ÿ���� �Ҽ��� �ڿ� F�� �ٿ��� �Ѵ�.
		float weight = 65.66F;
		double height = 177.77;
		
		
		/*
		        
		    # boolean Ÿ��
		        
		        ���� ������ ǥ���ϴµ��� ���Ǵ� Ÿ��
		        ���� true�� false�ۿ� ����.
		        
		    # ������ Ÿ�� (Ŭ���� Ÿ��)
		  
		 */
		boolean hasFood = true;
		boolean over130cm = false;
		
		/*
		 	#������ Ÿ�� (Ŭ���� Ÿ��_
		 		
		 		������ Ÿ���� �⺻�� Ÿ�Ե���� �ٸ��� �빮�ڷ� �����Ѵ�.
		 		-String : ���ڿ�
		 		-�� �� ��� Ŭ������...
		 */
		String hellowMessage = "Hello, my name is john Doe.";
		String byeMessage = "Good bye. ";
		
		System.out.println(hellowMessage);
		System.out.println("hellowMessage");
		
		System.out.println(byeMessage + byeMessage + byeMessage);
		
		
		
	}

}
