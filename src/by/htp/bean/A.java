package by.htp.bean;

public class A {
	@SuppressWarnings("unused")
	private String a = "variable Class A";
	static{
		System.out.println("static{}ClassA");
	}
	
	public A(){
		this("a");
		System.out.println("A()");
	}

	public A(String str){
		System.out.println("A(String)");
	}
	
	public A(int a){
		this();
		System.out.println("A(int)");
	}

	{
		System.out.println("{}ClassA");
	}
}