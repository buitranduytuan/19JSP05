package communityuni.com.model;

public class Rectangle extends Shape {
	public double length;
	public double wigth;


	public Rectangle(String color, double length, double wigth) {
		super(color);
		this.length = length;
		this.wigth = wigth;
	}

	public double getAre() {
		return this.length*this.wigth;
	}

	public void processShape() {
		System.out.println("Hình chữ nhật có màu là: "+this.color);
		System.out.println("Diện tích của hình chữ nhật là: "+getAre());
	}
}
