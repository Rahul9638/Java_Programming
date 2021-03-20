package nestedForLoops;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of star you want to print via star pattern");
		int n = sc.nextInt();
		for (int j = 1; j<=n; j++) {
			for (int i=1; i<=n; i++) {
				System.out.print("* ");
		}System.out.println();
			
		}

	}

}
