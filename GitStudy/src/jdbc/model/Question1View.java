package jdbc.model;

import java.sql.ResultSet;

public class Question1View extends Employee{
	
	
	public Question1View(String first_name, int department_id, String department_name, String city) {
		
		setFirst_name(first_name);
		
		Department dept = new Department();
		Location location = new Location();
			
		dept.setDepartment_id(department_id);
		dept.setDepartment_name(department_name);
		location.setCity(city);
		setDepartment(dept);
		
		setDepartment(new Department());
		getDepartment().setDepartment_id(department_id);
		getDepartment().setDepartment_name(department_name);
	}

	public Question1View(ResultSet rs) {
		// TODO 磊悼 积己等 积己磊 胶庞
	}
}