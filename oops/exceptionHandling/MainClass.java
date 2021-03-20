package oops.exceptionHandling;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		try {
////			int a = 4;
////			int b = 0;
////			int c = a/b;
//			int a [] = new int[5];
////			System.out.println(c);
//			System.out.println(a[6]);
//		} catch(ArithmeticException e) {
//			System.out.println(e.getMessage()+"Occured,please check your code");
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("index should be in the range of 0 to the size of the array");
//		} catch(IllegalArgumentException e) {
//			System.out.println("Check your casting carefully");
//		} finally {
//			System.out.println("Sorry for the incovenience");
//		}
//		System.out.println("Very important code");
//		System.out.println("need to run");
		
	fun1();
	} 
	static void fun1() {
		
		int a = 4;
		int b = 3;
		int c = a/b;
		System.out.println(c);
		boolean isDanger = true;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("Danger was coming");
		}
		
		
	}

}
