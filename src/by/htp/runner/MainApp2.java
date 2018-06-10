package by.htp.runner;

import by.htp.bean.A;
import by.htp.bean.B;
import by.htp.bean.C;

public class MainApp2 {

	static {
		System.out.println("static{}ClassMainApp2");
		new C();
	}

	public static void main(String[] arg){
		System.out.println("main(String[] arg)");
		new C(new B());
		System.out.println("The END!!!");
	}
}
