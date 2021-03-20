package loops;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		// Write a programme that promotes user to input a positive integer. It should then 
		// indicate that the given number is prime or not
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime = true;
		for (int i = 2; i<n; i++)
//		for (int i = 2; i*i<=n; i++) 
		{
			if(n % i == 0){
				
				isPrime = false;
				break;
				}
		}
		if (n<2) {
			isPrime = false;
		}
		System.out.println("isPrime "+ isPrime);

	} 

}
