import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 * 
 * @author Ryan Bankert
 * Class: MIST352-Fall23
 * HW#3
 * ChatGPT
 */
public class DataSummary {
	private String fileLocation;
	private double averageSalary;
	
	/**
	 * Keep as is
	 * Constructor. 
	 * @param file
	 * @throws FileNotFoundException 
	 */
	public DataSummary(String file) throws FileNotFoundException
	{
		this.fileLocation = file;
		this.averageSalary = getAverage();
		
	}
	
	/**
	 * You need to code this
	 * This method opens the employee data file and returns the average salary of all employees in the data
	 * @param strFile: Location of the text file from the main
	 * @return dblSum: the Average of all salaries
	 * @throws FileNotFoundException: if file is not found, this is thrown
	 */
	public double getAverage() throws FileNotFoundException
	{
		 File file = new File(fileLocation);
		 Scanner scanner = new Scanner(file);
		
	    double sum = 0.0;
	    int count = 0;
	    //Splits employee data and adds it all up to get the average salary.
	    while (scanner.hasNextLine()) {
	        String line = scanner.nextLine();
	        String[] parts = line.split(",");
	        double salary = Double.parseDouble(parts[parts.length - 1]);
	        sum += salary;
	        count++;
	    }

	    scanner.close();
	  return  averageSalary = sum/count;
	}
	
	/**
	 * You need to code this
	 * This method should printout all employees and their IDs to the console.
	 * @throws FileNotFoundException: Thrown if file is not found.
	 */
    public void ViewEmployeeAndIDs() throws FileNotFoundException {
        File myFile = new File(fileLocation);
        Scanner inputFile = new Scanner(myFile);

        // Splits employee name and ID in order to be read by the GUI
        while (inputFile.hasNextLine()) {
            String strData2Show = inputFile.nextLine();
            String[] dataParts = strData2Show.split(",");
       // Searches the DataSummary for employee name and employee data while also splitting the data into different lines.
            String employeeName = dataParts[0];
            String employeeID = dataParts[2];

            System.out.println("Employee ID: " + employeeID + ", Employee Name: " + employeeName);
        }

        inputFile.close();
    }
	/**
	 * You need to code this
	 * This method accepts an employee name (first, last, or both) and searches for all employee with that name
	 * It should printout all employee's info to a GUI, otherwise, it should printout Not Found
	 * @param strEmployee: Employee name 
	 * @throws FileNotFoundException: Thrown if file is not found.
	 */
	public void SearchEmployee() throws FileNotFoundException{
		String name = JOptionPane.showInputDialog("Enter the name to search for:");
        String filePath = fileLocation;
        StringBuilder sb = new StringBuilder();
        boolean found = false;
        // Searches by name in the EmployeeData 
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields[0].toLowerCase().contains(name.toLowerCase())) {
                    sb.append(line).append("\n");
                    found = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!found) {
            sb.append("Not found");
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }
	/**
	 * You need to code this
	 * This method accepts an employee role (i.e., position) and views for all employee in that role
	 * It should printout all employee's info to a GUI, otherwise, it should printout Not Found
	 * @param strRole: Employee role 
	 * @throws IOException 
	 */
	public void ViewEmployeeForRole() throws IOException{
	// Creates GUI in order to have the user input the role they're searching for.
	String role = JOptionPane.showInputDialog("Enter the role to search for:");
    String filePath = fileLocation;
    StringBuilder sb = new StringBuilder();
    boolean found = false;
    	// Reads the text file
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] fields = line.split(",");
            if (fields[2].toLowerCase().contains(role.toLowerCase())) {
                sb.append(line).append("\n");
                found = true;
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    if (!found) {
        sb.append("Not found");
    }

    JOptionPane.showMessageDialog(null, sb.toString());
}
	/**
	 * Keep as is.
	 * This method displays the distinct roles in the text file
	 * @throws FileNotFoundException 
	 */
	public void ViewRoles() throws FileNotFoundException
	{	
		       
		        File myFile = new File(fileLocation);
		        Scanner inputFile = new Scanner(myFile);
		        Set<String> distinctRoles = new HashSet<>();

		        while(inputFile.hasNextLine()) {
		            String strData2Show = inputFile.nextLine();
		            // Splitting the line by comma
		            String[] dataParts = strData2Show.split(",");
		            // The role is the third element in the array (index 2)
		            distinctRoles.add(dataParts[2]);
		        }
		        inputFile.close();
		        String strRole="";
		        // Displaying distinct roles
		        for (String role : distinctRoles) {
		        	strRole = strRole + role + "\n";
		            //System.out.println(role);
		        }
		        JOptionPane.showMessageDialog(null, strRole);
		    }
	
}