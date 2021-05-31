package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class A01_Ex {
	
	// static ��� - �ش� Ŭ������ �ѹ��̶� ��޵Ǹ� static ����� ���ʷ� �� �� �����Ѵ�
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� �Ϸ�.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	static String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
	
	static Connection getConnection(String id, String password) {
		try {
			return DriverManager.getConnection(url, id, password);
		} catch (SQLException e) {
			return null;
		}
	}
	
	public static void main(String[] args) {
		String sql = "SELECT * FROM employees WHERE department_id =" + 50;
		
		try (
				Connection conn = getConnection("hr", "1234");
				PreparedStatement pstmt = 
						conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			System.out.println("EMPNO\t  FIRST_NAME\tLAST_NAME");
			while (rs.next()) {
				System.out.printf("%-10d%-13s\t%s\n", 
						rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
