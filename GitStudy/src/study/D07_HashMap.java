package study;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class D07_HashMap {
	
	/*
	  	#Map
	  	
	  	 - key�� value�� �� ���� �̷�� �ڷᱸ��
	  	 - key ���� ���� value�� ������ �� �ִ�
	  	 - key�� �ߺ��� ������� �ʴ´�
	  	  
	*/
	
	public static void main(String[] args) {
	
		HashMap<String, Integer> record = new HashMap<>();
		
		// - put(key, value) : map�� ������ �߰�
		
		record.put("ȫ�浿", 50000);
		record.put("��浿", 35000);
		record.put("�ڱ浿", 90000);
		
		// -������ ����ִ� ���� ������ �� ���� ����, ������ null ����
		Integer previous_value = record.put("ȫ�浿", 3500); // �̹� �����ϴ� Ű���� put�ϸ� ���� ����
		
		System.out.println("������ ����ִ� �� : " + previous_value);
		System.out.println("���� ����ִ� �� : " + record.get("ȫ�浿"));
		
		//�������� ȫ�浿�� ����Ǿ��ִ� ���ڸ� 3000�������Ѻ�����
		record.put("ȫ�浿", record.get("ȫ�浿") + 3000);
		
		System.out.println(record);
		
		// get(key) : key�� �̿��� value�� ����
		System.out.println(record.get("�ڱ浿"));
		
		HashMap<String, Object> person = new HashMap<>();
		
		person.put("�̸�", "ȫ�浿");
		person.put("����", 35);
		person.put("�����ϴ� ��", new String[] {"���", "���ڱ�", "�Ա�",});
		person.put("�Ⱦ��ϴ� ��", new HashSet<>());
		
		// �������� : "�Ⱦ��ϴ� ��"�� �����͸� �߰��غ�����
		HashSet<String> dislike = ((HashSet)person.get("�Ⱦ��ϴ� ��"));
		
		dislike.add("�߱�");
		dislike.add("Ư��");
		dislike.add("�����");
		
		//((HashSet<String>)person.get("�Ⱦ��ϴ� ��")).add("�߱�");
		
		
		System.out.println(person.get("����"));
		System.out.println(((String[]) person.get("�����ϴ� ��"))[0]);
		System.out.println(person.get("�Ⱦ��ϴ� ��"));
		
		/* 
		  	# �ݺ������� Map�� Ȱ���ϱ�
			 
			 - keySet() : key��θ� �̷���� Set�� ��ȯ�Ѵ�
			 - values() : value��θ� �̷���� Set�� ��ȯ�Ѵ�
			 - entrySet() : Entry<key, value>�� �̷���� Set�� ��ȯ�Ѵ�

		*/
		
		
		
		for(String key : person.keySet()) {
			Object value = person.get(key);
			
			// A instanceof B ������ : A�� B�� �ν��Ͻ������� �Ǻ��Ѵ�. ��ĳ���� ���¿����� �Ǻ��ȴ�
			if(value instanceof String[]) {
				System.out.print("[");
				
				String[] arr = (String[]) value;
				
				for(int i = 0; i < arr.length; ++i) {
					System.out.print(arr[i] + ", ");
				}
				System.out.println("]");
			} else {
			System.out.println(key + ":" + person.get(key));
			}
		}
		
		// # values()
		System.out.println("values: " + person.values());
		
		// # entrySet()
		for(Entry<String, Object> entry : person.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			
			System.out.println(key + "=" + value);
		}
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(3, "hello!");
		map.put(99, "good night!");
		map.put(35, "see you later!!");
		
		System.out.println(map.get(3));
		System.out.println(map.get(99));
		System.out.println(map.get(35));
		
		//.containsKey = map�� key�� ���ԵǾ� �ִ����� Ȯ��
		
		System.out.println("Ű �߿� 15�� �ֳ���?" + map.containsKey(15));
		System.out.println("Ű �߿� 35�� �ֳ���?" + map.containsKey(35));
		
		//.containsValue = map�� �ش� ���� ���ԵǾ� �ִ����� Ȯ��
		System.out.println("�� �߿� Hello!�� �ֳ���?" + map.containsValue("hello!"));
		System.out.println("�� �߿� Hello!�� �ֳ���?" + map.containsValue("hello"));
		
	}
}
