import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;
/**
 * 
 * @author Ryan Bankert
 * Class: MIST352-Fall23
 * HW#3
 * 
 */
public class HW3 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
	//****** Keep as is *******************
		// The location of the employee text file 
		String strDataLocation ="src/EmployeeData.txt";
		String strOutputLocation ="src/EmployeeSummary.txt";
		File myFile = new File(strDataLocation);
		Scanner inputFile = new Scanner (myFile);
		PrintWriter writer =new PrintWriter(strOutputLocation);
		int intChoice  = Integer.parseInt( JOptionPane.showInputDialog(null,  ViewOptions()));
		DataSummary myData = new DataSummary(strDataLocation);
	//*************************************
		
		while(intChoice !=0)
		{
			switch(intChoice)
			{
			case 1: 
				myData.ViewEmployeeAndIDs();
			break;
			
			case 2: 
				myData.SearchEmployee();
			break;
			
			case 3: 
				myData.ViewRoles();
			break;
			
			case 4: 
				myData.ViewEmployeeForRole();
			break;
			
			case 5:
				myData.getAverage();
				// Creates GUI to display average salary
				JOptionPane.showMessageDialog(null, "The average salary is: $" + myData.getAverage());
			break;
			
			case 6: 
				// Creates a GUI for the user to input the line number to output the summary.
				String line = JOptionPane.showInputDialog("Enter the line number: ");
				Employee employee = new Employee(line);
				employee.setAboveAvg(myData.getAverage());
				employee.SummerizeEmployee();
			break;
			}
			intChoice  = Integer.parseInt( JOptionPane.showInputDialog(null,  ViewOptions()));	
		}
	
		
		writer.close();
		inputFile.close();	
		
	}
	/**	 
	 * Keep as is
	 * A method to display options
	 * @return : The options to display in the GUI
	 */
	
	public static String ViewOptions()
	{
		String strMessageToDisplay="Choose an option:"
				+ "\n0.\tExit"
				+ "\n1.\tView Employees and IDs"
				+ "\n2.\tSearch for Employee"
				+ "\n3.\tView current roles"
				+ "\n4.\tView employees for a certain role"
				+ "\n5.\tView Average Salary"
				+ "\n6.\tSummerize and Write data";
		return strMessageToDisplay;
	} }