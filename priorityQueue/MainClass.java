package priorityQueue;

import java.util.PriorityQueue;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
//		pq.add("kiwi");
//		pq.add("Apple"); // The elements are inserted in the priority queue in random fashion but when they are removed follow
					// which is defined earlier. It may be either be arranged in ascending order or descending order.
//		pq.add("Lichhi");
//		pq.add("Banana");
//		pq.add("Cat");
//		pq.add("Mango");
//		System.out.println(pq);
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
		
		PriorityQueue<Integer> poq = new PriorityQueue<Integer>();
		poq.add(9);
		poq.add(3);
		poq.add(8);
		poq.add(2);
		System.out.println(poq);
		System.out.println(poq.remove());
		System.out.println(poq.remove());  // In case removing the elements it follows the rule of ascending or descending or 
										// the rule that is described. 
		System.out.println(poq.remove());
		System.out.println(poq.remove());
		

	}

}
