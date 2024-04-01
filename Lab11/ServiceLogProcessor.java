import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceLogProcessor {

    private List<String> serviceRecords;
    private List<String> errorLog;

    public ServiceLogProcessor() {
        serviceRecords = new ArrayList<>();
        errorLog = new ArrayList<>();
    }

    public void loadServiceRecords(String filename) {
        // TODO: Implement this method to read from the file and populate serviceRecords
    	File file = new File(filename);
    	System.out.println(file.getAbsolutePath());
//    	if(file.exists()) {
//    		System.out.println("Found bitch");
//    		System.out.println(file.getPath());
//    	}
//    	else {
//    		System.out.println("Nah bitches ne");
//    		System.out.println(file.getPath());
//    	}
    }

//    private boolean validateRecord(String record) {
//        // TODO: Implement this method to validate individual service record
//        return true;
//    }
//
//    public double calculateTotalCosts() {
//        // TODO: Implement this method to calculate total costs
//        return 0.0;
//    }
//
//    public void generateReport() {
//        // TODO: Implement this method to print out the report to console and write to a file
//    }
//
//    // Custom exception class for invalid service records
//    class InvalidServiceRecordException extends Exception {
//        public InvalidServiceRecordException(String message) {
//            super(message);
//        }
//    }

    // Main method to run the program
    public static void main(String[] args) {
        ServiceLogProcessor processor = new ServiceLogProcessor();
        processor.loadServiceRecords("services.txt"); // replace with the actual file name
//        double totalCosts = processor.calculateTotalCosts();
//        processor.generateReport();
    }
}
