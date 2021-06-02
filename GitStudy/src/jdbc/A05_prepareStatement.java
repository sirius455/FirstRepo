package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class A05_prepareStatement {
	
	public static void main(String[] args) {
		
		// ����ڷκ��� 3���� ���� �Է¹޾� INSERT�Ѵٰ� ����
		
		String fname = "kiwi";
		String fcolor = "Purple";
		
		// ���� ����� (SQL Injection)
		//String sql = "INSTER INTO fruits VALUES(fruit_seq.nextval, " + fname + "," + fcolor + ")";
		
		// PrepareStatement�� �غ��ų �������� ������ �ʿ��ϴٸ� �����ڸ��� ?�� ä���
		String sql = "INSTER INTO fruits VALUES(fruit_seq.nextval, ?, ?)";
		
		try (
			Connection conn = DBConnector.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);	
		) {
			
			pstmt.setString(1, fname);
			pstmt.setString(2, fcolor);
			
			//����
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
