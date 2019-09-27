package communityuni.com.model;

public class Main_Shape {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle("Red", 5, 6);
		rec.processShape();
		Triangle tri = new Triangle("Blue", 6, 7);
		tri.processShape();
	}
}
