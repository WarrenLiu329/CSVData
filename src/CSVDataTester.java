import java.util.Arrays;

public class CSVDataTester {

	public static void main(String[] args) {
		String filePath = "/Volumes/WARREN_LIU 1/Java/GyroTest2out.csv";
		
		String[] columnNames = {"time (ms)", "gyro-x", "gyro-y", "gyro-z"};
		CSVData data = new CSVData(filePath, columnNames, 1);
		System.out.println(Arrays.toString(data.getColumn(3)));
		
	}
	
	public static void print(double[][] data){
		for (int row = 0; row < data.length; row++ ){
			for (int col = 0; col < data[0].length; col++){
				System.out.println(data[row][col]);
			}
		}
	}

}
