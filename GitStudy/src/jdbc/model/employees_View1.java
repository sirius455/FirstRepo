package jdbc.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class employees_View1 {
	
	private String first_name;
	private int department_id;
	private String department_name;
	private String city;
	
	public employees_View1(ResultSet rs) throws SQLException {
		first_name = rs.getString("first_name");
		department_id = rs.getInt("department_id");
		department_name = rs.getString("department_name");
		city = rs.getString("city");
	}
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
