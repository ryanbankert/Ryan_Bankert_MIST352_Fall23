import java.util.Scanner;

public class Exam1B_ChatGPT {

    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Display welcome message
        System.out.println("Welcome!");

        // Ask user for the text input
        System.out.print("Enter the string to work with: ");
        String userInput = scanner.nextLine();

        // Print out the length of the input
        System.out.println("Length of the input is: " + userInput.length());

        // Ask user for a character to find in the input
        System.out.print("Enter a character to find its first occurrence: ");
        char charToFind = scanner.nextLine().charAt(0);

        // Find the location of the first occurrence of the character
        int location = userInput.indexOf(charToFind);

        // Print out the location of the first occurrence of that character
        System.out.println("The character '" + charToFind + "' first occurs at position " + location + ".");

        // Close the scanner
        scanner.close();
    }
}