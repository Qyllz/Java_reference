package objectOrientedPrograming;

public class Square extends Shapes{
	private int side;
	
	public Square(int side) {
		super(2);
		this.side = side;
	}
	public double getPerimeter() {
		return side * 4;
	}
	public double getArea() {
		return side * side;
	}
	public void getDetail() {
		System.out.println("Type: Square");
		System.out.println("Side: " + side);
		System.out.println("Perimeter: " + getPerimeter());
		System.out.println("Area: " + getArea());
	}
}
