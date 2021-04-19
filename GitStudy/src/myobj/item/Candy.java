package myobj.item;

class Candy extends Item {
	
	int healthy;
	
	public Candy(String name, int price) {
		super(name, price);
		healthy = 10;
	}
	
	public void use() { 
		System.out.println(name +"를 먹어서 " + healthy + "만큼 목 건강이 좋아졌습니다.");
	}
	
	public static void main(String[] args) {
		
		new Candy("목캔디", 1500).use();
		new Candy("목캔디", 1500).info();
		
	}
	
}