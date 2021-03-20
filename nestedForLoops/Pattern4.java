package nestedForLoops;
import java.util.Scanner;
public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: "); // takes input from user
		int n = sc.nextInt();
		for (int i=0 ; i<=n; i++) {
			for (int j = 1; j<= n-i; j++) {
				System.out.print("  ");
			}
			for ( int k = 0; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		
		
	}
}


