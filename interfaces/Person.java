package interfaces;

public class Person implements Student, Youtuber{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj = new Person();
		//Youtuber m1 = new Youtuber(); //(Interface) Since a Youtube si not a class that's why we cannot create 
									// any object 
		
		Youtuber obj2 = obj;
		obj2.editVideo();
		obj2.makeVideo();
//		obj.study();
//		obj.makeVideo();

	}

	@Override
	public void study(){
		System.out.println("The person is studying");
		
	}

	@Override
	public void makeVideo() {
		System.out.println("The person is making good videos");
		
	}
	@Override
	public void editVideo() {
		System.out.println("The Person is Editing the video");
	}
	
	public void uploadVideo() {
		System.out.println("The Person is uploading the video");
	}

}
