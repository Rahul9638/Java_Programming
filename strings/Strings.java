package strings;

public class Strings {

	public static void main(String[] args) {
//		String name = "Anuj";// By literals:- It creates the string which is being stored 
//		// in the string pool area. If the particular string is made earlier it can be used back
//		// without creating the another string.
//		String anotherName = "Rahul"; // By object:- It creates the string which is being 
//		// stored in the heap area. And also when the heap is created two string is being
//		// created. It depends whether it is in present earlier in the pool area and if not 
//		// it is created in pool as well as in  heap area also. 
//		System.out.println(anotherName);
		
		
		String name = "anuj";
		String name2 = "anuj";
		String anotherName = new String("anuj");
		System.out.println(name==name2); // Gaves true because it earlier it creates the anuj in string pool area and return
		// the same name in name2;
		System.out.println(name==anotherName);// These statement will return false because one belongs to the string pool area
		// [Name] and another one belongs to the heap area
		String name = "kumar";
	}

}
