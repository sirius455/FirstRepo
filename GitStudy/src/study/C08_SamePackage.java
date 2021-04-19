package study;

public class C08_SamePackage {
	public int public_var = 1;
	public int default_var = 2;
	public int protected_var = 3;
	public int private_var = 4;
	
	public void public_method() {
		System.out.println(public_var);
		System.out.println(default_var);
		System.out.println(protected_var);
		System.out.println(private_var);
	}
	
	void default_method() {}
	protected void protected_method() {}
	private void private_method() {}
}
