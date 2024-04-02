import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
    	try {
    		reader = new Scanner(new File(filename));
    		while(reader.hasNextLine()) {
    			 String record = reader.nextLine();
    			 if (!record.isEmpty()) {
    				 try {
    					 validateRecord(record);
                         serviceRecords.add(record);
                         }
    				 catch (InvalidServiceRecordException e) {
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

    private boolean validateRecord(String record) throws ServiceLogProcessor.InvalidServiceRecordException {
        // TODO: Implement this method to validate individual service record
    	 String[] fields = record.split(" ");
    	 
         if (fields.length != 4) {
             throw new InvalidServiceRecordException("Invalid number of fields in record: " + record);
         }
         
         double cost = Double.parseDouble(fields[3]);
         if (cost < 0) {
             throw new InvalidServiceRecordException("Negative cost in record: " + record);
         }
         return true;
    }

    public double calculateTotalCosts() {
        // TODO: Implement this method to calculate total costs
    	double totalCosts = 0.0;
        for (String record : serviceRecords) {
            try {
                String[] fields = record.split(" ");
                double cost = Double.parseDouble(fields[fields.length - 1]);
                totalCosts += cost;
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Error while calculating total costs for record: " + record);
                e.printStackTrace();
            }
        }
        return totalCosts;
    }

    public void generateReport() {
        // TODO: Implement this method to print out the report to console and write to a file
    	try (PrintWriter writer = new PrintWriter(new FileWriter("report.txt"))) {
            System.out.println("Service Report");
            System.out.println("--------------");
            writer.println("Service Report");
            writer.println("--------------");
            double subtotal = 0.0;
            for (String record : serviceRecords) {
                System.out.println(record);
                writer.println(record);
                String[] fields = record.split(" ");
                double cost = Double.parseDouble(fields[fields.length - 1]);
                subtotal += cost;
            }

            double taxRate = 0.07;
            double tax = subtotal * taxRate;
            double total = subtotal;
            subtotal = total - tax;

            // Output subtotal, tax, and total
            System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
            System.out.println("Tax: $" + String.format("%.2f", tax));
            System.out.println("Total: $" + String.format("%.2f", total));
            writer.println("Subtotal: $" + String.format("%.2f", subtotal));
            writer.println("Tax: $" + String.format("%.2f", tax));
            writer.println("Total: $" + String.format("%.2f", total));

            // Output records with errors to console and file
            if (!errorLog.isEmpty()) {
                System.out.println("\nRecords with errors:");
                writer.println("\nRecords with errors:");
                for (String errorRecord : errorLog) {
                    System.out.println(errorRecord);
                    writer.println(errorRecord);
                }
            } else {
                System.out.println("\nNo records with errors found.");
                writer.println("\nNo records with errors found.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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
