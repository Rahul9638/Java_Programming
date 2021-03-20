package loops;
import java.util.Scanner;
public class NestedForLoopExercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
		int table = 0;
		for ( int j = 1; j<=20;j++) {
			for (int i = 1; i<=10; i++) {
				table = i*j;
				System.out.print(table+" ");
				
				
			}
			System.out.println();
		}
		
				

	}

}
