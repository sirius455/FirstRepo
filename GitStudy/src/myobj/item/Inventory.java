package myobj.item;

public class Inventory {
	
	Item[] inventory;
	int size;
	
	public Inventory(int size) {
		inventory = new Item[size];
	}
	
	public boolean put(Item item) {
		for (int i = 0; i < inventory.length; i++) {
			if(inventory[i] == null) {
				inventory[i] = item;
				return true;
			}
		}

		return false;
	}
	
	public void useAllItems() { 
		for (Item item : inventory) {
			item.use();
		}
	}
	
	public static void main(String[] args) {
		Inventory inven1 = new Inventory(4);
		
		//item�� �־�� �ϴ� �ڸ��� item�� ��ӹ��� ��� �͵��� �� �� �ִ�.
		/*
		for (int i = 0; i < 4; i++) {
			if (inven1.put(new Sword("��",3000))) {
				System.out.println("�������� �� ���� put()���� true�� ���ϵ�");
			} else {
				System.out.println("�������� �� �� ���� put()���� false�� ���ϵ�");
			}
		}
		*/
		
		inven1.put(new Candy("���ݶ�", 3000));
		inven1.put(new Sword("��", 7000));
		inven1.put(new Armor("��", 5000));
		inven1.put(new AvoidPotion("ȸ������", 5000));
		 
		inven1.inventory[0].info();
		inven1.inventory[1].info();
		inven1.inventory[2].info();
		
		
		inven1.useAllItems();
		
	}
	
}
