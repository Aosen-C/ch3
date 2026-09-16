import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		
		// Creates the scanner
		Scanner in = new Scanner(System.in);
		
		//Asks user to provid a temperature in celsius
		System.out.print("Enter a temperature in Celsius: ");
		double Celsius = in.nextDouble();
		
		// Converts to Farenheit
		final double SLOPE = 9.0/5.0;
		final double X_INTERCEPT = 32;
		double Farenheit = SLOPE * Celsius + X_INTERCEPT;
		
		// Prints conversion
		System.out.printf("%.1f C = %.1f F\n", Celsius, Farenheit);
		
		}
	}
