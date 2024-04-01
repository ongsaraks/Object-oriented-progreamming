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
//    	BufferedReader reader = null;
//    	File file = new File("C:/Users/gifly/Desktop/Object-oriented-progreamming/Lab11/"+filename);
//    	try {
//    		reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
//    	}catch(FileNotFoundException e) {
//    		e.printStackTrace();
//    	}catch(IOException e) {
//    		e.printStackTrace();
//    	}finally {
//    		try {
//    			if(reader != null) {
//    				reader.close();
//    			}
//    		}catch(IOException e) {
//    			e.printStackTrace();
//    		}
//    	}
    	
    }

    private boolean validateRecord(String record) {
        // TODO: Implement this method to validate individual service record
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
