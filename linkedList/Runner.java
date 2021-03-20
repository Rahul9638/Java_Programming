package linkedList;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyLinkedList list = new MyLinkedList();
		list.insert(32);
		list.insert(322);
		list.insert(321);
		list.insertAtStart(23);
		list.insertAt(0, 443);
		list.delete(2);
		list.show();
		
		
		

	}

}
