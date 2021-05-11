package myobj.game.onecard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class OneCard {
	ArrayList<Player> players;

	static Deck deck;
	TableDeck table;

	public OneCard() {
		players = new ArrayList<>();
		deck = new Deck();
		table = new TableDeck(deck);
	}

	public void addPlayer() {
		players.add(new Player(deck));
	}

	public void next() {
		table.next();
	}

	public void start() {
		for (Player p : players) {
			p.firstDraw();
		}
	}

	public void peekTable() {
		System.out.println(table.tableDeck.get(table.tableDeck.size() - 1));
	}

	public void open() {
		System.out.println("테이블에 깔린 카드 : " + table.tableDeck);
		for (Player p : players) {
			HashSet<Card> hand = new HashSet<>(table.tableDeck);

			System.out.println("사용자가 들고있는 카드 : " + p.hand);
		}
	}

	public static void main(String[] args) {
		OneCard game = new OneCard();

		// 인원수 정하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("시작인원수를 입력해주세요 > ");
		//int player = sc.nextInt();
		int player = 4;
		
		for (int i = 0; i < player; i++) {
			game.addPlayer();
		}

		// 게임시작
		game.start();
		// 테이블 시작카드 오픈
		game.next();
		//각 패 들고있는거 확인
		game.open();
		
		Random ran = new Random();
		int players = ran.nextInt(player);
		boolean turn = true;
		int end = 0;
		int drawCard = 0;
		boolean jack = false;
		
		while(true) {
	
		if(players >= player) {
				players = 0;
		}
		System.out.println("플레이어" + (players + 1) + "의 차례입니다");
		System.out.print("현재 테이블덱 > ");
		game.peekTable();
		System.out.println("플레이어 " + (players + 1) + " 의 패" + game.players.get(players));

		System.out.print("카드 드로우 = 1 원하는 카드내기 = 2 > ");

		int choice = sc.nextInt();
		if(!(choice == 1 || choice == 2)) {
			System.out.println("숫자 1이나 2를 입력해주세요");
			turn = false;
		} else if (choice == 1) {
			// 덱 초기화
			if(deck.deck.size() == 0) {
				for(int j = 0; j < game.table.tableDeck.size(); j++) {
				deck.deck.add(game.table.tableDeck.get(j));
				deck.shuffle();		
				}
			}
			
			game.players.get(players).hand.add(deck.draw());
			System.out.println("현재 플레이어 " + (players + 1) + "의 남은 패 " + game.players.get(players));
			System.out.print("현재 테이블덱 > ");
			game.peekTable();
			players++;
			System.out.println();
			continue;
			
			
		} else if (choice == 2) {
			System.out.print("낼카드를 선택해주세요 > ");
			int num = sc.nextInt();
			System.out.println();
			
			//잘못된 숫자입력
			while (num - 1 >= game.players.get(players).hand.size()) {
				System.out.print("가지고 있는 카드수보다 높은 숫자를입력하셨습니다 다시입력해주세요 > ");
				num = sc.nextInt();
				continue;
			}
				
			//원카드 문양 숫자맞추기
			if(game.players.get(players).hand.get(num - 1).suit.getShape()
				!= game.table.tableDeck.get(game.table.tableDeck.size() - 1).suit.getShape() &&
				game.players.get(players).hand.get(num - 1).rank.getValue() 
				!= game.table.tableDeck.get(game.table.tableDeck.size() - 1).rank.getValue()) {
				System.out.println("낼수 없는 카드입니다.");
				System.out.println();
				continue;
			} 
			
			//기능있는 카드들
			if(game.players.get(players).hand.get(num - 1).getRankValue() == Card.ACE.getValue()) {
				drawCard += 3;
			} else if (game.players.get(players).hand.get(num - 1).getRankValue() == Card.TWO.getValue()) {
				drawCard += 2;
			} else if (game.players.get(players).hand.get(num - 1).getRankValue() == Card.JOKER.getValue()) {
				drawCard += 5;
			} else if (game.players.get(players).hand.get(num - 1).getRankValue() == Card.KING.getValue()) {
				game.table.tableDeck.add(game.players.get(players).hand.get(num - 1));
				game.players.get(players).drop(num - 1);
				System.out.println("K = 한번더!");
				System.out.println();
				continue;
			} else if (game.players.get(players).hand.get(num - 1).getRankValue() == Card.QUEEN.getValue()) {
				System.out.println("Q = 역순진행");
				System.out.println();
			} else if (game.players.get(players).hand.get(num - 1).getRankValue() == Card.JACK.getValue()) {
				System.out.println("J = 다음사람차례 스킵");
				System.out.println();
				
			}
			
			game.table.tableDeck.add(game.players.get(players).hand.get(num - 1));
			game.players.get(players).drop(num - 1);
			System.out.println("현재 플레이어 " + (players + 1) + "의 남은 패 " + game.players.get(players));
			System.out.print("현재 테이블덱 > ");
			game.peekTable();
			
			//승리조건
			if (game.players.get(players).hand.size() == 0) {
				end = 1;
				break;
			}
			
			while (turn = true) {
				System.out.print("카드를 한장 더낸다 = 1 드로우 한다 = 2 그만한다 3 > ");
				choice = sc.nextInt();

				if(!(choice == 1 || choice == 2 || choice == 3)) {
					System.out.println("숫자 1이나 2를 입력해주세요");
					break;
				} else if (choice == 1) {
					System.out.println("현재 플레이어 " + (players + 1) + "의 남은 패 " + game.players.get(players));
					System.out.print("현재 테이블덱 > ");
					game.peekTable();
					System.out.print("낼카드를 선택해주세요 > ");
					num = sc.nextInt();
					
					while (num - 1 >= game.players.get(players).hand.size()) {
						System.out.print("가지고 있는 카드수보다 높은 숫자를입력하셨습니다 다시입력해주세요 > ");
						num = sc.nextInt();
						continue;
					}
					
					//원카드 문양 숫자맞추기
					if(game.players.get(players).hand.get(num - 1).rank.getValue() != game.table.tableDeck.get(game.table.tableDeck.size() - 1).rank.getValue()) {
						System.out.println("같은 숫자가아니면 한턴에 여러번낼수없습니다");
						continue;
					}else if(game.players.get(players).hand.get(num - 1).suit.getShape()
						!= game.table.tableDeck.get(game.table.tableDeck.size() - 1).suit.getShape() &&
						game.players.get(players).hand.get(num - 1).rank.getValue() 
						!= game.table.tableDeck.get(game.table.tableDeck.size() - 1).rank.getValue()) {
						System.out.println("낼수 없는 카드입니다.");
						System.out.println();
						continue;
					}
					
					//카드 기능들
					if(game.players.get(players).hand.get(num - 1).getRankValue() == Card.ACE.getValue()) {
						drawCard += 3;
					} else if (game.players.get(players).hand.get(num - 1).getRankValue() == Card.TWO.getValue()) {
						drawCard += 2;
					} else if (game.players.get(players).hand.get(num - 1).getRankValue() == Card.JOKER.getValue()) {
						drawCard += 5;
					} else if (game.players.get(players).hand.get(num - 1).getRankValue() == Card.KING.getValue()) {
						game.table.tableDeck.add(game.players.get(players).hand.get(num - 1));
						game.players.get(players).drop(num - 1);
						System.out.println("K = 한번더!");
						System.out.println();
						continue;
					} else if (game.players.get(players).hand.get(num - 1).getRankValue() == Card.QUEEN.getValue()) {
						System.out.println("Q = 역순진행");
						System.out.println();
					} else if (game.players.get(players).hand.get(num - 1).getRankValue() == Card.JACK.getValue()) {
						System.out.println("J = 다음사람차례 스킵");
						System.out.println();
					}
					
					game.table.tableDeck.add(game.players.get(players).hand.get(num - 1));
					game.players.get(players).drop(num - 1);
					System.out.println("현재 플레이어 " + (players + 1) + "의 남은 패 " + game.players.get(players));
					System.out.print("현재 테이블덱 > ");
					game.peekTable();
					
					////승리조건
					if (game.players.get(players).hand.size() == 0) {
						end = 1;
						break;
					}
				} else if (choice == 2) {
					// 덱 초기화
					if(deck.deck.size() == 0) {
						for(int j = 0; j < game.table.tableDeck.size(); j++) {
						deck.deck.add(game.table.tableDeck.get(j));
						deck.shuffle();
						}
					}
					
					game.players.get(players).hand.add(deck.draw());
					System.out.println(game.players.get(players));
					
					game.peekTable();
					players++;
					break;
				} else if (choice == 3) {
					players++;
					break;
				}
				
			}
		  }
		
		
		//승리
		if(end == 1) {
			System.out.println("플레이어" + (players + 1) + "의 승리입니다");
			break;
		}
			System.out.println();
			continue;
			
		}
   
	}
	
}

