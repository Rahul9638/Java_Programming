package oops.Encapsulation;

public class Student {
	private int age;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age; 
	}
	public void setAge(int age) {
		if(age>20) {
			System.out.print("Your age exceeds the student's age limit");
		}else {
			this.age = age;
		}
	}
}
