/***
 * A class that is able to read the data from the sensors in our smartphones
 * 
 * @author Warren
 *
 */
public class CSVData {
	private String[] columnHeaders;
	private double[][] data;

	public static CSVData readCSVFile(String fileName, int numLinesToIgnore, String[] columnNames) {
		return null;
	}

	/***
	 * Returns a new CSVData object for a file ignoring lines at the top. It
	 * uses the first row as the column names. All other data is stored as
	 * doubles.
	 * 
	 * @param fileName
	 * @param numLinestoIgnore
	 * @return
	 */
	public CSVData readCSVFile(String fileName, int numLinestoIgnore) {
		return null;
	}

	/****
	 * returns a row
	 * 
	 * @param r
	 * @return the row we r returning
	 */

	public double[] getRow(int r) {
		return this.data[r];
	}

	/***
	 * returns a column
	 * 
	 * @param Index
	 * @return the column we r returning
	 */
	public double[] getColumn(int colIndex) {
		double[] cols = new double[this.data.length];
		for (int r = 0; r < this.data.length; r++) {
			cols[r] = this.data[r][colIndex];
		}

		return cols;
	}

	/***
	 * return the index of the column based on name
	 * 
	 * @param name
	 * @return the index of the returned name
	 */
	public int getColumnIndex(String name) {
		for (int i = 0; i < this.columnHeaders.length; i++) {
			if (this.columnHeaders[i].equals(name)) {
				return i;
			}
		}
		return 0;
	}

	/***
	 * returns multiple rows
	 * 
	 * @param rowIndexes
	 * @return the rows indicated
	 */
	public double[][] getMultipleRows(int[] rowIndexes) {
		double[][] rowValues = new double[rowIndexes.length][data[0].length];
		for (int i = 0; i < rowIndexes.length; i++) {
			rowValues[i] = getRow(rowIndexes[i]);
		}
		return rowValues;
	}

	/****
	 * returns multiple columns
	 * 
	 * @param columnNames
	 * @return the set of columns user wants
	 */
	public double[][] getMultipleColumns(String[] columnNames) {
		double[] newData = new double[data.length];
		double[][] colValues = new double[data.length][columnNames.length];
		int index = 0;
		for (int i = 0; i < columnNames.length; i++) {
			index = getColumnIndex(columnNames[i]);
			newData = getColumn(index);
			for (int row = 0; row < data.length; row++) {
				colValues[row][i] = newData[row];
			}
		}

		return colValues;

	}

	/***
	 * returns the data
	 * 
	 * @return the current data
	 */
	public double[][] getData() {
		return this.data;
	}

	/***
	 * returns the list of column names
	 * 
	 * @return the current column names
	 */
	public String[] getColumnTitles() {
		return this.columnHeaders;
	}

	/***
	 * sets the new data value to a spot on the 2d array
	 * 
	 * @param rowIndex
	 * @param colIndex
	 * @param newValue
	 */
	public void setValue(int rowIndex, int colIndex, double newValue) {
		data[rowIndex][colIndex] = newValue;
	}

	/***
	 * sets the name of a column
	 * 
	 * @param columnIndex
	 * @param name
	 */
	public void setColumnName(int columnIndex, String name) {
		columnHeaders[columnIndex] = name;
	}

	/***
	 * formats the data into a readable file
	 * 
	 * @param fileName
	 */

	public void saveToFile(String fileName) {

	}

}
