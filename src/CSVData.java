/***
 * A class that is able to read the data from the sensors in our smartphones
 * 
 * @author Warren
 *
 */
public class CSVData {
	private String[] columnHeaders;
	private double[][] data;
	
	public static CSVData readCSVFile(String fileName, int numLinesToIgnore, String[] columnNames){
		return null;
	}
	/***
	 * Returns a new CSVData object for a file ignoring lines at the top.
	 * It uses the first row as the column names. All other data is stored
	 * as doubles.
	 * 
	 * @param fileName
	 * @param numLinestoIgnore
	 * @return
	 */
	public CSVData readCSVFile(String fileName, int numLinestoIgnore){
		return null;
	}
	
}
