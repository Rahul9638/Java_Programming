package oops.abstraction;

public class WagonR extends Car {
	
	public void breaking() {
		System.out.println("the wagonr is breaking ");
	}

	@Override
	public void accelerate() {
		System.out.println("Wagnor is accelerating");
	}
}
