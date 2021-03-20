package userInput;
import java.util.Scanner;
public class ScannerUserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
//		int x = sc.nextInt();
//		double y = sc.nextDouble();
//		float z = sc.nextFloat();
//		
    	String hello = sc.nextLine();
		
		
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
//		System.out.println(hello);
		
//		int principal = 30000;
//		float rate = 2.32f;
//		int time = 3;
//		float simpleIntrest = principal * time * rate / 100;
//		System.out.println("the simple intrest is " +simpleIntrest);
		
//		Now using the scanner function to calculate the simple intrest
		
		int principal = sc.nextInt();
		float rate = sc.nextFloat();
		int time = sc.nextInt();
		float totalIntrest = principal * rate * time / 100;
		System.out.println("the simple intrest is " +totalIntrest);
		
		
		
	}

}
