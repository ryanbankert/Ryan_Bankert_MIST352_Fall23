/**
 * 
 */

import java.util.Scanner;

/**
 * 
 * @author Ryan Bankert
 * Class: MIST352-Fall23
 * HW#1B
 */
public class HW1B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		double num2;
		
		// opens the scanner
		Scanner keyboard = new Scanner(System.in);
		
		// user enters the value for number 1
		System.out.println("Enter value for num1 " );
		// stores user's input for number 1
		num1 = keyboard.nextInt();
		
		//user enters the value for number 2
		System.out.println("Enter value for num2: " );
		// stores user's input for number 2
		num2 = keyboard.nextDouble();
		
		//calculates sum of both numbers
		double sum = num1 * num2;
		// displays the sum to the user
		System.out.println("The sum of the values are: " + sum);
		// closes the scanner
		keyboard.close();
	}

}	
