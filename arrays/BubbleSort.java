package arrays;

public class BubbleSort {
	public static void main(String [] args) {
		
		int a [] = { 10,3,-1,-5,2,5,7};
		int n = a.length;
		for ( int i = 0; i<n-1; i++) {
			
			 boolean sorted = true;
			for ( int j = 0; j<n-1-i; j++) { // for the last digits we got number sorted
											// to reduce complexity we stop our loop at 
											// j<n-i-1 times
				if ( a[j+1]<a[j]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					
					sorted = false;
					
					
				}
			}
			if (sorted) break;
			
		}
		
		
		for (int item: a) {
			System.out.print(item+"   ");
			
		}
	}

}