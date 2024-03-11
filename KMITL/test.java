// Java Swing Program to demonstrate
// a simple JFrame
import javax.swing.JFrame;
import javax.swing.JLabel;

// Driver Class
public class test {
	// main function
	public static void main(String[] args)
	{
		// Create a new JFrame
		JFrame frame = new JFrame("My First JFrame");

		// Create a label
		JLabel label
			= new JLabel("Hello world");

		// Add the label to the frame
		frame.add(label);

		// Set frame properties
		frame.setSize(1280,720); // Set the size of the frame

		// Close operation
		frame.setDefaultCloseOperation(
			JFrame.EXIT_ON_CLOSE);

		// Make the frame visible
		frame.setVisible(true);
	}
}
