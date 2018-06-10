package by.htp.bean;

public class B extends A {
	@SuppressWarnings("unused")
	private String b = "variable Class B";
	static {
		System.out.println("static{}ClassB");
		new B();
	}

	{
		System.out.println("{1}ClassB");
	}

	public B() {
		this(123456);
		System.out.println("B()");
	}

	public B(int b) {
		super(b);
		System.out.println("B(int)");
	}

	{
		System.out.println("{2}ClassB");
	}
	
}
