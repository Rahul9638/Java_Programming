package conditionalStatement;

public class TernaryOperator {

	public static void main(String[] args) {
		// Shorthand if Else (Ternary Operator)
		// Variable condition = condition ? ExpressionTrue : ExpressionFalse;
		int a = 10;
		int b = 4;
		int maxOfBothNumbers = 0;
//		if (a>b) {
//			maxOfBothNumbers = a;
//			
//		}else {
//			maxOfBothNumbers = b;
//		}
		maxOfBothNumbers =  a > b ? a : b;
		System.out.println("The greater number among these two is "+maxOfBothNumbers);
	}

}
