package jdbc.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import jdbc.model.Department;
import jdbc.model.Employee;
import jdbc.model.Location;

public class A07_Join_ex {
	
	public static void main(String[] args) {
		
		
		
		HikariConfig config = new HikariConfig("./some/path/hikari.properties");
		HikariDataSource ds = new HikariDataSource(config);
		
		String keyword = "en";
		String sql = "SELECT first_name, hire_date, department_id, department_name, city " 
				+ "FROM employees INNER JOIN departments USING (department_id) " 
				+ "INNER JOIN locations USING (location_id) WHERE first_name LIKE ? ";
		
		try (
			Connection conn = ds.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
			
			pstmt.setString(1, "%en%");
			
//			pstmt.setDate(2, new java.sql.Date(System.currentTimeMillis()));
//			pstmt.setDate(3, new java.sql.Date(
//					LocalDateTime.now().toEpochSecond(ZoneOffset.of("Asia/Seoul"))));
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				
				Employee employee = new Employee();
				// java.sql.Date to java.util.Date
				employee.setFirst_name(rs.getString(1));
				employee.setHire_date(rs.getDate(2));
				employee.setDepartment(new Department());
				employee.getDepartment().setDepartment_id(rs.getInt(3));
				employee.getDepartment().setDepartment_name(rs.getString(4));
				employee.getDepartment().setLocation(new Location());
				employee.getDepartment().getLocation().setCity(rs.getString(5));
				
				
				// date to Instant
				Instant instant = Instant.ofEpochMilli(employee.getHire_date().getTime());
				
				// instant to localDateTime
				System.out.println(LocalDateTime.ofInstant(instant, ZoneId.systemDefault()));
				
				System.out.println("-----------------------");
				System.out.println("�̸� :" + employee.getFirst_name());
				System.out.println("����� :" + employee.getHire_date());
				System.out.println("�μ���ȣ :" + employee.getDepartment().getDepartment_id());
				System.out.println("�μ��� :" + employee.getDepartment().getDepartment_name());
				System.out.println("���� :" + employee.getDepartment().getLocation().getCity());
				System.out.println("-----------------------");
					
			}
				
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
