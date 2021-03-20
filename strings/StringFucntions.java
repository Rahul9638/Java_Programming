package strings;

public class StringFucntions {
	public static void main(String[] args) {
		String name = "Rahul";
		String name1 = "Rahul ";
		//System.out.println(name.charAt(3)); // Using charAt function which will return the character of string at particlular
		// string
		//System.out.println(name.length());// This will count the length of the string //
		//System.out.println(name.substring(5)); // This will return the whole string starting from the provided string
		//System.out.println(name.substring(5,13)); // This will return all the string between the mentioned limitation 
		//Iteration will return upto n-1
		//System.out.println(name.contains("Rahul"));
		//System.out.println(name.equals(name1));// It will return the original values of the string 
		//System.out.println(name.isEmpty());
		name1 = name1 + "Kumar";
		String car1 = "Hyundai, Maruti, Suzuki, Lamborghini, Wagnor, Ferrari";
		String car2 = "Hyundai";
		String [] allCars = car.split(", ");
//		for(String cars: allCars) {
//			System.out.println(cars);
//		}
//		System.out.println(name1);
//		System.out.println(name.concat(" is good boy"));
//		System.out.println(name1.replace('u', 'a'));
//		System.out.println(car.indexOf("S"));
//		System.out.println(car.toLowerCase());
//		System.out.println(car.toUpperCase());
//		String name3 = "    Anuj      ";
//		System.out.println(name3.trim());
		System.out.println(car2.charAt(0).toUppercase());
		
	}

}
