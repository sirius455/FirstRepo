package jdbc.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;


import jdbc.DBConnector;

public class A05_SearchKeyword {
	
	/*
	  first_name�� ����ڰ� �Է��� ������ ���ԵǾ��ִ� ��� ����� ��ȸ�غ�����
	  (��, �˻���� �α��� �̻��̾�� �ϰ� �� ���� �̻��� �ƴ϶�� ���ܰ� �߻��ؾ� ��)
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("�˻������ּ��� > ");
		String name = sc.next();
		
		
		String keyword = "en";
		String sql = "SELECT * FROM employees WHERE first_name LIKE ?";
		

		
		try (
			Connection conn = DBConnector.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);	
		) {
			
			//pstmt.setString(1, "%" + name + "%");
			
			pstmt.setString(1, String.format("%%%s%%", keyword));
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.printf("%-10d%-15s%-15s%-10d\n",
						rs.getInt("employee_id"),
						rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getInt("salary"));
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
