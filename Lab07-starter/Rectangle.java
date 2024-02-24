/*
 * The Rectangle class, subclass of Shape
 */

// TODO 1: Make this class extend from Shape class
public class Rectangle  extends Shape{
	
	// TODO 2: Create any private instance variables of Rectangle class 
	// CODE HERE
	
	// TODO 3: Create a constructor method taking no input parameter
	// then, assign default value to each instance variable as follows
	// color: "no color"
	// length: 0
	// width: 0
	public Rectangle() {
		// CODE HERE
	}

	// TODO 4: Overload a constructor method taking three input parameters
	// then assign the value to each instance variable accordingly
	public Rectangle(String color, double length, double width) {
		// CODE HERE
	}

	
	// TODO 5: Override the inherited getArea() to provide the proper implementation
	@Override
	public double getArea() {
		// CODE HERE
		return 0.0;
	}

	// TODO 6: Overload the getArea() method taking two input parameters
	// then, reset the `length` and `width` of the current object to the value of these given parameters
	// finally, calculate and return the area
	public double getArea(double length, double width) {
		// CODE HERE
		return 0.0;
	}
	
	// TODO 7: Override the inherited toString() method to display rectangle information in the following format
	// e.g, "Rectangle[length=4, width=5, Shape[color=red]]" 
	@Override
	public String toString() {
		// CODE HERE
		return "";
	}

}
