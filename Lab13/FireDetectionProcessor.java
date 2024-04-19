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

		int[] count = new int[1];
		count[0] = 0;
		try {
			File file = new File(filePath);
			Scanner scanner = new Scanner(file);
			int row = scanner.nextInt();
			int col = scanner.nextInt();
			int[][] data = new int[row][col];
			int S;
			int E;

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					data[i][j] = scanner.nextInt();
				}
			}

			S = scanner.nextInt();
			E = scanner.nextInt();
			scanner.close();

			System.out.println("Original Grid:");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(data[i][j] + " ");
				}
				System.out.println();
			}

			int[][] LOL = FireMark(data, S, E, count);
			System.out.println("Processed Grid: ");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(LOL[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("Total fire-affected cells processed: " + count[0]);

		} catch (FileNotFoundException e) {
			System.err.println("File not found: " + filePath);
		}

	}

	public static int[][] FireMark(int data[][], int i, int j, int[] count) {
		if (i < 0 || j < 0 || i >= data.length || j >= data[0].length || data[i][j] != 1) {
			return data;
		} else {
			count[0] += 1;
			data[i][j] = 2;
//    		FireMark(data,i-1,j); // Up
//    		FireMark(data,i+1,j); // Down
//    		FireMark(data,i,j-1); // Left
//    		FireMark(data,i,j+1); // Right
			FireMark(data, i - 1, j, count); // Up
			FireMark(data, i + 1, j, count); // Down
			FireMark(data, i, j - 1, count); // Left
			FireMark(data, i, j + 1, count); // Right
			FireMark(data, i - 1, j - 1, count);
			FireMark(data, i - 1, j + 1, count);
			FireMark(data, i + 1, j - 1, count);
			FireMark(data, i + 1, j + 1, count);
			return data;
		}

	}

	// Implement methods for processing the grid and printing the grid
}
