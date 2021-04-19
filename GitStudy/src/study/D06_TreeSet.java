package study;
//import java.util.TreeSet;
//
//public class D06_TreeSet {
//	
//	/*
//	  	# TreeSet
//	  	 - 중복값을 저장할 수 없다
//	  	 - 데이터를 저장할 때 Comparator를 이용해 미리 정렬한다
//	  	 - 요소로 null을 허용하지 않는다
//	  	 - 처음에 정렬해서 넣기 때문에 HashSet에 비해 저장속도가 느리다
//	  	 - 하지만 TreeSet에는 순서(인덱스)가 있기 때문에 원하는 데이터만 꺼낼 수 있다
//	 */
//	
//	public static void main(String[] args) {
//		
//		
////		Mango mango = new Mango().setMno("mango0001").setsweet(0).setsize(30);
////		LinkedList<Mango> mangos = new LinkedList<>();
//
//		
//		TreeSet<Grape> grape_tree = new TreeSet<>(new 포도분류기_GNO기준_내림차순());
//		TreeSet<Grape> grape_tree2 = new TreeSet<>(new 포도분류기_포도알맹이_오름차순());
////		TreeSet<Mango> mango_tree = new TreeSet<>(new MangoCompareBySweetAsc());
//		
//
//		
////		for(int i = 0; i < 5; i++) {
////			
////			mangos.addLast(new Mango()
////					.setMno(String.format("PODO%04d", (int)(Math.random() * 100000)))
////					.setsweet((int)(Math.random() * Grape.LOCATIONS))
////					.setsize((int)(Math.random() * 11 + 30)));
////			
////			System.out.println(mangos.getLast());
////		    }
////		
////		Collections.sort(mangos, new MangoCompareBySweetAsc());
////		
////		for(Mango mango : mangos) {
////			System.out.println(mango);
////		}
//		// 해당 객체 자체가 비교 가능한 객체라면 Comparator를 사용하지 않을 수 있다
//		TreeSet<String> word_tree = new TreeSet<>();
//		TreeSet<Mango> mango_tree = new TreeSet<>();
//		
//		for (int i = 0; i < 5; i++) {
//			mango_tree.add(
//					new Mango(
//							String.format("05%d", (int)(Math.random() * 100000)),
//							10,
//							10));	
//			
//		}
//		
//		grape_tree.add(new Grape().setGno("1").setFruit(37));
//		grape_tree.add(new Grape().setGno("2").setFruit(31));
//		grape_tree.add(new Grape().setGno("3").setFruit(40));
//		grape_tree.add(new Grape().setGno("4").setFruit(37));
//		
//
//		grape_tree2.addAll(grape_tree);
//		
//	
//		
//		System.out.println(grape_tree);
//		System.out.println(grape_tree2);
////		System.out.println(mango_tree);
//		
//		// 연습문제 : 망고트리에 망고를 5개 추가할때 mno기준 오름차순 정렬이 되도록 만들고 확인
//		
//		word_tree.add("cat");
//		word_tree.add("pet");
//		word_tree.add("pat");
//		word_tree.add("fat");
//		word_tree.add("bat");
//		
//		System.out.println(word_tree);
//	}
//	
//}
//
////class MangoCompareBySweetAsc implements Comparator<Mango> {
//	/*
//	  # Comparator
//	  - compare 메서드의 리턴 값이 1이면 o1과 o2의 순서를 바군다
//	  - compare 메서드의 리턴 값이 0이면 같은 크기로 취급한다
//	  - compare 메서드의 리턴값이 -1이면 o1과 o2의 순서를 그대로 유지한다
//	  
//	  [3, 2, 3, 8, 99, 1, 5, 8, 9]
//	  
//	*/	
//	
//	
////	
////	@Override
////	public int compare(Mango o1, Mango o2) {
////		
////		return o1.mno.compareTo(o2.mno) * 1;
////	}
////	
////}
//
////class Mango {
////	String mno;
////	int sweet;
////	int size;
////	
////	public Mango(String mon, int sweet, int size) {
////	
////		this.mno = mno;
////		this.sweet = sweet;
////		this.size = size;		
////	}
////	
//	
//// Comparator : 비교할때 사용하는 비교 도구 클래스
//// COmparable : 이 객체가 비교 가능한 클래스임을 표시하는 인터페이스	
//	class Mango implements Comparable<Mango> {
//		
//		String mno;
//		int sweet;
//		int size;
//		
//		public boolean equals(Mango mango) {
//			return this.mno == mango.mno;
//		}
//
//		
//		public Mango(String mno, int sweet, int size) {
//			this.mno = mno;
//			this.sweet = sweet;
//			this.size = size;
//		}
//		
//		Mango setMno(String mno) {
//			this.mno = mno;
//			return this;
//		}
//		
//			
//		Mango setsweet(int sweet) {
//			sweet = sweet;
//			return this;
//		}
//		
//		Mango setsize(int size) {
//			this.size = size;
//			return this;
//		}
//		
//		public int compareTo(Mango o) {
//			return this.mno.compareTo(mno);
//		}
//		
//		@Override
//		public String toString() {
//			return mno + "/" + sweet + "/" + size;
//		
//	}
//}