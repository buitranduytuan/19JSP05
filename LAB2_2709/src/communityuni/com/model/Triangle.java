package communityuni.com.model;

public class Triangle extends Shape {
	public double heigth;
	public double base;
	
	public Triangle(String color, double heigth, double base) {
		super(color);
		this.heigth = heigth;
		this.base = base;
	}
	
	public double getArea() {
		return (this.heigth*this.base)/2;
	}

	public void processShape() {
		System.out.println("Tam Giác có màu là: "+this.color);
		System.out.println("Diện tích của tam giác là: "+getArea());
	}
}
