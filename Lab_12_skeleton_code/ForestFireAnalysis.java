import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ForestFireAnalysis {

    public static void main(String[] args) {
        String filePath = "./forestfires.csv";
        // Define the RegEx pattern for the months of interest including jan, feb, and apr. 
	// Adjust the pattern as needed.
        String regexPattern = "your_regex_pattern_here";
        
        try {
            List<String[]> fireData = readCsv(filePath);
            List<String[]> filteredData = filterData(fireData, regexPattern);
            performBasicAnalysis(filteredData);
            performTemporalAnalysis(filteredData); // Challenge Task
        } catch (IOException e) {
            System.out.println("Error reading the CSV file: " + e.getMessage());
        }
    }

    private static List<String[]> readCsv(String filePath) throws IOException {
        // Implement reading and parsing CSV data
	// YOUR CODE HERE
    	try {
    		BufferedReader file = new BufferedReader(new FileReader(filePath));
    		
    	}catch(IOException e){
    		e.printStackTrace();
    	}
    	
        return new ArrayList<>();
    }

    private static List<String[]> filterData(List<String[]> data, String regexPattern) {
        // Implement filtering logic based on Regular Expressions
	// YOUR CODE HERE
        return new ArrayList<>();
    }

    private static void performBasicAnalysis(List<String[]> data) {
        // Implement basic statistical analysis (e.g., counting the number of fires and calculating the average area burned per month)
	// The order of months does not matter here.

	System.out.println("Fire Frequency and Average Size by Month:");
	// YOUR CODE HERE
	
    }

    // Challenge Task
    private static void performTemporalAnalysis(List<String[]> data) {
        // Implement temporal analysis (e.g., counting fires per month and sorting by month order - Jan, Feb, and Apr)
	// You are not allowed to hardcode how to print the output in order of Jan, Feb, and Apr. 
	// Suppose the filter of months is changed to May, Jun, Dec - your method still has to handle it correctly. 
	// Hint. You should use getMonthOrder method to find the number of each month, before sorting the output.

	System.out.println("Fire Frequency by Month:");
	// YOUR CODE HERE
	
    }
    
    // Challenge Task
    // Utility method to map month names to their numerical order (e.g., "jan" to 1)
    private static int getMonthOrder(String month) {
        // Implement method to return the order of the month (1 for January, 2 for February, etc.)
        return 0;
    }
}
