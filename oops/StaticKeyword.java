package oops;

import oops.A.B;
import oops.A.C;

public class StaticKeyword {
	
	static {
		System.out.println("In block 1");
	}
	
	static {
		System.out.println("In block 2");
	}

	public static void main(String[] args) {
//		System.out.println(Math.max(753, 32));
		A objA = new A();
		B objB = objA.new B();
		C objC = new A.C();
		System.out.println("In side the main function");
		
		
	}
	
	static {
		System.out.println("In block 3");
	}

}
