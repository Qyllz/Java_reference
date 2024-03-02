package objectOrientedPrograming;

public class Triangle extends Shapes{
	private int side1, side2, side3;
	
	public Triangle(int side1, int side2, int side3) {
		super(3);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	public double getArea() {
		double s = getPerimeter() / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	public void getDetail() {
		System.out.println("Type: Triangle");
		System.out.println("Side 1: " + side1);
		System.out.println("Side 2: " + side2);
		System.out.println("Side 3: " + side3);
		System.out.println("Perimeter: " + getPerimeter());
		System.out.println("Area: " + getArea());
	}

}
