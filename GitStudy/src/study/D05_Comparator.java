package study;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class D05_Comparator {
	
	/*
	  	#Comparator
	  	
	  	 - 두 객체의 크기를 비교할 때 사용하는 클래스가 되는 인터페이스
	  	 - 객체간의 크기를 정할 때 사용된다 
	*/
	
	public static void main(String[] args) {
		
		String str1 = "yes";
		String str2 =  new String("yes");
		
		System.out.println("str1 == str2: " + (str1 == str2));
		System.out.println("str.equals(): " + str1.equals(str2));
		
		Grape podo1 = new Grape().setGno("PODO1588");
		Grape podo2 = new Grape().setGno("PODO1588");
		
		System.out.println(podo1 == podo2);
		System.out.println(podo1.equals(podo2));
		
		Grape grape01 = new Grape().setGno("PODO0001").setLocation(0).setFruit(30);
		LinkedList<Grape> grapes = new LinkedList<>();
		
		for(int i = 0; i < 10; i++) {
		grapes.addLast(new Grape()
				.setGno(String.format("PODO%04d", (int)(Math.random() * 100000)))
				.setLocation((int)(Math.random() * Grape.LOCATIONS))
				.setFruit((int)(Math.random() * 11 + 30)));
		//System.out.println(grapes.getLast());
		
	    }
		
		// 포도는 무엇을 기준삼아 정렬될까
		//Collections.sort(grapes, new 포도분류기_포도알맹이_오름차순());
		//Collections.sort(grapes, new 포도분류기_포도알맹이_내림차순());
		Collections.sort(grapes, new 포도분류기_GNO기준_내림차순());
		
//		System.out.println("\n####포도 알맹이 오름차순 정렬 #####");
//		for(Grape grape : grapes) {
//			System.out.println(grape);
//		}
//		
//		System.out.println("\n#### 포도 알맹이 내림차순 정렬 #####");
//		for(Grape grape : grapes) {
//			System.out.println(grape);
//		}
		
		System.out.println("\n#### 포도분류기_GNO기준_내림차순 #####");
		for(Grape grape : grapes) {
			System.out.println(grape);
		}
		
		// 연습 1 : 포도 알맹기 기준 내림차순 정렬해보기
		// 연습 2 : 포도 gno 기준 내림차순 정렬해보기
	}
}

class 포도분류기_포도알맹이_내림차순 implements Comparator<Grape> {

	@Override
	public int compare(Grape o1, Grape o2) {
		
		if(o1.fruit > o2.fruit) {
			return -1;
		} else if (o1.fruit == o2.fruit) {
			return 0;
		} else {
			return 1;
		}
		
	}
}


class 포도분류기_GNO기준_내림차순 implements Comparator<Grape> {

	@Override
	public int compare(Grape o1, Grape o2) {
		// 문자열의 크기  비교는 이미 string클래스의 compareTo메서드에 구현되어 있다
		return o1.gno.compareTo(o2.gno) * -1;
		
//		String gno1 = o1.gno;
//		String gno2 = o1.gno;
//		
//		int min_len = Math.min(gno1.length(), gno2.length());
//		
//		for (int i = 0; i < min_len; ++i)
//			if(gno1.charAt(i) > gno2.charAt(i)) {
//				return -1;
//			} else if (gno1.charAt(i) < gno2.charAt(i)) {
//				return 1;
//			}
//			
//			if(gno1.length() == gno2.length()) {
//				return 0;
//			} else if (gno1.length() > gno2.length()) {
//				return -1;
//			} else {
//				return 1;
//			}
	}
}

class 포도분류기_포도알맹이_오름차순 implements Comparator<Grape> {
	
	/*
	  # Comparator
	  - compare 메서드의 리턴 값이 양수면면 o1과 o2의 순서를 바군다
	  - compare 메서드의 리턴 값이 0이면 같은 크기로 취급한다
	  - compare 메서드의 리턴값이 음수면 o1과 o2의 순서를 그대로 유지한다
	  
	*/	
	@Override
	public int compare(Grape o1, Grape o2) {
		
		
		
		if(o1.fruit < o2.fruit) {
			return -1;
		} else if (o1.fruit == o2.fruit) {
			return 0;
		} else {
			return 1;
		}
		
	}
}

class Grape {
	
	private static String[] locationNames = {"말레이시아", "호주", "칠레", "싱가포르", "브라질"};
	public static int LOCATIONS = locationNames.length;
	
	String gno;
	int location;
	int fruit;
	
	Grape setGno(String gno) {
		this.gno = gno;
		return this;
	}
	
	Grape setLocation(int location_id) {
		location = location_id;
		return this;
	}
	
	Grape setFruit(int fruit) {
		this.fruit = fruit;
		return this;
	}
	
	/*
	  	# equals()
	  	
	  		- Object 메서드
	  		- 같은 객체인지 비교할 때 어떤 동작으로 구분해야 하는지를 구현해놓은 메서드
	  		- 기본동작은 주소값 비교 
	*/
	
	public boolean equals(Object obj) {
		return this.gno == ((Grape)obj).gno;
	}
	
	public boolean equals(Grape grape) {
		return this.gno == grape.gno;
	}
	
	/*
	  	
	  	# toString()
	  	
	  	 - 모든 객체에 포함되어 있는 메서드 (object 메서드)
	  	 - 이 인스턴스를 문자열로 표현한다면? 을 구현해놓은 메서드
	  	 - System.out.println()은 사실 전달한 인스턴스의 to String()
	  	      메서드의 결과를 콘솔에 출력하는 메서드이다
	  	 - object 클래스에 구현되어 있는 toString() 메서드의 기본 동작은 
	  	   "클래스명@주소값" 이다
	*/
	
	
	@Override
	public String toString() {
		return gno + "/" + fruit + "/" + locationNames[location] + "(" + location + ")";
	}
	
	
}