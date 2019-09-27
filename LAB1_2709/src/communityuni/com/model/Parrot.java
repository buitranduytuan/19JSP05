package communityuni.com.model;

public class Parrot extends Animal {

	public void print() {
		System.out.println("Tôi là con Vẹt");
		super.print();
	}
	
	public Parrot(String name, int age) {
		super(name, age);
	}

}
