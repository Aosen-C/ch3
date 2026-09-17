import java.util.Scanner;

public class ConvertTime {
	public static void main(String[] args) {
		
		// Creates the scanner
		Scanner in = new Scanner(System.in);
		
		// Asks user for the number of seconds
		System.out.print("Enter the number of seconds: ");
		int Seconds = in.nextInt();
		
		// Creates final constants
		final int SECONDS_AND_HOURS = 3600;
		final int SECONDS_AND_MINUTES = 60;
		
		// Calculates the hours and minutes and seconds
		int Hour = Seconds / SECONDS_AND_HOURS;
		int Minutes = (Seconds % SECONDS_AND_HOURS) / SECONDS_AND_MINUTES;
		int Rem_Seconds = (Seconds % SECONDS_AND_HOURS) % SECONDS_AND_MINUTES;
		
		// Prints the results
		System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds", Seconds, Hour, Minutes, Rem_Seconds);
		
		}
	}
