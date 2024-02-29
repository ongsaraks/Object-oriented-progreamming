// File: <Rectangle>
// Description: <Create Rectangle shape>
// Assignment Number: <Lab 7>
//
// ID: <6688093>
// Name: Ongsa Raksalam
// Section: 2
// Grader: Sorn
//
// On my honor, Ongsa Raksalam, this lab assignment is my own work
// and I have not provided this code to any other students.

/*
 * The Rectangle class, subclass of Shape
 */

// TODO 1: Make this class extend from Shape class
public class Rectangle extends Shape{
		
	// TODO 2: Create any private instance variables of Rectangle class 
	// CODE HERE
	private double length;
	private double width;
	// TODO 3: Create a constructor method taking no input parameter
	// then, assign default value to each instance variable as follows
	// color: "no color"
	// length: 0
	// width: 0
	public Rectangle() {
		// CODE HERE
		this.length = 0.0;
		this.width = 0.0;
	}

	// TODO 4: Overload a constructor method taking three input parameters
	// then assign the value to each instance variable accordingly
	public Rectangle(String color, double length, double width) {
		// CODE HERE
		super(color);
		this.length = length;
		this.width = width;
	}

	
	// TODO 5: Override the inherited getArea() to provide the proper implementation
	@Override
	public double getArea() {
		// CODE HERE
		double area = width * length; 
		return area;
	}

	// TODO 6: Overload the getArea() method taking two input parameters
	// then, reset the `length` and `width` of the current object to the value of these given parameters
	// finally, calculate and return the area
	public double getArea(double length, double width) {
		// CODE HERE
		double area = width * length; 
		this.width = width;
		this.length = length;
		return area;
		
	}
	
	// TODO 7: Override the inherited toString() method to display rectangle information in the following format
	// e.g, "Rectangle[length=4, width=5, Shape[color=red]]" 
	@Override
	public String toString() {
		// CODE HERE
		return "Rectangle "+ "[length="+ this.length + ", width="+this.width+", Shape[color="+ super.getColor()+"]]" ;
	}

}
