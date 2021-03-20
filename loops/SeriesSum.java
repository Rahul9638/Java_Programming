package loops;

import java.util.Scanner;

public class SeriesSum {
	public static void main(String[] args) {
		// Write a programme to calculate the sum of the following series where input n
		// is input by the user
		
		// 1+ 1/2+ 1/3+ 1/4 + 1/5 + ..........1/n
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number upto which you want to print the result");
		int n = sc.nextInt();
		float result = 0;
		for(float i=1; i<=n; i++) {
			result += 1/i;
		}
		System.out.println("The sum is equal to "+result);
	} 

}
