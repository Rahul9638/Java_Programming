package whileLoop;
import java.util.Scanner;
public class PalindromeNumber {
// Write a programme to find the palindrome number.. Palindrome numbers are numbers which
	// after reversing forms the same number.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int reversedNumber = 0;
		while (temp > 0) {
			int lastDigit = temp%10;
			reversedNumber = reversedNumber * 10 + lastDigit;
			temp /= 10; 
		}
		if (reversedNumber == n) {
			System.out.println(n + " is the palindrome");
		}else {
			System.out.println("The number is not palindorme");
		}
		
		

	}

}
