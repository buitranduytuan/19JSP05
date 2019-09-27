package communityuni.com.model;

public class Elephant extends Animal {

	public void print() {
		System.out.println("Tôi là con Voi");
		super.print();
	}
	
	public Elephant(String name, int age) {
		super(name, age);
	}

}
