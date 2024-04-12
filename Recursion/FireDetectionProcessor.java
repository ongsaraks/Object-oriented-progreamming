import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

public class FireDetectionProcessor {

    public static void main(String[] args) {
        String filePath = "grid.txt"; // Adjust path as necessary
        processFile(filePath);
    }

    private static void processFile(String filePath) {
    	ArrayList<String> record = new ArrayList<>();
    	int count = 0;
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            String line;
            while(scanner.hasNextLine()) {
            	line = scanner.nextLine();
            		record.add(line);
            		count++;
            		System.out.println(record);
         
            	
            	
            	
            }
            System.out.println("The dimenion is: "+ count);
            // Read grid dimensions
            // Read grid data
            // Read starting point
            // You may need to add additional methods or logic here
            
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
        }
    }

    // Implement methods for processing the grid and printing the grid
}
