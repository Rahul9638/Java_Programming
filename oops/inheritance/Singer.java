package oops.inheritance;

public class Singer extends Person {

	public Singer(String name) {
		super(name);
		
	}

	public void Sing() {
		System.out.println(name+" is singing the song");
	}
	
	public void eat() {
		System.out.println("Singer "+ name +" is eating");
		
	}
	public static void Laughing() {
		System.out.println("Singer is laughing");
	}
}
