package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 제네릭을 설정해둔 클래스는 인스턴스 생성시 원하는 타입을 고를 수 있게 된다
// 고르지 않으면 object로 설정된다
public class D02_JiphapQuiz<T> {
	
	/*
	  1. 두 컬렉션을 매개변수로 전달받으면 두 컬렉션의 합집합을 Set타입으로 반환하는 메서드
	  
	  2. 두 컬렉션을 매개변수로 전달받으면 두 컬렉션의 교집합을 Set타입으로 반환하는 메서드
	  
	  3. 두 컬렉션을 매개변수로 전달받으면 두 컬렉션의 차집합을 Set타입으로 반환하는 메서드
	  
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
		//String 값은 변화시킬수 없다
		// +=을 할때 알아서 새로우 String 인스턴스를 생성하도록 설계되어 있다.
		a += b;
		return a;
	}
	
	public static void main(String[] args) {
		// 소문자로 시작하는 타입들(기본형)은 매개변수로 전달할때 값을 복사한다.
		int int_a = 20;
		int int_b = 30;
		
		System.out.println(plus(int_a, int_b));
		System.out.println("plus 후 int_a의 값: " + int_a);
		
		// 대문자로 시작하는 타입들(참조형)은 매개변수로 전달할 때 주소를 복사하여 전달한다
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

		
		System.out.println("uion을 실행하기 전의 a: " + a);
		System.out.println(jiphap_tools.union(a, b));
		
		
		System.out.println("uion을 실행하기 후의 a: " + a);
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
