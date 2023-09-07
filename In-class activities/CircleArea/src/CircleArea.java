/**
 * 
 */

/**
 * This program calculates the area of a circle given it's radius
 */
import java.util.Scanner;
public class CircleArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello, this program calculates the area of a circle.");
		
		System.out.println("Please provide the radius.");
		
		Scanner keyboard = new Scanner(System.in);
		
		double dblRadius = keyboard.nextDouble();
		
		
		double area = 3.14 * dblRadius * dblRadius;
		
		System.out.println("The area of the circle with the radius of " + dblRadius + " equals: " + area);
		
		keyboard.close();
	}

}
