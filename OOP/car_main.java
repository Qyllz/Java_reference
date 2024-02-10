
public class car_main {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		System.out.println(myCar.make);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.yr);
		
		myCar.drive();
		myCar.brake();

	}

}
