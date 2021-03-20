package oops.inheritance;

public class Teacher extends Person {
	
	public Teacher(String name) {
		super(name);
		System.out.println("Inside teacher Constructor");
	}
	
	public void teach() {
		System.out.println(name+" is teaching");
	}
	
	public void eat() {
		super.eat();
		System.out.println("teacher "+ name +" is eating");
		
	}
	public static void Laughing() {
		System.out.println("Teacher is laughing");
	}
}
