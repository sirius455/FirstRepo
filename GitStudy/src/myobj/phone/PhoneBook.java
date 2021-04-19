package myobj.phone;

import java.util.ArrayList;

public class PhoneBook {

	private String group;
	private String phoneNumber;
	private String name;
	
	public PhoneBook(String group, String phoneNumber, String name) {
		
		this.group = group;
		this.phoneNumber = phoneNumber;
		this.name = name;
		
	}
	
	public String getGroup() {
		return group;
	}
	
	public String phoneNumber() {
		return phoneNumber;
	}
	
	public String name() {
		return name;
	}
	
	@Override
	public String toString() {
		// TODO 자동 생성된 메소드 스텁
		return "이름:" + name + " 전화번호:" + phoneNumber + " 그룹 이름:" + group;
	}
	
	public static void main(String[] args) {
		PhoneBook infor = new PhoneBook("김" , "010", "박");
		ArrayList infors = new ArrayList();
		infors.add(new PhoneBook("김" , "010", "박") );
		infors.add(new PhoneBook("ㅇ" , "010", "박") );
		infors.add(new PhoneBook("ㅂ" , "010", "박") );
		infors.add(new PhoneBook("3" , "010", "박") );
		infors.add(new PhoneBook("4" , "010", "박") );
		
		
		
		
		System.out.println(infors);
		
	}
	
}
