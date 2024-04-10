import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ForestFireAnalysis {

    public static void main(String[] args) {
        String filePath = "./forestfires.csv";
        // Define the RegEx pattern for the months of interest including jan, feb, and apr. 
	// Adjust the pattern as needed.
        String regexPattern = "jan|feb|apr";
        
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
    	List<String[]> keep = new ArrayList<>();
    	try (BufferedReader file = new BufferedReader(new FileReader(filePath))) {
    		String line;
    		while((line = file.readLine()) != null) {
//    			System.out.println(line);
    			String[] row = line.split(",");
    			keep.add(row);
    		}
    	}catch(FileNotFoundException e) {
    		e.printStackTrace();
    	}catch(IOException e){
    		e.printStackTrace();
    	}
    	return keep;
    
    }

    private static List<String[]> filterData(List<String[]> data, String regexPattern) {
        // Implement filtering logic based on Regular Expressions
	// YOUR CODE HERE
    	List<String[]> dataList = new ArrayList<String[]>();

		for (String[] str : data) {
			Pattern p = Pattern.compile(regexPattern);
			Matcher m = p.matcher(str[2]);
			if (m.matches()) {
				dataList.add(str);
			}
		}
//    	for (int i = 0; i < data.size()-1; i++) {
//    			Pattern p = Pattern.compile(regexPattern);
//    			Matcher m = p.matcher(data.get(i).);
//    			if (m.matches()) {
//    				dataList.add(data);
//    			}
//    		
//			
//		}

		return dataList;
    	  
    }
    	 
    

    private static void performBasicAnalysis(List<String[]> data) {
		// Implement basic statistical analysis (e.g., counting the number of fires and
		// calculating the average area burned per month)
		// The order of months does not matter here.

		System.out.println("Fire Frequency and Average Size by Month:");
		// YOUR CODE HERE
		
		String[] regexPattern = { "feb", "apr", "jan" };

		for (String text : regexPattern) {

			int count = 0;
			double sum = 0;
			Pattern p = Pattern.compile(text);

			for (String[] str : data) {
				Matcher m = p.matcher(str[2]);
				if (m.matches()) {
					count++;
					sum += Double.parseDouble(str[str.length - 1]);
				}
			}

			System.out.println(text + ", " + count + ", " + String.format("%.2f", sum / count));
		}
		System.out.println();
	}

    // Challenge Task
    private static void performTemporalAnalysis(List<String[]> data) {
        // Implement temporal analysis (e.g., counting fires per month and sorting by month order - Jan, Feb, and Apr)
	// You are not allowed to hardcode how to print the output in order of Jan, Feb, and Apr. 
	// Suppose the filter of months is changed to May, Jun, Dec - your method still has to handle it correctly. 
	// Hint. You should use getMonthOrder method to find the number of each month, before sorting the output.

    	System.out.println("Fire Frequency by Month:");
		// YOUR CODE HERE
		ArrayList<String> regexPattern = new ArrayList<String>();
		String regex = "jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec";
		
		Pattern patt = Pattern.compile(regex);
		
		for (String[] e : data) {
			Matcher m = patt.matcher(e[2]);
			if(m.matches() && !regexPattern.contains(e[2])) {
				regexPattern.add(e[2]);
			}
		}
//		String[] regexPattern = { "feb", "apr", "jan" };
		
		for(int i = 0 ; i < regexPattern.size()-1 ; i++) {
			for(int j = i+1 ; j < regexPattern.size() ; j++) {
				String m1 = regexPattern.get(i);
				String m2 = regexPattern.get(j);
				if(getMonthOrder(m1) > getMonthOrder(m2)) {
					String temp = regexPattern.get(i);
					regexPattern.set(i, regexPattern.get(j));
					regexPattern.set(j, temp);
				}
			}
		}
		
		for (String text : regexPattern) {

			String month = text.substring(0,1).toUpperCase() + text.substring(1);
			int count = 0;
			Pattern p = Pattern.compile(text);
			for (String[] str : data) {
				Matcher m = p.matcher(str[2]);
				if (m.matches()) {
					count++;
				}
			}
			System.out.println(month + ": " + count + " fires");
		}

	}
    
    
    // Challenge Task
    // Utility method to map month names to their numerical order (e.g., "jan" to 1)
    private static int getMonthOrder(String month) {
		// Implement method to return the order of the month (1 for January, 2 for
		// February, etc.)
		switch (month) {
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
		case "jun":
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


