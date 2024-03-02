package objectOrientedPrograming;

public class Rectangle extends Shapes{
	private int length, width;
	
	public Rectangle(int length, int width) {
		super(2);
		this.length = length;
		this.width = width;
	}
	public double getPerimeter() {
		return (length + width) * 2;
	}
	public double getArea() {
		return length * width;
	}
	public void getDetail() {
		System.out.println("Type: Rectangle");
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		System.out.println("Perimeter: " + getPerimeter());
		System.out.println("Area: " + getArea());
	}
}
