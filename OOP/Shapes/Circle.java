package objectOrientedPrograming;

public class Circle extends Shapes {
	private final float PI = 3.14f;
	private int radius;
	
	public Circle(int radius) {
		super(1);
		this.radius = radius;
	}
	public double getPerimeter() {
		return 2 * PI * radius;
	}
	public double getArea() {
		return PI * radius * radius;
	}
	public void getDetail() {
		System.out.println("Type: Circle");
		System.out.println("Radius: " + radius);
		System.out.println("Perimeter: " + getPerimeter());
		System.out.println("Area: " + getArea());
	}
}
