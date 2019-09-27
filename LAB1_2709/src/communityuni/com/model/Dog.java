package communityuni.com.model;

public class Dog extends Animal {

	public void print() {
		System.out.println("Tôi là con Chó");
		super.print();
	}
	
	public Dog(String name, int age) {
		super(name, age);
	}

}
