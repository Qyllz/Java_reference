import java.util.Scanner;
import java.util.Random;
public class shiz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int upperbound = 100;
		int randomNumber = random.nextInt(upperbound) + 1; 
		
		System.out.println("Welcome to the Guess The Number Game!");
		
		
		int guess = scanner.nextInt();
		int attempts = 0;
		
		do {
			System.out.println("Enter a guess number: ");
			guess = scanner.nextInt();
			attempts++;
			
			if (guess < randomNumber) {
				System.out.println("Too low! Try again!");
			} else if (guess > randomNumber){
				System.out.println("Too high! Try again!");
			}else {
				System.out.println("Congrats! You gueesed the number");
				
			}
		} while (guess != randomNumber);
		
		
		

	}

}
