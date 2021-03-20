package oops;


class Vehicle{
	int wheels;
	int headLights;
	String color;
//	Vehicle(){  // None parameterized constructor
//		wheels = 4;
//	}
	Vehicle(){
		// Default constructor
	}
	Vehicle(int wheels){ // Creating parameterized constructor
		this.wheels = wheels; // if the name of the variable is same as the name of the object then to differentiate
							 // between the object and the variable (this.) method is used
		headLights = 2;
	}
	Vehicle(int wheels, String color){
		this.wheels = wheels;
		this.color = color;
		headLights = 4;
	}
}

public class Constructor {
	
//	Constructor(){
//		System.out.println("Object is created");
//	}

	public static void main(String[] args) {
		
//		Constructor obj = new Constructor();
//		Vehicle car = new Vehicle();  // NO argument constructor.
//		Vehicle scooter = new Vehicle();// No argument constructor
		
		Vehicle auto = new Vehicle(3); 		// Argument passed or parameterized constructor
		Vehicle truck = new Vehicle(4);
//		System.out.println(auto.wheels);
//		System.out.println(truck.wheels);
		
		Vehicle eRicksaw = new Vehicle(4,"White");
		Vehicle bolero = new Vehicle();
		
		
		bolero.wheels = 4;
		bolero.color = "Red";
		System.out.println(bolero.color);
		System.out.println(auto.wheels);
		System.out.println(truck.wheels);
		System.out.println(eRicksaw.wheels+" wheels and color = "+eRicksaw.color);
		 
	}

}
