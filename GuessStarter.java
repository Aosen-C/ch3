import java.util.Random;
import java.util.Scanner;

public class GuessStarter {
	
	public static void main(String[] args) {
		// pick a random number
		Random random = new Random();
		int number = random.nextInt(100) + 1;
		
		// Creates a scanner
		Scanner in = new Scanner(System.in);
		
		System.out.println("I'm thinking of a number between 1 and 100 (including both).");
		System.out.println("Can you guess what it is?");
		System.out.print("Type a number: ");
		
		int guess = in.nextInt(); // User inputs their guess
		int deviation = number - guess; // Calculates how far off the user's guess was
		
		System.out.printf("Your guess is: %d\n", guess);
		System.out.printf("The number I was thinking of is: %d\n", number);
		System.out.printf("You were off by: %d", deviation);
		
		}
	}
