package arrays;

import java.util.Scanner;

public class HackerRankArrayLeftRotation {
	
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int k=0; k<d; k++){
            
            int temp,j;
            temp = arr[0];
            
            for(j=0; j<arr.length-1; j++){
                arr[j] = arr[j+1];
                }
            arr[j] = temp;
        }
        
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

	}


