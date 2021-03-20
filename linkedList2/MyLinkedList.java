package linkedList2;

public class MyLinkedList<E> {
	
	Node<E> head;
	
	public void add(E data) {
		 Node<E> toAdd= new Node<E>(data);
		 if(head == null) {
			 head = toAdd;
			 return;
		 }
		 Node<E> temp = head;
		 while(temp.next != null) {
			 temp = temp.next;
		 }
		 temp.next = toAdd;
		  
		 
	}
	
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public E removeLast() throws Exception{
		Node <E> temp = head;
		if(temp==null) {
			throw new Exception("Cannot remove last element from empty linked list");
		}
		if(temp.next == null) {
			Node<E> toRemove = head;
			head = null;
			return  toRemove.data;
		}
		while(temp.next.next !=null) {
			temp = temp.next;
		}
		Node<E> toRemove = temp.next;
		temp.next = null;
		return  toRemove.data;
	}
	
	public E getLast() throws Exception{
		Node <E> temp = head;
		if(temp==null) {
			throw new Exception("Cannot peek last element from empty linked list");
		}
		
		while(temp.next !=null) {
			temp = temp.next;
		}
		
		return  temp.data;	
	}
	
	void print() {
		Node<E> temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		
		
	}
	
	
	
	public static class Node<E>{
		public E data;
		public Node next;
		
		public Node(E data) {
			this.data = data;
			next = null;
		}
	}

}
