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
		
		//item을 넣어야 하는 자리에 item을 상속받은 모든 것들이 들어갈 수 있다.
		/*
		for (int i = 0; i < 4; i++) {
			if (inven1.put(new Sword("검",3000))) {
				System.out.println("아이템이 잘 들어가면 put()에서 true가 리턴됨");
			} else {
				System.out.println("아이템이 잘 안 들어가면 put()에서 false가 리턴됨");
			}
		}
		*/
		
		inven1.put(new Candy("리콜라", 3000));
		inven1.put(new Sword("검", 7000));
		inven1.put(new Armor("방어구", 5000));
		inven1.put(new AvoidPotion("회피포션", 5000));
		 
		inven1.inventory[0].info();
		inven1.inventory[1].info();
		inven1.inventory[2].info();
		
		
		inven1.useAllItems();
		
	}
	
}
