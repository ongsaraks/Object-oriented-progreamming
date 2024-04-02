import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ServiceLogProcessor {

    private List<String> serviceRecords;
    private List<String> errorLog;

    public ServiceLogProcessor() {
        serviceRecords = new ArrayList<>();
        errorLog = new ArrayList<>();
    }

    public void loadServiceRecords(String filename) {
        // TODO: Implement this method to read from the file and populate serviceRecords
    	Scanner reader = null;
//    	File file = new File("text/"+filename);
    		try {
        		reader = new Scanner(new File("text/"+filename));
        		while(reader.hasNextLine()) {
        			 String record = reader.nextLine().trim();
        			 if (!record.isEmpty()) {
        				 try {
        					 validateRecord(record); // Validate each record
                             serviceRecords.add(record);
                             }
        				 catch (InvalidServiceRecordException e) {
                         // Log a warning to the console without stopping the program
                         System.out.println("Warning: " + e.getMessage());
                         errorLog.add(record);
                         }
        			}
        		}
        	}
        	catch (FileNotFoundException e){
        		e.printStackTrace();
        	}
        	
        	finally {
        			if(reader != null) reader.close();
        	}
    	
    }

    private boolean validateRecord(String record) {
        // TODO: Implement this method to validate individual service record4
    	if(record < 0) {
    		return false;
    	}
        return true;
    }

    public double calculateTotalCosts() {
        // TODO: Implement this method to calculate total costs
        return 0.0;
    }

    public void generateReport() {
        // TODO: Implement this method to print out the report to console and write to a file
    }

    // Custom exception class for invalid service records
    class InvalidServiceRecordException extends Exception {
        public InvalidServiceRecordException(String message) {
            super(message);
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        ServiceLogProcessor processor = new ServiceLogProcessor();
        processor.loadServiceRecords("services.txt"); // replace with the actual file name
        double totalCosts = processor.calculateTotalCosts();
        processor.generateReport();
    }
}
