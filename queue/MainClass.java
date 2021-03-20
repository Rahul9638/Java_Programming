package queue;
import java.util.*;


public class MainClass {
	
	public static void main(String [] args) {
		
	//	Queue <Integer> q = new LinkedList<>();
//		q.add(23);
//		q.add(1532);
//		q.add(162);
//		q.add(132);
		//q.remove(); When the queue is empty and you will remove the elements it will throw the exception;
	//	System.out.println(q.poll()); // When the queue is empty and after removing the element it will throw the null as result
//		System.out.println(q); // print all the element of the queue
//		System.out.println(q.remove());// Remove element in by following the form of FIFO.
//		System.out.println(q.remove());
//		System.out.println(q.element());// Returns the element which is to be remove next
		
		MyQueue <Integer> mmqq = new MyQueue();
		mmqq.enqueue(42);
		mmqq.enqueue(2);
		mmqq.enqueue(12);
		mmqq.enqueue(62);
		mmqq.enqueue(92);
		
		System.out.println(mmqq.dequeue());
		System.out.println(mmqq.dequeue());
		System.out.println(mmqq.dequeue());
		System.out.println(mmqq.dequeue());
		System.out.println(mmqq.dequeue());
		System.out.println(mmqq.dequeue());
		mmqq.enqueue(2);
		System.out.println(mmqq.dequeue());
		
		
		
	}

}
