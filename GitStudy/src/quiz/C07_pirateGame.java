package quiz;

import java.util.Random;
import java.util.Scanner;

import myobj.tong.Barrel;

public class C07_pirateGame {
//
//	/*
//	 * 1. 플레이어가 돌아가면서 원하는 곳에 칼을 찌른다
//	 * 
//	 * 2. 잘못된 곳에 칼을 넣으면 해적 아저씨가 날아가며 게임에 패배한다.
//	 * 
//	 */
//
//	class Barrel {
//		Random ran;
//		
//		boolean[] die;
//		
//		public Barrel(int size) {
//			ran = new Random();
//			die = new boolean[size];
//			die[ran.nextInt(size)] = true;
//		}
//	}

//	public static void main(String[] args) {
//
//		Random ran = new Random();
//		Scanner sc = new Scanner(System.in);
//
//		int[] arr = new int[40];
//		int user;
//		
//		while (true) {
//
//			int lose = ran.nextInt(40) ;
//			//System.out.println("패배 숫자 : " + lose);
//
//			for (int i = 0; i <= arr.length; i++) {
//
//				
//
//				while (true) {
//					System.out.print("번호를 입력하세요 > ");
//					user = sc.nextInt();
//
//					if (user >= 0 && user < arr.length) {
//						break;
//					} else {
//						System.out.println("잘못된 값입니다. 0 ~ 40사이를 적어주세요 ");
//					}
//				}
//
//				while (true) {
//
//					if (user != lose && user >= 0 && user < arr.length) {
//						System.out.print("다음사람 차례입니다 > ");
//						user = sc.nextInt();
//					} else if (user >= 0 && user < arr.length) {
//						break;
//					} else {
//						System.out.println("잘못된 값입니다. 0 ~ 40사이를 적어주세요 ");
//						break;
//					}
//
//				}
//				if (user == lose) {
//					System.out.println("당신은 패배하셨습니다");
//					break;
//
//				}
//
//			}
//			System.out.println("게임이 끝났습니다.");
//			break;
//		}
//		
//
//	}

	Scanner sc;
	Barrel barrel;
	int mode;

	int player = 1;

	int turn;
	int numOfPlayer;
	int computer = 0;

	public C07_pirateGame(int mode) {
		this.barrel = new Barrel(20);
		this.mode = mode;
		this.turn = 0;
		this.numOfPlayer = 2;
		this.computer = 1;
		this.sc = new Scanner(System.in);
	}

	public C07_pirateGame(int mode, int numOfPlayer) {
		this(mode);
		this.numOfPlayer = numOfPlayer;
	}

//	public C07_pirateGame(int mode, int computer) {
//		this(mode);
//		this.computer = computer;
//	}

	public void start() {
		switch (this.mode) {
		case 0:
			pvp();
			break;
		case 1:
			pvc();
			break;
		default:
			System.out.println("아직 구현되지 않은 모드");
			break;

		}
	}

	public void config(int mode) {
		this.mode = mode;
	}

	void pvp() {
		while (true) {
			System.out.print((turn + 1) + "턴 ");
			System.out.print("'player" + (turn % numOfPlayer + 1) + "'의 차례 > ");
			int slot = sc.nextInt();

			if (barrel.fork(slot)) {

				if (barrel.checkGameOver()) {
					System.out.println("통아저씨가 날아갔습니다...");
					System.out.println("'player" + (turn % numOfPlayer + 1) + "'의 패배! ");
					break;
				}

				turn++;
			}
		}
	}

	void pvc() {

		Random ran = new Random();

		while (true) {
			while (player == 1) {

				System.out.print((turn + 1) + "턴");
				int slot = ran.nextInt(20);
				System.out.println("'computer'의 차례 > " + slot);

				if (barrel.fork(slot)) {
					player = 0;
					turn++;

					if (barrel.checkGameOver()) {
						System.out.println("통아저씨가 날아갔습니다...");
						System.out.println("'computer'의 패배! ");
						break;
					}
					
				}
		
			}
			
			while (player == 0) {
				System.out.print((turn + 1) + "턴");
				System.out.print("player'의 차례 > ");
				int slot = sc.nextInt();
				player = 1;

				if (barrel.fork(slot)) {
					player = 1;
					turn++;

					if (barrel.checkGameOver()) {
						System.out.println("통아저씨가 날아갔습니다...");
						System.out.println("'player'의 패배! ");
						break;
						
					}
					
				}
				
			}
			
		}
		
	}

	public static void main(String[] args) {
		C07_pirateGame testGame = new C07_pirateGame(99);

		testGame.start();
		testGame.config(1);
		testGame.start();

		System.out.println("테스트 게임 끝!");
	}

}
