package conditionalStatement;

import java.util.Scanner;

public class BasicComputationLabLinearEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		// Write a programme to calculate the linear equation provided the variable and intercept;
		System.out.println("what did you want to calculate, Enter 1 for Y and 2 for X");
		int choice = sc.nextInt();
		if( choice== 1) {
			System.out.println("Enter the value of m");
			int m = sc.nextInt();
			System.out.println("Enter the value of x");
			int x = sc.nextInt();
			System.out.println("Enter the value of c");
			int c = sc.nextInt();
			int y = m*x+c;
			System.out.println("The value of y is "+y);
			
		}else if(choice==2) {
			System.out.println("Enter the value of m");
			int m = sc.nextInt();
			System.out.println("Enter the value of c");
			int c = sc.nextInt();
			System.out.println("Enter the value of y");
			int y = sc.nextInt();
			int x = (y-c)/m;
			System.out.println("The value of x is "+x);
		}else {
			System.out.println("Wrong input");
		}
	}

}
