package loops;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// To find x raise to power y;
		// two numbers are entered through the keyboard . Write a programme to find the
		//value  of the given number to raise to another number.
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 1;
		for (int i=0; i<b; i++) {
			result *= a;
			
		}
		System.out.println(result);

	}

}
