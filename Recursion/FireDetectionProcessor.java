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
			while (scanner.hasNextLine()) {
				line = scanner.nextLine();
				String[] keep = line.split(" ");
				if (keep.length == 2) {
					row = Integer.parseInt(keep[0]);
					col = Integer.parseInt(keep[1]);
				} else if (keep.length == col) {
					record.add(line.split(" "));
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
		System.out.println(row);
		System.out.println(col);

	}

	// Implement methods for processing the grid and printing the grid
}
