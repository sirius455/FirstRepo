package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class A01_ConnectionPractice {
	
	/*
	  	사용자로부터 부서번호를 입력받으면
	  	해당 부서의 모든 사원들의 정보를 조회해서 콘솔에 보기좋게 출력해보세요
	  
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("부서번호를 입력해주세요 > ");
		int department_id = sc.nextInt();
		
		try {
	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XEPDB1","hr","1234");
				
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees WHERE department_id =" + department_id);
					
			ResultSet rs = pstmt.executeQuery();
	
			
			while (rs.next()) {
				System.out.println(
						"사번 : " + rs.getInt("employee_id") + " / " +
						"이름 : " + rs.getString("first_name") + " / " +
						"성 : " + rs.getString("last_name") + " / " +	
						"이메일 : " + rs.getString("email") + " / " +
						"핸드폰 번호: " + rs.getString("phone_number") + " / " +
						"입사일 : " + rs.getString("hire_date") + " / " +
						"직업번호 : " + rs.getString("job_id") + " / " +
						"월급 : " + rs.getString("salary") + " / " +
						"인센티브 퍼센트 : " + rs.getString("commission_pct") + " / " +
						"매니저 사번 : " + rs.getString("manager_id") + " / " +
						"부서 번호 : " + rs.getString("department_id") );				
				
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
