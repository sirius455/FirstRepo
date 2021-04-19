package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class D02_LottoSet {
	
	/* 
	  1부터 45사이의 중복없는 랜덤 숫자 7개로 이루어진 HashSet를 생성하는 
	  반환하는메서드를 작성하고 test해보기 
	 
	 
	 */
	public HashSet<Integer> getLottoSet(){
		HashSet<Integer> lotto = new HashSet<>();
		
		while(lotto.size() < 7 ) {
			lotto.add((int)(Math.random() * 45 + 1));
		}
		
		return lotto;
	
		
	}
	/*
	  1부터 45사이의 중복없는 랜덤 숫자 7개로 이루어진 ArrayList를 생성하는 
	  반환하는메서드를 작성하고 test해보기 
	 */
	public ArrayList<Integer> getLottoList() {
		
		return new ArrayList<>(getLottoSet());
	
	}
	
	/*
	  1부터 45사이의 중복없는 랜덤 숫자 7개로 이루어진 integer[]를 생성하는 
	  반환하는메서드를 작성하고 test해보기 
	 */
	
	public Integer[] getLottoArray() {
		return getLottoList().toArray(new Integer[7]);
	}
	
	public int[] getLottoArray2() {
		Integer[] lotto = getLottoArray();
		int[] result = new int[7];
		
		for (int i = 0; i < 7; i++) {
			result[i] = lotto[i];
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		HashSet<Integer> lotto = new D02_LottoSet().getLottoSet();
		ArrayList<Integer> lotto2 = new D02_LottoSet().getLottoList();
		int[] lotto3 = new D02_LottoSet().getLottoArray2();
		
		System.out.println(lotto);
		System.out.println(lotto2);
		System.out.println(lotto3);
	}
	
}

