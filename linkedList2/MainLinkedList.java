package linkedList2;

import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		List <Integer> ll = new LinkedList<>();
//		List <Integer> all = new ArrayList<>();
//		
//		ll.add(32);
//		ll.add(53);
//		ll.add(42);
//		ll.add(422);
//		ll.toArray();
//		System.out.println(ll);
//		System.out.println(ll.get(0));
		
		MyLinkedList<String> myll = new MyLinkedList();
//		myll.add(42);
//		myll.add(32);
//		myll.add(31);
//		myll.add(3);
		for(int i=0; i<10;i++) {
			myll.add(i+" Added");
		}
		myll.print();
		
	}

}
