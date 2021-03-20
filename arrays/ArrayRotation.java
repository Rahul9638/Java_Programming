package arrays;
import java.util.Scanner;
public class ArrayRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no element you want to add");
		int b = sc.nextInt();
		
		int a [] = new int [b];
		int n = a.length;
		System.out.println("enter the elements of the array");
		for ( int i =0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i=a.length-1; i>=0; i--) {
			
			System.out.print(a[i]+" ");
		}
		
		
		
	}

}
