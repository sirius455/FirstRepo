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
		System.out.println("���̺� �� ī�� : " + table.tableDeck);
		for (Player p : players) {
			HashSet<Card> hand = new HashSet<>(table.tableDeck);

			System.out.println("����ڰ� ����ִ� ī�� : " + p.hand);
		}
	}

	public static void main(String[] args) {
		OneCard game = new OneCard();

		// �ο��� ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ο����� �Է����ּ��� > ");
		//int player = sc.nextInt();
		int player = 4;
		
		for (int i = 0; i < player; i++) {
			game.addPlayer();
		}

		// ���ӽ���
		game.start();
		// ���̺� ����ī�� ����
		game.next();
		//�� �� ����ִ°� Ȯ��
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
		System.out.println("�÷��̾�" + (players + 1) + "�� �����Դϴ�");
		System.out.print("���� ���̺� > ");
		game.peekTable();
		System.out.println("�÷��̾� " + (players + 1) + " �� ��" + game.players.get(players));

		System.out.print("ī�� ��ο� = 1 ���ϴ� ī�峻�� = 2 > ");

		int choice = sc.nextInt();
		if(!(choice == 1 || choice == 2)) {
			System.out.println("���� 1�̳� 2�� �Է����ּ���");
			turn = false;
		} else if (choice == 1) {
			// �� �ʱ�ȭ
			if(deck.deck.size() == 0) {
				for(int j = 0; j < game.table.tableDeck.size(); j++) {
				deck.deck.add(game.table.tableDeck.get(j));
				deck.shuffle();		
				}
			}
			
			game.players.get(players).hand.add(deck.draw());
			System.out.println("���� �÷��̾� " + (players + 1) + "�� ���� �� " + game.players.get(players));
			System.out.print("���� ���̺� > ");
			game.peekTable();
			players++;
			System.out.println();
			continue;
			
			
		} else if (choice == 2) {
			System.out.print("��ī�带 �������ּ��� > ");
			int num = sc.nextInt();
			System.out.println();
			
			//�߸��� �����Է�
			while (num - 1 >= game.players.get(players).hand.size()) {
				System.out.print("������ �ִ� ī������� ���� ���ڸ��Է��ϼ̽��ϴ� �ٽ��Է����ּ��� > ");
				num = sc.nextInt();
				continue;
			}
				
			//��ī�� ���� ���ڸ��߱�
			if(game.players.get(players).hand.get(num - 1).suit.getShape()
				!= game.table.tableDeck.get(game.table.tableDeck.size() - 1).suit.getShape() &&
				game.players.get(players).hand.get(num - 1).rank.getValue() 
				!= game.table.tableDeck.get(game.table.tableDeck.size() - 1).rank.getValue()) {
				System.out.println("���� ���� ī���Դϴ�.");
				System.out.println();
				continue;
			} 
			
			//����ִ� ī���
			if(game.players.get(players).hand.get(num - 1).getRankValue() == Card.ACE.getValue()) {
				drawCard += 3;
			} else if (game.players.get(players).hand.get(num - 1).getRankValue() == Card.TWO.getValue()) {
				drawCard += 2;
			} else if (game.players.get(players).hand.get(num - 1).getRankValue() == Card.JOKER.getValue()) {
				drawCard += 5;
			} else if (game.players.get(players).hand.get(num - 1).getRankValue() == Card.KING.getValue()) {
				game.table.tableDeck.add(game.players.get(players).hand.get(num - 1));
				game.players.get(players).drop(num - 1);
				System.out.println("K = �ѹ���!");
				System.out.println();
				continue;
			} else if (game.players.get(players).hand.get(num - 1).getRankValue() == Card.QUEEN.getValue()) {
				System.out.println("Q = ��������");
				System.out.println();
			} else if (game.players.get(players).hand.get(num - 1).getRankValue() == Card.JACK.getValue()) {
				System.out.println("J = ����������� ��ŵ");
				System.out.println();
				
			}
			
			game.table.tableDeck.add(game.players.get(players).hand.get(num - 1));
			game.players.get(players).drop(num - 1);
			System.out.println("���� �÷��̾� " + (players + 1) + "�� ���� �� " + game.players.get(players));
			System.out.print("���� ���̺� > ");
			game.peekTable();
			
			//�¸�����
			if (game.players.get(players).hand.size() == 0) {
				end = 1;
				break;
			}
			
			while (turn = true) {
				System.out.print("ī�带 ���� ������ = 1 ��ο� �Ѵ� = 2 �׸��Ѵ� 3 > ");
				choice = sc.nextInt();

				if(!(choice == 1 || choice == 2 || choice == 3)) {
					System.out.println("���� 1�̳� 2�� �Է����ּ���");
					break;
				} else if (choice == 1) {
					System.out.println("���� �÷��̾� " + (players + 1) + "�� ���� �� " + game.players.get(players));
					System.out.print("���� ���̺� > ");
					game.peekTable();
					System.out.print("��ī�带 �������ּ��� > ");
					num = sc.nextInt();
					
					while (num - 1 >= game.players.get(players).hand.size()) {
						System.out.print("������ �ִ� ī������� ���� ���ڸ��Է��ϼ̽��ϴ� �ٽ��Է����ּ��� > ");
						num = sc.nextInt();
						continue;
					}
					
					//��ī�� ���� ���ڸ��߱�
					if(game.players.get(players).hand.get(num - 1).rank.getValue() != game.table.tableDeck.get(game.table.tableDeck.size() - 1).rank.getValue()) {
						System.out.println("���� ���ڰ��ƴϸ� ���Ͽ� ���������������ϴ�");
						continue;
					}else if(game.players.get(players).hand.get(num - 1).suit.getShape()
						!= game.table.tableDeck.get(game.table.tableDeck.size() - 1).suit.getShape() &&
						game.players.get(players).hand.get(num - 1).rank.getValue() 
						!= game.table.tableDeck.get(game.table.tableDeck.size() - 1).rank.getValue()) {
						System.out.println("���� ���� ī���Դϴ�.");
						System.out.println();
						continue;
					}
					
					//ī�� ��ɵ�
					if(game.players.get(players).hand.get(num - 1).getRankValue() == Card.ACE.getValue()) {
						drawCard += 3;
					} else if (game.players.get(players).hand.get(num - 1).getRankValue() == Card.TWO.getValue()) {
						drawCard += 2;
					} else if (game.players.get(players).hand.get(num - 1).getRankValue() == Card.JOKER.getValue()) {
						drawCard += 5;
					} else if (game.players.get(players).hand.get(num - 1).getRankValue() == Card.KING.getValue()) {
						game.table.tableDeck.add(game.players.get(players).hand.get(num - 1));
						game.players.get(players).drop(num - 1);
						System.out.println("K = �ѹ���!");
						System.out.println();
						continue;
					} else if (game.players.get(players).hand.get(num - 1).getRankValue() == Card.QUEEN.getValue()) {
						System.out.println("Q = ��������");
						System.out.println();
					} else if (game.players.get(players).hand.get(num - 1).getRankValue() == Card.JACK.getValue()) {
						System.out.println("J = ����������� ��ŵ");
						System.out.println();
					}
					
					game.table.tableDeck.add(game.players.get(players).hand.get(num - 1));
					game.players.get(players).drop(num - 1);
					System.out.println("���� �÷��̾� " + (players + 1) + "�� ���� �� " + game.players.get(players));
					System.out.print("���� ���̺� > ");
					game.peekTable();
					
					////�¸�����
					if (game.players.get(players).hand.size() == 0) {
						end = 1;
						break;
					}
				} else if (choice == 2) {
					// �� �ʱ�ȭ
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
		
		
		//�¸�
		if(end == 1) {
			System.out.println("�÷��̾�" + (players + 1) + "�� �¸��Դϴ�");
			break;
		}
			System.out.println();
			continue;
			
		}
   
	}
	
}

