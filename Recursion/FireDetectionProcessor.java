import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.*;

public class FireDetectionProcessor {
	List<String[]> record = new ArrayList<>();
	private static int row;
	private static int col;

	public static void main(String[] args) {
		String filePath = "grid.txt"; // Adjust path as necessary
		processFile(filePath);
	}

	private static void processFile(String filePath) {
		List<String[]> record = new ArrayList<>();
		int count = 0;
		try (Scanner scanner = new Scanner(new File(filePath))) {
			String line;
			line = scanner.nextLine();
			String[] dimension = line.split(" ");
			row = Integer.parseInt(dimension[0]);
			col = Integer.parseInt(dimension[1]);
			while (scanner.hasNextLine()) {
				line = scanner.nextLine();
				String[] keep = line.split(" ");
				if (keep.length == row) {
					record.add(keep);
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
		for(String[] n : record) {
			System.out.print(n[2]);
		}
//		System.out.println(row);
//		System.out.println(col);
			
		

	}

	// Implement methods for processing the grid and printing the grid
}
