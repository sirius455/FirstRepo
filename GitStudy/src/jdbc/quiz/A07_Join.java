package jdbc.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.model.employees_View1;

public class A07_Join {
	
	public static void main(String[] args) {
		
		// 이름에 en이 들어가는 모든 사원의 이름/부서번호/부서명/도시를 조회해보세요
		
		HikariConfig config = new HikariConfig("./some/path/hikari.properties");
		HikariDataSource ds = new HikariDataSource(config);
		
		String keyword = "en";
		String sql = "SELECT * FROM employees_view1 WHERE first_name LIKE ?";
		
		try (
			Connection conn = ds.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);	
		) {
				
			pstmt.setString(1, String.format("%%%s%%", keyword));
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				employees_View1 e = new employees_View1(rs);
				System.out.print(e.getFirst_name() + " / ");
				System.out.print(e.getDepartment_id() + " / ");
				System.out.print(e.getDepartment_name() + " / ");
				System.out.println(e.getCity());
			}
				
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
