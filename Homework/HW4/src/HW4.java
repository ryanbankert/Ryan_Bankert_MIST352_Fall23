import java.io.*;
import java.util.*;


/**
 * @author Ryan Bankert
 * Class: MIST352-Fall23
 * HW4
 */
public class HW4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//***********************************************************************************************
		// Keep lines 21 - 27 as is
        //Location of the data folder which has all csv files
		String directoryPath = "src/data"; 
		//String that has the names of all csv files, without the directory.
        String[] csvFileNames = findCSVFileNames(new File(directoryPath));
    //***********************************************************************************************
        
        
        PrintArray(csvFileNames);
        for (int i = 0; i < csvFileNames.length; i++) {
        	csvFileNames[i] = directoryPath + "/" + csvFileNames[i];
        }
        PrintArray(csvFileNames);
        for (String csvFileName : csvFileNames) {
            Csv2Arff converter = new Csv2Arff(csvFileName);
            converter.Convert2Arff(csvFileName);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name:");
        String fileName = scanner.nextLine();
        System.out.println("Enter column number:");
        int columnNumber = scanner.nextInt();
        System.out.println("Enter row number:");
        int rowNumber = scanner.nextInt();

        // Call the method to retrieve cell value
        String cellValue = Csv2Arff.RetrieveCell(fileName, rowNumber, columnNumber);
        System.out.println("Value at Row " + rowNumber + ", Column " + columnNumber + ": " + cellValue);
        scanner.close();
	}
	
	/**
	 *  You need to code this
	 *  This method simply prints out the content of any given String array
	 * @param array: The array to print
	 */
	public static void PrintArray(String[] array)
	{
		
		 System.out.println("Array Contents:");
	        for (String element : array) {
	            System.out.println(element);
	        }
	        System.out.println("--------------------------");

	}

	/**
	 * Keep as is.
	 * This method finds all csv files in a given directory
	 * @param directory: location of all csv files. This is passed from the main
	 * @return: Array of strings, each strring represents the name the location of a csv file
	 */
    private static String[] findCSVFileNames(File directory) {
        List<String> csvFileNames = new ArrayList<>();
        addCSVFileNames(directory, csvFileNames);
        return csvFileNames.toArray((new String[0]));
    }

    /**
     * Keep as is.
     * This method is magical. We Do not care what it does.
     * @param directory
     * @param csvFileNames
     */
    private static void addCSVFileNames(File directory, List<String> csvFileNames) {
        if (directory.isDirectory()) {
            // Define a filter for CSV files
            FilenameFilter csvFilter = (dir, name) -> name.toLowerCase().endsWith(".csv");

            // List all CSV files in the current directory
            File[] files = directory.listFiles(csvFilter);
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        csvFileNames.add(file.getName());
                    }
                }
            }

            // List all directories in the current directory
            File[] dirs = directory.listFiles(File::isDirectory);
            if (dirs != null) {
                for (File dir : dirs) {
                    addCSVFileNames(dir, csvFileNames); // Recursive call
                }
            }
        }
    }}