package jdbc;


import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import jdbc.model.Employee;

public class A04_DESC {
	
	public static void main(String[] args) {
		
		String sql = "SELECT * FROM employees";
		
		try( 
			Connection conn = DBConnector.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
		) {
			// 가저온 데이터의 메타 데이터들을 보고 싶을때
			ResultSetMetaData meta = rs.getMetaData();
			
			System.out.println("컬럼이 몇개인가?" + meta.getColumnCount() + "개");
			
			for (int i = 1, len = meta.getColumnCount() ; i <= len; ++i) {
				System.out.println("--------------------------------------------");
				System.out.println(i + "번째 컬럼의 이름은 ? " + meta.getColumnLabel(i));
				System.out.println(i + "번째 컬럼의 타입은 ? " + meta.getColumnTypeName(i));
				System.out.println(i + "번째 컬럼의 컬럼 크기는 ? " + meta.getPrecision(i));
			}
			
			
			while (rs.next()) {
				// Employee(여기에 rs넣기)
				Employee e = new Employee();
				System.out.print(e.getFirst_name());
				System.out.println(" " + e.getLast_name());
				
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
