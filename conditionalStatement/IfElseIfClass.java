package conditionalStatement;

public class IfElseIfClass {

	public static void main(String[] args) {
		 int number = 23;
		 if (number<=10) {
			 System.out.println("The number is less than 10");
		 } else if(number>=10 && number<=20) {
			 System.out.println(" The number is lies between 10 and 20");
		 } else if (number>=20 && number<=30) {
			 System.out.println(" The number is lies between 20 and  30");
		 } else {
			 System.out.println("The number is greater than 30");
		 }

	}

}
