package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class A01_ConnectionPractice {
	
	/*
	  	����ڷκ��� �μ���ȣ�� �Է¹�����
	  	�ش� �μ��� ��� ������� ������ ��ȸ�ؼ� �ֿܼ� �������� ����غ�����
	  
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�μ���ȣ�� �Է����ּ��� > ");
		int department_id = sc.nextInt();
		
		try {
	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XEPDB1","hr","1234");
				
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees WHERE department_id =" + department_id);
					
			ResultSet rs = pstmt.executeQuery();
	
			
			while (rs.next()) {
				System.out.println(
						"��� : " + rs.getInt("employee_id") + " / " +
						"�̸� : " + rs.getString("first_name") + " / " +
						"�� : " + rs.getString("last_name") + " / " +	
						"�̸��� : " + rs.getString("email") + " / " +
						"�ڵ��� ��ȣ: " + rs.getString("phone_number") + " / " +
						"�Ի��� : " + rs.getString("hire_date") + " / " +
						"������ȣ : " + rs.getString("job_id") + " / " +
						"���� : " + rs.getString("salary") + " / " +
						"�μ�Ƽ�� �ۼ�Ʈ : " + rs.getString("commission_pct") + " / " +
						"�Ŵ��� ��� : " + rs.getString("manager_id") + " / " +
						"�μ� ��ȣ : " + rs.getString("department_id") );				
				
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
