package study;
import myobj.Coffee;
import myobj.DiffPackage;

public class C08_AccessModifier {
		
	/*
	  	# 접근 제어자 (Access Modifier)
	  	
	  	 - 다른 클래스에서 해당 클래스의 자원을 사용하려고 할 때
	  	      어디까지 허용할지를 설정한다
	  	 - 쓰는이유는 무분별한 수정 접근을 막기위해서 제작자가 걸어놓은것이다.
	  	      제작자의 의도를 벗어나지 않게 하기위해 하는것
	  	 
	  	# 접근 제어자를 통해 구분할 수 있는 거리의 종류
	  	
	  		- 같은 클래스 내부의 다른자원 (가장 가까운 거리)
	  		- 같은 패키지 내부의 다른자원 (두번째로 가까운 거리)
	  		- 다른 패키지에 있지만 상속받은 자원
	  	    - 다른 클래스의 자원 (가장 먼 거리)
	  	      
	  	# 접근 제어자의 종류
	  	
	  	- private
	  		: 앞에 private이 붙은 자원은 같은 클래스 내부에서만 접근할 수 있게 된다
	  		
	  	- default(아무것도 안씀)
	  		: 같은 패키지 내부에서는 자유롭게 접근할 수 있게 된다.
	  	   	    다른 패키지에서는 접근할 수 없다.
	  		
	  	- protected
	  		: 앞에 protected가 붙은 자원은
	  		    같은 패키지 내부에서는 자유롭게 접근할 수 있고,
	  		    다른 패키지에서는 상속받은 클래스만 접근할 수 있는 자원이 된다.
	  		    
	  	- public
	  		: 다른패키지에서도 자유롭게 접근할 수 있는 자원이 된다.
	  		
	  	
	  	      
	 */
	public static void main(String[] args) {
		C08_SamePackage instance = new C08_SamePackage();
		
		instance.protected_method();
		instance.default_method();
		instance.public_method();
		
	
		DiffPackage instance2 = new DiffPackage();
		
		instance2.public_method();
		
		Coffee coffee =  new Coffee(Coffee.AMERICANOO, 1500, 10, Coffee.COLOMBIA);
		Coffee coffee1 =  new Coffee(Coffee.AMERICANOO, 1800, 15, Coffee.BRAZIL);
		Coffee coffee2 =  new Coffee(Coffee.CAFE_LATTE, 2500, 20, Coffee.ETHIOPIA);
		Coffee coffee3 =  new Coffee(Coffee.CAFE_MOCHA, 3500, 25, Coffee.INDIA);
		
	System.out.println(coffee.getCoffeeName());
	}
	
}



class Snack {
	 int size = 10;
	
	 void eat() {
		System.out.println(size - 1);
	}
}

class HoneyButterChip extends Snack {
	
	 void abc() {
		System.out.println(size);
	}
}

class Choco extends DiffPackage {
	
	public Choco() {
		// protected : 상속받으면 다른패키지에서도 사용가능
		this.protected_method();
	}
	
	void abc() {
		Snack s = new Snack();
		System.out.println(s.size);
	}
}


