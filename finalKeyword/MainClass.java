package finalKeyword;

public class MainClass extends Student{ // Since we have final set the student class as final 
										// So we cannot inherit the student class
	
	
//	public void getDescription() {// Since we have set the this function as final in the student class
//		System.out.println("Inside main class");
//	}
	
	//final int ROLL_NO = 42; // blank field = Non Initialized final variable
	// And main class variable must  be initialized 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//final String name = "Rahul"; // Local variable will not throw any error if it will not initialzied
		// name = "kumar"; // Here the value of the name variable changed to kumar instead of rahul
		final Student obj = new Student();
		Student obj2 = new Student();
		 // The obj has declared as final object. We cannot reference the obj to new location since
					// it is already declared final
		MainClass ram = new MainClass();
		ram.getDescription();

	}

}
