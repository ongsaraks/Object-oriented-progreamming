import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//File: ServiceLogProcessor.java
//Description: Read and manage the csv. file. Lastly, sort the month.
//Assignment Number: 12
//
//ID: 6688152
//Name: Thanadon Yindeesuk
//Section: 2
//Grader: 
//
//On my honor, Thanadon Yindeesuk, this lab assignment is my own work
//and I have not provided this code to any other students.


public class ForestFireAnalysis1 {
    public static void main(String[] args) {
        String filePath = "./forestfires.csv";
        // Define the RegEx pattern for the months of interest including jan, feb, and apr. 
	// Adjust the pattern as needed.
        String regexPattern = "(feb)+|(apr)+|(jan)+";
        
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
    	String line = "";
    	List<String[]> record = null;
    	try(BufferedReader reader  = new BufferedReader(new FileReader(filePath))){
    		reader.readLine();
    		record = new ArrayList<>();
    		while((line = reader.readLine()) != null) {
    			try {
    				String[] data = line.split(",");
    				record.add(data);
    			}
    			catch(NumberFormatException e) {
    				e.printStackTrace();
    			}
    		}
    	}
    	catch(IOException e){
    		e.printStackTrace();
    	}
    	
        return record;
    }

    private static List<String[]> filterData(List<String[]> data, String regexPattern) {
        // Implement filtering logic based on Regular Expressions
	// YOUR CODE HERE
    	List<String[]> filteredData = new ArrayList<>();
    	Pattern pMonth = Pattern.compile(regexPattern);
    	for(String[] record: data) {
    		Matcher mMonth = pMonth.matcher(record[2]);
    		if(mMonth.find()) {
    			filteredData.add(record);
    		}
    	}
    	
        return filteredData;
    }

    private static void performBasicAnalysis(List<String[]> data) {
        // Implement basic statistical analysis (e.g., counting the number of fires and calculating the average area burned per month)
	// The order of months does not matter here.

	System.out.println("Fire Frequency and Average Size by Month:");
	// YOUR CODE HERE
	int feb = 0, apr = 0, jan = 0;
	double febAvg = 0.0, aprAvg = 0.0, janAvg = 0.0;
		for(String[] record: data) {
			String month = record[2];
			double area = Double.parseDouble(record[12]);
			if(month.equals("feb")) {
				feb++;
				febAvg += area;
			}
			else if(month.equals("apr")) {
				apr++;
				aprAvg += area;
			}
			else if(month.equals("jan")) {
				jan++;
				janAvg += area;
			}
		}
		febAvg = febAvg/feb;
		aprAvg = aprAvg/feb;
		janAvg = janAvg/feb;
		
		System.out.printf("dec, %d, %.2f\n", feb, febAvg);
		System.out.printf("oct, %d, %.2f\n", apr, aprAvg);
		System.out.printf("jan, %d, %.2f\n", jan, janAvg);
	
    }

    // Challenge Task
    private static void performTemporalAnalysis(List<String[]> data) {
        // Implement temporal analysis (e.g., counting fires per month and sorting by month order - Jan, Feb, and Apr)
	// You are not allowed to hardcode how to print the output in order of Jan, Feb, and Apr. 
	// Suppose the filter of months is changed to May, Jun, Dec - your method still has to handle it correctly. 
	// Hint. You should use getMonthOrder method to find the number of each month, before sorting the output.

	System.out.println("Fire Frequency by Month:");
	// YOUR CODE HERE
		Map<String, Integer> monthFire = new HashMap<>();
		
		for(String[] record: data) {
			String month = record[2];
			monthFire.put(month, monthFire.getOrDefault(month, 0) + 1); // default value = 0, if 
		}
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "June", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		for(String month: months) {
			if(monthFire.containsKey(month.toLowerCase())) {
				System.out.println(month + ": " + monthFire.get(month.toLowerCase()) + " fires");
			}
		}
    }
    
    // Challenge Task
    // Utility method to map month names to their numerical order (e.g., "jan" to 1)
    private static int getMonthOrder(String month) {
        // Implement method to return the order of the month (1 for January, 2 for February, etc.)
    		switch(month) {
    		case "jan":
    			return 1;
    		
			case "feb":
				return 2;
			
			case "mar":
				return 3;
			
			case "apr":
				return 4;
			
			case "may":
				return 5;
			
			case "june":
				return 6;
    		
			case "jul":
				return 7;
	
			case "aug":
				return 8;
	
			case "sep":
				return 9;
	
			case "oct":
				return 10;
	
			case "nov":
				return 11;
	
			case "dec":
				return 12;
    		}	
        return 0;
    }
}
