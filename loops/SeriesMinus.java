package loops;

import java.util.Scanner;

public class SeriesMinus {
	// Series sum 2; Compute the natural logrithm of 2 by adding upto n terms in the series
	// 1-1/2+1/3-1/4+1/5........1/n

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number upto which you want to print the result");
		int n = sc.nextInt();
		float result = 1;
		for(float i=1; i<=n; i++) {
			if (i % 2 == 0) {
			result -= i/2;
		}
			else {
				result += i/2;
			}
			
		}
		System.out.println("The sum is "+result);
	}
	
}
