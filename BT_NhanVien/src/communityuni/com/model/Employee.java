package communityuni.com.model;

public class Employee {
	public int id;
	public String name;
	public double salary;
	public String job;

	public Employee() {

	}
	
	public Employee(int id, String name, double salary, String job) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.job = job;
	}

	public void print() {
		System.out.println(this.id+"\t"+this.name+"\t"+this.salary+"\t"+this.job);
	}
}
