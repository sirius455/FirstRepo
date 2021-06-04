package jdbc;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class A06_HikariCp {

	
	
	public static void main(String[] args) {
	
		// slf4j - 로그를 찍는 용도로 사용하는 인기 라이브러리
		// 히카리를 라이브러리에 추가할때 모듈패스가아닌 클래스패스에 넣어야한다
		HikariConfig config = new HikariConfig();
		
		config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521/XEPDB1");
		config.setUsername("hr");
		config.setPassword("1234");
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

		HikariDataSource ds = new HikariDataSource(config);
		
		String sql = "SELECT * FROM employees";
		
		try (
				Connection conn = ds.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		){
			while(rs.next()) {
				System.out.println(rs.getString(2));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
