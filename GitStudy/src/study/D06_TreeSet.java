package study;
//import java.util.TreeSet;
//
//public class D06_TreeSet {
//	
//	/*
//	  	# TreeSet
//	  	 - �ߺ����� ������ �� ����
//	  	 - �����͸� ������ �� Comparator�� �̿��� �̸� �����Ѵ�
//	  	 - ��ҷ� null�� ������� �ʴ´�
//	  	 - ó���� �����ؼ� �ֱ� ������ HashSet�� ���� ����ӵ��� ������
//	  	 - ������ TreeSet���� ����(�ε���)�� �ֱ� ������ ���ϴ� �����͸� ���� �� �ִ�
//	 */
//	
//	public static void main(String[] args) {
//		
//		
////		Mango mango = new Mango().setMno("mango0001").setsweet(0).setsize(30);
////		LinkedList<Mango> mangos = new LinkedList<>();
//
//		
//		TreeSet<Grape> grape_tree = new TreeSet<>(new �����з���_GNO����_��������());
//		TreeSet<Grape> grape_tree2 = new TreeSet<>(new �����з���_�����˸���_��������());
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
//		// �ش� ��ü ��ü�� �� ������ ��ü��� Comparator�� ������� ���� �� �ִ�
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
//		// �������� : ����Ʈ���� ���� 5�� �߰��Ҷ� mno���� �������� ������ �ǵ��� ����� Ȯ��
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
//	  - compare �޼����� ���� ���� 1�̸� o1�� o2�� ������ �ٱ���
//	  - compare �޼����� ���� ���� 0�̸� ���� ũ��� ����Ѵ�
//	  - compare �޼����� ���ϰ��� -1�̸� o1�� o2�� ������ �״�� �����Ѵ�
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
//// Comparator : ���Ҷ� ����ϴ� �� ���� Ŭ����
//// COmparable : �� ��ü�� �� ������ Ŭ�������� ǥ���ϴ� �������̽�	
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