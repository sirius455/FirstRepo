package myobj;

public class Pan {
	
	public int size;
	public float ink;
	public float weight;
	String brand;
	
	public void write() {
		ink -= 0.2;
		weight -= 0.5;
	}
	
	public void charge() {
		ink += 5;
		weight += 1; 
	}
	
	
}
