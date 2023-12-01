import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;
/**
 * 
 * @author Ryan Bankert
 * Class: MIST352-Fall23
 * HW#3
 * 
 */ 
public class Employee {
    private String name;
    private String dateOfBirth;
    private String role;
    private int employeeId;
    private String email;
    private double salary;
    private boolean aboveAvg ;
    private String bar;
    private String fileLocation = "src/EmployeeData.txt";

    // Constructor 
    /**
     * You need to code this
     * This constructor accepts one line from a text file
     * It should split it up and initialize all attributes in this class using the values from the line
     * For example, name should equal to the first portion of the splited line and dateOfBirth is second and so on.
     * Lastly, set aboveAvg to false 
     * @param line
     */
    public Employee(String line) throws FileNotFoundException   		
	 {
    	int lineNumInt = Integer.parseInt(line);
    	Scanner scanner = new Scanner(new File(fileLocation));
        int LineNum = 1;
    	 while (scanner.hasNext()) {
        	String row = scanner.nextLine();
        	// Splits lines at the commas in the employee data file
        	if(LineNum == lineNumInt) {
             String[] parts = row.split(",");
             name = parts[0];
             dateOfBirth = parts[1];
             role = parts[2];
             employeeId = Integer.parseInt(parts[3]);
             email = parts[4];
             salary = Double.parseDouble(parts[5]);
        	}
        	LineNum++;
        	}
    }

    /**
     * You need to code this
     * This method accepts the average salary from the main and decide whether this employee's salary is above average or not
     * If it is, then set aboveAvg to true
     * @param intAverage
     */
   public void setAboveAvg(double dblAverage)
   {
	   // Determines whether or not the salary is above average or not
	   if (salary > dblAverage)
			aboveAvg = true;
	  
   }
	
   /**
	 * You need to code this.
	 * This method accepts an employee's salary and returns a bar chart of stars representation of the salary
	 * For example, 
	 * 				if the salary is 60,000, then the bar should return 6 stars:  ******
	 * 				if the salary is 95,600, then the bar should return 9 stars:  *********
	 * @param salary: the employee salary
	 * @return bar: representation in start of the salary. Each * represents $10,000
	 */
   public String SalaryBarChart(double salary) {
       int barChart = (int) (salary / 10000);
       // Returns the bar chart as * on every $10,000 that they make
       return "*".repeat(barChart);
	    	}
   /**
    * You need to code this.
    * This method provides a summary of each employee.
    * It returns a string formatted to include: employee name, employee ID, the bar chart of the salary, and whether salary is above average or not.
    * @return : Formatted string of employees basic information.
    */
   public void SummerizeEmployee() 
	 {
	   bar = SalaryBarChart(salary);
	   // Outputs the summary in the console
		String summary = name + "  " + employeeId + "  " + bar + "  "+ aboveAvg;
		System.out.println(summary);
	 }
	 

}