
package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Set<String> fruits = new HashSet<>(); // Returns the element in random order.It is not granted that the
													// the order in which you insert the element will get your element in same 
													// set
		//Set<String> fruits = new HashSet<>(); // Returns the element in same fashion in the fashion you actually insert.
//		fruits.add("Apple");
//		fruits.add("Orange");
//		System.out.println(fruits.add("Banana"));
//		fruits.add("Mango");
//		fruits.add("Lemon");
//		System.out.println(fruits.add("Apple"));
//		System.out.println(fruits);
//		Set<String> fruits = new TreeSet<>(); //Returns the element in sorted order. In ascending order in case of 
//													//strings.
//		fruits.add("Kiwi");
//		fruits.add("Apple");
//		fruits.add("Raspberry");
//		System.out.println(fruits);
		
		Set<Integer> x = new HashSet<>();
		x.add(22);
		x.add(12);
		x.add(54);
		x.add(87);
		Set<Integer> y = new HashSet<>();
//		y.add(32);
//		y.add(830);
//		y.add(54);
		y.add(49);
		y.add(12);
		//x.addAll(y); // UNION:- All the elements of y will be inside the x. The condition is the element should not be present in x
					// And the repeating element is not allowed in the set.
		//x.retainAll(y);// Intersection:- All the element which are common in the set x and y are returned in x
		System.out.println(x.containsAll(y)); // Subset:- It reflects whether the y is subset of x
		System.out.println(x);
	}

}
