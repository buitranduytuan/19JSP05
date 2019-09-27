package communityuni.com.model;

public class Tiger extends Animal {
	
	public void print() {
		System.out.println("Tôi là con Hổ");
		super.print();
	}
	
	public Tiger(String name, int age) {
		super(name, age);
	}
}
