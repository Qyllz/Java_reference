package objectOrientedPrograming;

import java.util.Scanner;

public class TestShape {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // this part if you want it to run on ide
        System.out.print("Enter the number of inputs:");
        int numberOfInputs = in.nextInt();
        int[] inputs = new int[numberOfInputs];
        // Input values
        System.out.print("Enter the values:");
        for (int i = 0; i < numberOfInputs; i++) {
            inputs[i] = in.nextInt();
        }
        // switch case statements
        switch (numberOfInputs) {
            case 1:
                Circle circle = new Circle(inputs[0]);
                circle.getDetail();
                break;
            case 2:
                if (inputs[0] == inputs[1]) {
                    Square square = new Square(inputs[0]);
                    square.getDetail();
                } else {
                    Rectangle rectangle = new Rectangle(inputs[0], inputs[1]);
                    rectangle.getDetail();
                }
                break;
            case 3:
                Triangle triangle = new Triangle(inputs[0], inputs[1], inputs[2]);
                triangle.getDetail();
                break;
            default:
                System.out.println("No number of inputs nigga.");
        }
    }
}

