package vectorAndStack;

 


public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//		Vector<Integer> v = new Vector();
//		v.add(32);
//		v.add(322);
		
		MyStack<Integer> stack = new MyStack();
//
//		stack.push(3322);
//		stack.push(3);
//		stack.push(32);
//		stack.push(31);
		
		int popped = stack.pop();
		System.out.println(popped);
		int peeked = stack.peek();
		System.out.println(peeked);
		
		
		

	}

}
