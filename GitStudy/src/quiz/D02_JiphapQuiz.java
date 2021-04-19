package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// ���׸��� �����ص� Ŭ������ �ν��Ͻ� ������ ���ϴ� Ÿ���� �� �� �ְ� �ȴ�
// ���� ������ object�� �����ȴ�
public class D02_JiphapQuiz<T> {
	
	/*
	  1. �� �÷����� �Ű������� ���޹����� �� �÷����� �������� SetŸ������ ��ȯ�ϴ� �޼���
	  
	  2. �� �÷����� �Ű������� ���޹����� �� �÷����� �������� SetŸ������ ��ȯ�ϴ� �޼���
	  
	  3. �� �÷����� �Ű������� ���޹����� �� �÷����� �������� SetŸ������ ��ȯ�ϴ� �޼���
	  
	 */
	
	public Set<T> union(Collection<? extends T> a, Collection<? extends T> b) {
		Set<T> union_set = new HashSet<>(a);
		
		union_set.addAll(b);
		
		return union_set;
	}
	
	
	public Set<T> intersection(Collection<? extends T> a, Collection<? extends T> b) {
		Set<T> intersection_set = new HashSet<>(a);
		
		intersection_set.retainAll(b);
		
		return intersection_set;
	}
	
	// A-b
	// B-A
	
	public Set<T> difference(Collection<? extends T> a, Collection<? extends T> b) {
		Set<T> difference_set = new HashSet<>(a);
		
		difference_set.removeAll(b);
		
		return difference_set;
	}
	
	public static int plus(int a, int b) {
		a += b;
		return a;
	}
	
	public static String plusstr(String a, String b) {
		//String ���� ��ȭ��ų�� ����
		// +=�� �Ҷ� �˾Ƽ� ���ο� String �ν��Ͻ��� �����ϵ��� ����Ǿ� �ִ�.
		a += b;
		return a;
	}
	
	public static void main(String[] args) {
		// �ҹ��ڷ� �����ϴ� Ÿ�Ե�(�⺻��)�� �Ű������� �����Ҷ� ���� �����Ѵ�.
		int int_a = 20;
		int int_b = 30;
		
		System.out.println(plus(int_a, int_b));
		System.out.println("plus �� int_a�� ��: " + int_a);
		
		// �빮�ڷ� �����ϴ� Ÿ�Ե�(������)�� �Ű������� ������ �� �ּҸ� �����Ͽ� �����Ѵ�
		Set<String> b = new HashSet<>(); 
		List<String> a = new ArrayList<>(); 
		Set<String> c = new HashSet<>();
		
		a.add("abc");
		a.add("application");
		a.add("advertise");
		a.add("apple");
		
		b.add("banana");
		b.add("balloon");
		b.add("bike");
		b.add("apple");
		
		c.add("cow");
		c.add("cat");
		c.add("crack");
		c.add("apple");
		
		D02_JiphapQuiz<String> jiphap_tools = new D02_JiphapQuiz<String>();
		D02_JiphapQuiz<Integer> jiphap_tools2 = new D02_JiphapQuiz<Integer>();

		
		System.out.println("uion�� �����ϱ� ���� a: " + a);
		System.out.println(jiphap_tools.union(a, b));
		
		
		System.out.println("uion�� �����ϱ� ���� a: " + a);
		System.out.println(jiphap_tools.intersection(a, c));
		
		
		System.out.println(jiphap_tools.difference(a, c));
	}
	
	
	
	public static Set getUnion(Set<Integer> numbers, ArrayList<Integer> numbers2) {
	
	boolean result = numbers.addAll(numbers2);
	
	 return numbers;	
	}
	
	public static Set getintersection(Set<Integer> numbers, ArrayList<Integer> numbers2) {
		
		boolean result = numbers.removeAll(numbers2);
		
		 return numbers;	
	}
	
	public static Set getdifference(Set<Integer> numbers, ArrayList<Integer> numbers2) {
		
		boolean result = numbers.retainAll(numbers2);
		
		 return numbers;	
		}
	
	
}
