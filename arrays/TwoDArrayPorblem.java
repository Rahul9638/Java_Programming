package arrays;
import java.util.Scanner;
public class TwoDArrayPorblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the dimension of the array");
		//int rows = sc.nextInt();
		//int cols = sc.nextInt();
		int mat [] [] = new int [6] [6];
		//int b [] [] = new int [rows] [cols];
		System.out.println("Enter array a:");
		for (int i = 0; i<6; i++) {
			for ( int j = 0 ; j<6; j++) {
				mat[i] [j] = sc.nextInt();
			}
			sc.nextLine();
		}
		  int sum;
		  int max_val = Integer.MIN_VALUE;
		  for (int i = 0; i<=3; i++) {
			  for (int j=0; j<=3; j++) {
				  sum = (mat[i][j] + mat[i][j + 1] +  
	                       mat[i][j + 2]) + (mat[i + 1][j + 1]) +  
	                       (mat[i + 2][j] + mat[i + 2][j + 1] +  
	                       mat[i + 2][j + 2]); 
				  if(sum>max_val){
	                    max_val=sum;
	                }
			  }
		  }
		  System.out.println(max_val);
}
}