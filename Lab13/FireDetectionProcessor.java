import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FireDetectionProcessor {

	public static ArrayList<String> record = new ArrayList<>();
	




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
        	int[][] data = new int[row][col];
        	int S;
        	int E;
           
            for(int i = 0; i < row; i++) {
            	for(int j = 0; j < col; j++) {
            		data[i][j] = scanner.nextInt();
            	}
            }
            for(int i = 0; i < row; i++) {
            	for(int j = 0; j < col; j++) {
            		System.out.print(data[i][j]);
            	}
            	System.out.println();
            }
            S = scanner.nextInt();
            E = scanner.nextInt();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
        }
    	
    	
    }
   

    // Implement methods for processing the grid and printing the grid
}
