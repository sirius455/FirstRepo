package quiz;

import java.util.Random;
import java.util.Scanner;

import myobj.tong.Barrel;

public class C07_pirateGame {
//
//	/*
//	 * 1. �÷��̾ ���ư��鼭 ���ϴ� ���� Į�� ���
//	 * 
//	 * 2. �߸��� ���� Į�� ������ ���� �������� ���ư��� ���ӿ� �й��Ѵ�.
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
//			//System.out.println("�й� ���� : " + lose);
//
//			for (int i = 0; i <= arr.length; i++) {
//
//				
//
//				while (true) {
//					System.out.print("��ȣ�� �Է��ϼ��� > ");
//					user = sc.nextInt();
//
//					if (user >= 0 && user < arr.length) {
//						break;
//					} else {
//						System.out.println("�߸��� ���Դϴ�. 0 ~ 40���̸� �����ּ��� ");
//					}
//				}
//
//				while (true) {
//
//					if (user != lose && user >= 0 && user < arr.length) {
//						System.out.print("������� �����Դϴ� > ");
//						user = sc.nextInt();
//					} else if (user >= 0 && user < arr.length) {
//						break;
//					} else {
//						System.out.println("�߸��� ���Դϴ�. 0 ~ 40���̸� �����ּ��� ");
//						break;
//					}
//
//				}
//				if (user == lose) {
//					System.out.println("����� �й��ϼ̽��ϴ�");
//					break;
//
//				}
//
//			}
//			System.out.println("������ �������ϴ�.");
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
			System.out.println("���� �������� ���� ���");
			break;

		}
	}

	public void config(int mode) {
		this.mode = mode;
	}

	void pvp() {
		while (true) {
			System.out.print((turn + 1) + "�� ");
			System.out.print("'player" + (turn % numOfPlayer + 1) + "'�� ���� > ");
			int slot = sc.nextInt();

			if (barrel.fork(slot)) {

				if (barrel.checkGameOver()) {
					System.out.println("��������� ���ư����ϴ�...");
					System.out.println("'player" + (turn % numOfPlayer + 1) + "'�� �й�! ");
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

				System.out.print((turn + 1) + "��");
				int slot = ran.nextInt(20);
				System.out.println("'computer'�� ���� > " + slot);

				if (barrel.fork(slot)) {
					player = 0;
					turn++;

					if (barrel.checkGameOver()) {
						System.out.println("��������� ���ư����ϴ�...");
						System.out.println("'computer'�� �й�! ");
						break;
					}
					
				}
		
			}
			
			while (player == 0) {
				System.out.print((turn + 1) + "��");
				System.out.print("player'�� ���� > ");
				int slot = sc.nextInt();
				player = 1;

				if (barrel.fork(slot)) {
					player = 1;
					turn++;

					if (barrel.checkGameOver()) {
						System.out.println("��������� ���ư����ϴ�...");
						System.out.println("'player'�� �й�! ");
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

		System.out.println("�׽�Ʈ ���� ��!");
	}

}
