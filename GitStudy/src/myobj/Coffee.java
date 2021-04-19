package myobj;

public class Coffee {
	
	static class CoffeCode{
		int code;
		String name;
		
		public CoffeCode(int code, String name) {
			this.code = code;
			this.name = name;
		}
		
		public int getCode() {
			return code;
		}
		
		public String getname() {
			return name;
		}
		
	}
	
	static class origin_names{
		int origin;
		String name;
		
		public origin_names(int origin, String name) {
			this.origin = origin;
			this.name = name;
		}
	}
	
	//private static String[] coffee_names = {"아메리카노", "카페라떼", "카페모카", "캬라멜 마끼야또"};
	//private static String[] origin_names = {"콜롬비아", "브라질", "에티오피아", "케냐", "인도"};
	
	public static CoffeCode AMERICANOO = new CoffeCode(0, "아메리카노");
	public static CoffeCode CAFE_LATTE = new CoffeCode(1, "카페라떼");
	public static CoffeCode CAFE_MOCHA = new CoffeCode(2, "카페모카");
	
	public static origin_names COLOMBIA = new origin_names(0, "콜롬비아");
	public static origin_names BRAZIL = new origin_names(1, "브라질");
	public static origin_names ETHIOPIA = new origin_names(2, "에티오페아");
	public static origin_names INDIA = new origin_names(3, "인도");
	
	
	CoffeCode coffee;
	int price;
	int caffeine;
	origin_names origin;
	
	boolean hot;
	
	
	public Coffee(CoffeCode coffee, int price, int caffeine, origin_names origin) {
		this.coffee = coffee;
		this.price = price;
		this.caffeine = caffeine;
		this.origin =  origin;
		this.hot = true;
		
	}
	
	public String getCoffeeName() {
		return coffee.name;	
	}
	
	public int getCoffeCode() {
		return coffee.code;
	}
	
	public String getOriginName() {
		return origin.name;
	}
	
	
	public static void main(String[] args) {
		Coffee coffee =  new Coffee(AMERICANOO, 1500, 10, COLOMBIA);
		Coffee coffee1 =  new Coffee(AMERICANOO, 1800, 15, BRAZIL);
		Coffee coffee2 =  new Coffee(CAFE_LATTE, 2500, 20, ETHIOPIA);
		Coffee coffee3 =  new Coffee(CAFE_MOCHA, 3500, 25, INDIA);
		
	 System.out.println(coffee2.getOriginName());
	 
	}
	
}

// outer class에는 protected private을 사용할 수 없다
class TodayCoffee {
	
	//inner class에는 모든 접근제어자를 사용할 수 있다
	protected class InnerClass{		
	}
	
	protected class InnerClass2{		
	}
	
}
