package deque;

import java.util.ArrayDeque;

public class MainClass {
	public static void main(String[] args) {
		
		ArrayDeque <Integer> ad = new ArrayDeque<Integer>();
		
//		ad.addFirst(42);//Add the element from the front side
//		ad.addLast(4);//Add the element from the rear side
//		ad.addFirst(13);//Add the element from the front side
//		ad.addLast(7);//Add the element from the rear side
//		ad.addFirst(54);//Add the element from the front side
//		System.out.println(ad);
//		System.out.println(ad.pop());
		
		ad.push(42); // Using the methods of stack in Deuque for adding the elements
		ad.push(421);//// Using the methods of stack in Deuque for adding the elements
		ad.push(8);// Using the methods of stack in Deuque for adding the elements
		ad.push(1);// Using the methods of stack in Deuque for adding the elements
		System.out.println(ad.pop());
	}
}
