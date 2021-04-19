package myobj.item;

/*
 * �� Ŭ������ ��ӹ޾� �������� 3�� ��������
 * 
 *  Item Ŭ������ �������� ����
 */

public abstract class Item {
	String name;
	int price;

	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	// final�� ���� �޼���� �ڽ� Ŭ�������� �������̵带 ������Ų��
	public void info() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + price + "��");

	}
	 
	abstract public void use();
//	 public void use() {
//		System.out.println("���� ������ �ڽ� Ŭ�������� �������� ����");
//	}
}

