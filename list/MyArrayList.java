package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {
	
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		List<String> vegetables = new LinkedList<>();
		vegetables.add("Bringal");
		vegetables.add("Potato");
		vegetables.add("tomato");
		
		//USING THE METHODS OF ARRAYLIST
		//vegetables.set(1, "bottle gaurd"); // Using set function
		//vegetables.remove(2); // Using remove function
		//vegetables.clear(); // Clear all the element of the arrayList
		List<String> toRemove = new ArrayList<>(); // Creating a new Arraylist of element which we want
												// want to remove
//		toRemove.add("Bringal"); // Adding the element 
//		toRemove.add("Potato"); // Adding the element
//		vegetables.removeAll(toRemove);// Using the function remove all to remove the elements from
										// vegetables's ArraList
		
//		System.out.println(vegetables.size()); // Returns an integer which indicates the size/
//		System.out.println(vegetables.contains("Chillies")); // Returns the boolean value whether the 
//												// the particular element given is part of the ArrayList
//		System.out.println(vegetables.isEmpty());// Returns boolean whether the arrayList is empty.
		String temp [] = new String[vegetables.size()];
		vegetables.toArray(temp);
		for(String e: temp) {
			System.out.println(e);
		}
		
		System.out.println(vegetables);
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		//fruits.addAll(vegetables); // Using addAll methods. This will concat the elements inside the 
		// the vegetables into fruits
		
		
		//System.out.println(fruits.get(3));
		
//		
//		ArrayList<Integer> marks = new ArrayList();
//		
//		Pair<String, Integer> p1 = new Pair("Rahul",33);
//		Pair<Boolean,String> p2 = new Pair(true,"Kumar");
//		p1.getDescription();
//		p2.getDescription();
		
	}

}
