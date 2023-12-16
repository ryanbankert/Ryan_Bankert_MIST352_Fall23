import java.io.*;
/**
 * This class allows you to convert a csv file to arff file.
 * @author Ryan Bankert
 * Class: MIST352-Fall23
 * Csv2Arff HW4
 */
public class Csv2Arff {
	private String csvFileLocation;
	
	/**
	 * Keep as is. 
	 * Constructor.
	 * @param Location
	 */
	public Csv2Arff(String Location)
	{
		csvFileLocation=Location;
	}
	
	/**
	 * You need to code this
	 * This method accepts a name of a csv file and it writes an arff file from the csv file
	 * Writing arff file is similar to writing any .txt file. Just make sure the arff file name ends with .arff
	 * @param theLocation: The name and location of any csv file
	 */
	public void Convert2Arff(String theLocation) {
	    try (BufferedReader br = new BufferedReader(new FileReader(theLocation));
	            FileWriter arff = new FileWriter(theLocation.replaceFirst(".csv", ".arff"))) {

	           // Writes per line to the new file
	           String line;
	           while ((line = br.readLine()) != null) {
	               String[] values = line.split(",");
	               for (String value : values) {
	                   arff.write(value + ",");
	               }
	               arff.write("\n");
	           }

	           System.out.println("Done =)");

	       } catch (IOException e) {
	           System.err.println("Error converting CSV to ARFF: " + e.getMessage());
	       }
	   }
	
	/**
	 * This method should red the text file to a two dimensional array of Strings.
	 * This method should return the data given in a specific row and column in the two dimensional array
	 * @param theFile: name of the csv file to open 
	 * @param row: row number in the two dimensional array
	 * @param column: column number in the two dimensional array
	 * @return strData2Return: the data in the [column][row]
	 */
	public static String RetrieveCell(String theFile, int row, int column) {
	    String strData2Return = "";
	    String directoryPath = "src/data/";
	    String filePath = directoryPath + theFile;

	    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	        for (int i = 0; i < row; i++) {
	            br.readLine(); // Skips lines until the desired row
	        }

	        String line = br.readLine();
	        if (line != null) {
	            String[] values = line.split(",");
	            if (column >= 0 && column < values.length) {
	                strData2Return = values[column];
	            }
	        }

	    } catch (IOException e) {
	        System.err.println("Error retrieving cell data: " + e.getMessage());
	    }

	    return strData2Return;
	}
}