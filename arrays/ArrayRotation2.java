package arrays;
import java.util.Scanner;
public class ArrayRotation2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of element of the array");
		int element = sc.nextInt();
		System.out.println("How much times you want to rotate your array");
		int d = sc.nextInt();
		int a [] = new int [element];
		int n = a.length;
		System.out.println("Enter the element in the array");
		for (int i = 0; i<a.length; i++) {
			a[i] = sc.nextInt();
			
		}
		// Displaying the array;
//		for (int i = 0 ; i<a.length; i++) {
//			System.out.print(a[i]+" ");
//		}
		// Rotating the array towards left
		for (int i = 0; i<d; i++) {
			int  j,first;
			// Storing the first element of the array
			first = a[0];
			for ( j=0; j<n-1; j++) {
				// Shifting the element of the array by one
				a[j] = a[j+1];
			}
			// first element of the array will be added to the last
			a[j] = first;
			
		}
		System.out.println("The array after rotation");
		for (int i = 0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		

	}

}
