import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FireDetectionProcessor {

	public static ArrayList<String> record = new ArrayList<>();
	private static String line;

    public static void main(String[] args) {
        String filePath = "grid.txt"; // Adjust path as necessary
        processFile(filePath);
    }

    private static void processFile(String filePath) {
       
       
    	try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            scanner.nextLine();
            while(scanner.hasNextInt() && record.size() < row) {
            	line = scanner.nextLine();
            	String[] keep = line.split(" ");  
            	if(keep.length == row) {
                	record.add(line);
            	}
           
            	
            
            }
            // Read grid dimensions
            // Read grid data
            // Read starting point
            // You may need to add additional methods or logic here
          
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
        }
    	
//    		System.out.println(record);
    	for(String n : record) {
    		System.out.println(n);
    	}
    	
    	
    }
   

    // Implement methods for processing the grid and printing the grid
}
