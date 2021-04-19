package quiz;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

public class D07_phoneBook {
	
	static class PhoneInfo {
		String name;
		String phone_nember;
		String address;
		String profile_image_path;				
	}
	
	HashMap<String, HashMap<String, String>> phonebook;
	
	public D07_phoneBook() {
		phonebook = new HashMap<>();
		
		phonebook.put("�̺з�", new HashMap<>());
		phonebook.put("����", new HashMap<>());
		phonebook.put("����", new HashMap<>());
		phonebook.put("ģ��", new HashMap<>());
		
		phonebook.get("����").put("010-1234-1234", "����");
	}
	/*
	  	# HashMap�� �̿��� ��ȭ��ȣ�θ� ������ ������
	  	
	  	1. �׷� / ��ȭ��ȣ / �̸��� �����ؾ� �Ѵ�
	  	2. �׷� �̸��� Ű������ ������ �ش� �׷��� ��ȭ��ȣ ����� ���´�
	  	3. ��ȭ��ȣ ��Ͽ� ��ȭ��ȣ�� Ű������ ������ �̸��� ���´�
	  	
	  	# �����ؾ� �� �޼���
	  	
	  	1. ���ο� �׷��� �߰��ϴ� �޼���
	  	2. �����ϴ� �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼��� (�׷��� ���ٸ� �̺з� �׷쿡 ����)
	  	3. ��ϵ� ��� ��ȭ��ȣ�� �̸����� ������������ �����ִ� �޼���
	  	4. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �˻� �޼���
	  	5. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �˻� �޼���
	  		  	
	*/
	
	public boolean addGroup(String groupName) {
		if (phonebook.containsKey(groupName)) {
			System.out.println("�̹� �����ϴ� �׷��Դϴ�. : " + groupName);
			return false;
		} else {
			System.out.println("���������� �߰��Ǿ����ϴ�. : " + groupName);
			phonebook.put(groupName, new HashMap<>());
			return true;
		}
	}
	
	public void printGroupList() {
		for (String groupName : phonebook.keySet()) {
			System.out.printf("##### %s #####\n", groupName);
		}
	}
	
	public boolean addNumber(String groupName, String phoneNumber, String name) {
		
		// phonebook : ���� �׷��� ������ �� �ִ� ��ü ��ȭ��ȣ�� �ν��Ͻ�
		// phonebook.keySet() : �׷���
		// phonebook.values() : �׷� �̸��� Ű������ ��� ������ �� �ִ� �׷�� �ν��Ͻ�
		
		for(HashMap<String, String> group : phonebook.values()) {
			if (group.containsKey(phoneNumber)){
				System.out.println("�̹� ��ϵ� ��ȣ�Դϴ�");
				return false;
			}
		}
		
		if (phonebook.containsKey(groupName)) {
			phonebook.get(groupName).put(phoneNumber, name);
		} else {
			phonebook.get("�̺з�").put(phoneNumber, name);
		}
		
		return true;
	}
	
	public void printPhoneBook() {
		for (String groupName : new TreeSet<>(phonebook.keySet())) {
			System.out.printf("---- %s ----\n", groupName);
			
			HashMap<String, String> group = phonebook.get(groupName);
			
			/*
			  	#TreeSet�� �� ���� ������
			  	1. ���� ������ ���ϸ鼭 �ν��Ͻ��� ����
			  	2. �÷����� ���� (���� ������ �����ϴ� �÷����� ���׸� Ÿ�� comparable�� ���)
			  
			*/
			
			TreeSet<Entry<String, String>> sortedEntrySet = 
					new TreeSet<>(new Comparator<Entry<String, String>>() {
				@Override
				public int compare(Entry<String, String> o1, Entry<String, String> o2) {
					// �� �������� 1�� ���� ��, ��ȭ��ȣ �������� 2������
					int value_diff = o1.getValue().compareTo(o2.getValue());
					
					if (value_diff == 0) {
						return o1.getKey().compareTo(o2.getKey());
					} else {
						return value_diff;
					}
				}
			});
			
			sortedEntrySet.addAll(group.entrySet());

			for(Entry<String, String> entry : sortedEntrySet) {
				System.out.printf("%s: %s\n", entry.getValue(), entry.getKey());
			}
			
		}
	}
	
	public void searchByName(String keyword) {
		//System.out.println("Hello, world!".contains(","));
		
		int count = 0;
		
		System.out.println("- - �˻� ��� - -");
		for (HashMap<String, String> group : phonebook.values()){
			
			for(String phoneNumber : group.keySet()) {
				String name = group.get(phoneNumber);
				if(name.contains(keyword)) {
					System.out.printf("%s : %s\n", name, phoneNumber);
					count++;
				}
			}
			
//			for(Entry<String, String> entry : group.entrySet()) {
//				
//				if(entry.getValue().contains(keyword)) {
//				System.out.printf("%s : %s\n", entry.getValue(), entry.getKey());
//				count++;
//				}
//			}
		}
		System.out.printf("�˻� ��� %d��\n", count);
	}
	
	public void serachByPhoneNumber(String number_fragment) {
		int count = 0;
		for (HashMap<String, String> group : phonebook.values()) {
			for(String phoneNumber : group.keySet()) {
				if(phoneNumber.contains(number_fragment)) {
					System.out.printf("%s : %s\n", group.get(phoneNumber), phoneNumber);
					count++;
				}
			}
		}
		System.out.printf("�˻� ��� %d��\n", count);
	}
	
	public static void main(String[] args) {
		D07_phoneBook book = new D07_phoneBook();		
//		Scanner sc = new Scanner(System.in);
//		
//		while (true) {
//			System.out.print("�׷� �̸��� �Է� > ");
//			book.addGroup(sc.nextLine());
//			
//			book.printGroupList();
//		}
		
		book.addGroup("����");
		book.addGroup("��ȣȸ");
		book.addGroup("�ʵ��б� ��â");
		book.addGroup("���б� ��â");
		book.addGroup("����б� ��â");
		book.addGroup("���б� ��â");
		book.addGroup("���� ����");
		
		book.addNumber("����", "123-1234-1234", "�赿��");
		book.addNumber("����", "010-5532-1234", "�߼���");
		book.addNumber("��ȣȸ", "010-1572-1234", "�̴�ȣ");
		book.addNumber("��ȣȸ", "010-7895-1234", "��ȣ��");
		book.addNumber(null, "010-1159-1234", "�߽ż�");
		book.addNumber(null, "010-7895-2000", "��ȣ��");
		book.printGroupList();
		
		book.printPhoneBook();
		
		book.searchByName("ȣ");
		book.serachByPhoneNumber("7");
	}
	
}
