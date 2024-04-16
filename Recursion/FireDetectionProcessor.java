import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;
import java.io.BufferedReader;

public class FireDetectionProcessor {

    public static void main(String[] args) {
        String filePath = "grid.txt"; // Adjust path as necessary
        processFile(filePath);
    }

    private static void processFile(String filePath) {
    	ArrayList<String> record = new ArrayList<>();
    	int count = 0;
        	try (Scanner scanner = new Scanner(new File(filePath))){
            	String line;
            	while(scanner.hasNextLine()) {
            		line = scanner.nextLine();
            		line.split(" ");
            		if(line.length() != 4) {
            			record.add(line);
            			count++;
            		}
            	}
//              System.out.println("The dimenion is: "+ count);
//              for(String n : record) {
//              	System.out.println(n);
//              }
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
