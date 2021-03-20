package oops;
class Cat{
	boolean hasFur;
	String color, breed;
	int legs,eyes;
	public void walk() {
		System.out.println("cat is walking");
	}
	public void eat() {
		System.out.println("Cat is eating");
	}
	public void description() {
		System.out.println("My Cat has "+ legs +" and "+eyes+" eyes");
	}
	
}
class Dog{
	String breed,name ;
	public void jump() {
		System.out.println("My dog "+ name+" Jumped");
		
	}
	public void description() {
		System.out.println("My dog's name is "+name+". It's breed is "+breed);
		
	}
	
}
public class MainClass {

	public static void main(String[] args) {
//		Cat cat1 = new Cat();
//		Cat cat2 = new Cat();
//		
//		cat1.eyes = 2;
//		cat1.legs = 4;
//		cat2.eyes = 4;
//		cat2.legs = 4;
//		
//		cat1.description();
//		cat2.description();
//		
 
		Dog husky = new Dog();
		Dog poddle = new Dog();
		
		husky.breed = "Husky";
		husky.name = "Browny";
		poddle.breed = "Poddle";
		poddle.name = "Mr. Mulchand ji";
		
		husky.jump();
		husky.description();
		poddle.jump();
		poddle.description();
		
	}

}
