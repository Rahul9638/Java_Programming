package Polymorphism;

public class polymorphism {
	
	// Polymorphism is means more than one form, Polymorphism allow us to perfom single action
	// in different ways. In other words polymorphism allows you to define one interface 
	// multiple implementations.
	// Types of polymorphism:- 1. Run time polymorphism 2. Compile time polymorphism
	// 1. Run time polymorphism:- It is also called dynamic binding,late binding and 
	// overriding as well.
	// 2.Overriding is run time polymorphism having same method or signature and but associated
	// in class and subclass 
	// 3. Slower execution.
	// Compile time polymorphism:-
	// 1. It is also known as static binding , early binding and overloading as well.
	// 2. Overloading is compile time polymorphism where more than one method share the same name
	//    with different parameters and signature and return type 
	// 3. Faster execution
	public static void main(String[] args) {
		
		dog d = new dog();
		Pet p = d;
		Animal a = d;
//		
//		d.walk();
//		p.walk();
//		greetings();
//		greetings("Rahul",9);
//		greetings("My name is Rahul kumar Paswan"); 
		System.out.println(d.name);
		System.out.println(p.name);
		
	}
	public static void  greetings () {
		System.out.println("Hi, there");
	}
	public static void greetings(String s) {
		System.out.println(s);
	}
	public static void greetings(String s, int count) {
		for(int i = 0; i<count; i++) {
			System.out.println(s);
			
		}
	}

}
