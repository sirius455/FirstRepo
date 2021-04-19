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
		// TODO �ڵ� ������ �޼ҵ� ����
		return "�̸�:" + name + " ��ȭ��ȣ:" + phoneNumber + " �׷� �̸�:" + group;
	}
	
	public static void main(String[] args) {
		PhoneBook infor = new PhoneBook("��" , "010", "��");
		ArrayList infors = new ArrayList();
		infors.add(new PhoneBook("��" , "010", "��") );
		infors.add(new PhoneBook("��" , "010", "��") );
		infors.add(new PhoneBook("��" , "010", "��") );
		infors.add(new PhoneBook("3" , "010", "��") );
		infors.add(new PhoneBook("4" , "010", "��") );
		
		
		
		
		System.out.println(infors);
		
	}
	
}
