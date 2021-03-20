package operators;

import java.util.Scanner;

public class LogicalOperator {
	public static void main(String [] args) {
//		&& -> And Operator, || --> OR operator , ! --> Not operator 
		
//		int numbers = 11;
//		if (numbers >=1 &  numbers<=100) {
//			System.out.println("The number lies between the 100");
//		 
//		int grade = 10;
//		if (!(grade==10  || grade ==12)) {  // Here ! operator reverse the overall operator
//			System.out.println("You can't  gave board exam");
//		}
		 Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        if(a%2 !=0) {
	            System.out.println("Weird");
	        }
	        if (a%2 == 0 && a<5 && a>2){
	            System.out.println("Not Wierd");
	            
	        }if(a%2==0 && a<20 && a>6){
	            System.out.println("Weird");
	        }if(a%2==0 && a>20){
	            System.out.println("Not Weird");
	        }
	}

}
