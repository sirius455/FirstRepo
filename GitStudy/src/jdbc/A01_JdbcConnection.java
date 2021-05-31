package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class A01_JdbcConnection {
	
	/*
	  	# JDBC
	  	
	  	 - Java Database Connectivity
	  	 - DB�� �������� �����Ͽ� �����ϰ� ����� �޾ƿ��� Java API(�ڹٿ��� �̸� ������)
	  	 - � DB�͵� ȣȯ�� �� �ֵ��� ���ԵǾ� �ִ�
		 - Java �κ��� �ҽ��� � DB�� ����ϴ��� �׻� �����ϴ�
		 - DB�� ������ �ʿ��� jdbc���� �䱸�ϴ� ������ ���߾� �����ϱ� ������
		     ���α׷��ӵ��� ���ο� DB�� ������ jdbc�� ���ϰ� ����� �� �ִ�
	  
	  	# OJDBC
	  	 - ����Ŭ �����ͺ��̽��� JDBC API�� �����ϱ� ���� ���� ���̺귯��
	  	 - ����Ŭ DB�� ��ġ�� ������ ���ԵǾ� �ִ�
	  
	  OJDBC ���̺귯���� ���Խ�Ű�� ������Ʈ ��Ŭ�� >> �����н� >> ���ǱԾ� �����н� >> 
	  sqldeveloper ���Ͽ� jdbc ���Ͽ� lid �� ojdbc8ã��
	  
	*/
	
	public static void main(String[] args) {
		
		/*
		         �� � ȸ�� DB�� ����ϴ��� ���ľ� �ϴ� �Ȱ��� ������
		  
		*/
		
		
		try {
			// 1. Class.forName(driverName)���� �ش� DB���� jdbc����̹��� �ε��Ѵ� (��������)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("OracleDriver�� ������");
			// 2. DriverManager Ŭ������ ���� DB���� ������ �����Ѵ�
				Connection conn = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521/XEPDB1","hr","1234");
				System.out.println("���� ������");
				
			// 3. ������ ������ ���� ������ �������� �����Ѵ�
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees");
			
			// 4. ������ �������� DB�� ������
			ResultSet rs = pstmt.executeQuery();
			
			// 5. �޾ƿ� ����� ������� ����Ѵ�
			while (rs.next()) {
				System.out.println(rs.getString("first_name") + "/" + rs.getString("salary"));
				
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		
		
		
	}
	
}
