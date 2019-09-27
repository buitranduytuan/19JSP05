package communityuni.com.model;

public class Animal {
	public String name;
	public int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.println("Name: "+this.name+"\t"+"Age: "+this.age);
	}
	
	
}
