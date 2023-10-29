/**
 * 
 */
import java.util.Scanner;
/**
 * @author Ryan Bankert
 * Class: MIST352-Fall23
 * Exam#1B
 * 
 * This code finds the amount of letters in an inputed message.
 *
 *
 */
public class Exam1B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message;
		
		int Stringsize;
		
		Scanner keyboard = new Scanner(System.in);
		
		// Welcomes users
		System.out.println("Welcome, please provide a message.");
		// Saves the input from the user
		message = keyboard.nextLine();
		
		// Finds the length of the message
		Stringsize = message.length();
		
		// Displays the length of the message
		System.out.println("The length of your sentence (with spaces) is: " + Stringsize);
		
		// Ask user for letter input
		System.out.println("Enter a Letter that was in the message.");
		char LetAT = keyboard.next().charAt(0);
		
		//Finds the letter in the message.
		int LetPos = message.indexOf(LetAT) +1;
		
		// Outputs results
		//System.out.println(LetPos);
		if(LetPos >0) {
		   System.out.println("The first occurance of "+ LetAT + " is at the position of: " + LetPos + ".");
		} else {
			System.out.println("The character you entered is not in the message");
		}
		//Closes the Scanner
		keyboard.close();
	}

}
