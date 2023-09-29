import java.util.Scanner;


	public class Exam1B_ChatGPT {

	    public static void main(String[] args) {
	        // Create a Scanner object for taking input
	        Scanner scanner = new Scanner(System.in);

	        // Display welcome message
	        System.out.println("Welcome!");

	        // Ask user for the input string
	        System.out.print("Enter the string to search within: ");
	        String userInput = scanner.nextLine();

	        
	        // Says character instead of letter, terminology was different
	          // Ask user for a character to find in the input
	        System.out.print("Enter a character to find its first occurrence: ");
	       
	        char charToFind = scanner.nextLine().charAt(0);

	       // Their code starts at 0 and counts up the characters, which gives incorrect results
	        // Find the location of the first occurrence of the character
	        int location = userInput.indexOf(charToFind);

	        // Print out the location of the first occurrence of that character
	        System.out.println("The character '" + charToFind + "' first occurs at position " + location + ".");

	        // Close the scanner
	        scanner.close();
	    }
	}