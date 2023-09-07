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
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter value for num1 " );
		num1 = keyboard.nextInt();
		
		System.out.println("Enter value for num2: " );
		num2 = keyboard.nextDouble();
		
		double sum = num1 * num2;
		
		System.out.println("The sum of the values are: " + sum);
		
		keyboard.close();
	}

}	
