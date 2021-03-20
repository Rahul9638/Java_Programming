package loops;

import java.util.Scanner;

public class Fibonacci_numbers {

	public static void main(String[] args) {
		// Write a programme to print theh fibanocci series of number given by the user
		System.out.println("Enter the no for which factorial is calculated");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for (int i = 0; i<n-2; i++) {
			int c = a+b;
			System.out.print(c+" ");
			a = b;
			b = c;
					
			
		}
	}

}
