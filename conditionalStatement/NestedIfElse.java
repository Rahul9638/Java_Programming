package conditionalStatement;

public class NestedIfElse {

	public static void main(String[] args) {
		int a = 12;
		int b = 18;
		int c = 190;
		int result = 0;
//		if (a>b) {
//			if (a>c) {
//				result = a;
//			}else {
//				result = c;
//			}
//			
//		}else {
//			if (b>c) {
//				result = b;
//				
//			}else {
//				result = c;
//				
//			}
//		}
//		Now creating nested if else using ternary operator
		
		result = a>b? a>c ? a: c : b>c? b: c; 
		System.out.println("The largest number of the three numbers is "+result);

	} 

}
