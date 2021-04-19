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
	
	//private static String[] coffee_names = {"�Ƹ޸�ī��", "ī���", "ī���ī", "ļ��� �����߶�"};
	//private static String[] origin_names = {"�ݷҺ��", "�����", "��Ƽ���Ǿ�", "�ɳ�", "�ε�"};
	
	public static CoffeCode AMERICANOO = new CoffeCode(0, "�Ƹ޸�ī��");
	public static CoffeCode CAFE_LATTE = new CoffeCode(1, "ī���");
	public static CoffeCode CAFE_MOCHA = new CoffeCode(2, "ī���ī");
	
	public static origin_names COLOMBIA = new origin_names(0, "�ݷҺ��");
	public static origin_names BRAZIL = new origin_names(1, "�����");
	public static origin_names ETHIOPIA = new origin_names(2, "��Ƽ�����");
	public static origin_names INDIA = new origin_names(3, "�ε�");
	
	
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

// outer class���� protected private�� ����� �� ����
class TodayCoffee {
	
	//inner class���� ��� ���������ڸ� ����� �� �ִ�
	protected class InnerClass{		
	}
	
	protected class InnerClass2{		
	}
	
}
