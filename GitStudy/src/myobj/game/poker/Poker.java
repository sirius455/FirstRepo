package myobj.game.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Poker {
	
	ArrayList<Player> players;
	
	static Deck deck;
	Dealer dealer;
	
	public Poker() {
		players = new ArrayList<>();
		deck = new Deck();
		dealer = new Dealer(deck);
	}
	
	public void addPlayer() {
		players.add(new Player(deck));
	}
	
	public void start() {
		for (Player p : players) {
			p.firstDraw();
		}
	}
	
	public void next() {
		dealer.next();
	}
	
	public void peekTable() {
		System.out.println(dealer.table);
	}
	
	public void open() {
		System.out.println("테이블에 깔린 카드 : " + dealer.table);
		for(Player p : players) {
			HashSet<Card> hand = new HashSet<>(dealer.table);
			
			System.out.println("사용자가 들고있는 카드 : " + p.hand);
			
			hand.addAll(p.hand);		
			
			check(hand);
		}
	}
	
	private int[] conutSuits(HashSet<Card> hand) {
	
		return null;
	}
	
	// 0: not Straight
	// 1: straight
	// 2: straight flush
	// 3: royal straight flush
	private int checkStraight(HashSet<Card> hand){
		
		ArrayList<Card> sorted_hand = new ArrayList<>(hand);
		
		Collections.sort(sorted_hand);
		
		System.out.println("정렬된 핸드 : " + sorted_hand);
		
	
		for(int i = 2; i > -1; --i) {
			
			boolean straight = true;
			
			Card card0 = sorted_hand.get(i);
			
			System.out.printf("스트레이트 체크%d: %s\n ",3 - i, sorted_hand.get(i));
			
			for (int j =1; j < 5; ++j) {
				if (card0.getRankValue() + j != sorted_hand.get(i + j).getRankValue()) {
					straight = false;
					break;
				}
			}
			
		}
		
//		boolean straight = false;
//		
//		for(Card card : hand) {
//			int value = card.rank.getValue();
//			if (containsRankValue(value + 1) && 
//				containsRankValue(value + 2) &&
//				containsRankValue(value + 3) &&
//				containsRankValue(value + 4))  {
//				straight = true;
//			}
//			
//		}
		
		//HashSet<Rank> ranks = makeRankSet(hand);
		
		
		
		return 0;
	}
	
	//넘어온 hand로(7장) 어떤 족보인지 맞추고 승패를 가릴수 있는 점수를 리턴
	private int check(HashSet<Card> hand) {
			
		int straight = checkStraight(hand);
		
		return 0;
	}
	
	private HashSet<Rank> makeRankSet(HashSet<Card> hand) {
		HashSet<Rank> ranks = new HashSet<>();
		
		for(Card card : hand) {
			ranks.add(card.rank);
		}
		
		return ranks;
	}
	
	public static void main(String[] args) {
		Poker game = new Poker();
		
		game.addPlayer();
		game.addPlayer();
		game.addPlayer();
		
		game.start();
		
		
		System.out.println(deck);

		// 베팅이 끝나면 딜러가  3장 공개
		game.next();
		game.next();
		game.next();
		
		// 다음 베팅 끝나면 딜러가 1장 공개
//		game.next();
		
		// 다음 베팅 끝나면 딜러가 1장 공개
//		game.next();
		game.peekTable();
		
		game.players.get(0).peek();
		game.players.get(1).peek();
		game.players.get(2).peek();
		
		//결과 확인
		game.open();
		
System.out.println(deck);

	}
}
