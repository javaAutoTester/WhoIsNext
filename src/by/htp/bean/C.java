
package by.htp.bean;

public class C extends B {
	@SuppressWarnings("unused")
	private String c = "variable Class C";
	static {
		System.out.println("static{}ClassC");
	}
	
	{
		System.out.println("{}ClassC");
	}
	
	public C(){
		super();
		System.out.println("C()");
	}
	

	public C(String c){
		super();
		System.out.println("C(String)");
	}

	public C(Object obj){
		this("a");
		System.out.println("C(Object)");
	}
}
