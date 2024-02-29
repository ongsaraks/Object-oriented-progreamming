// File: <Triangle>
// Description: <Create Triangle shape>
// Assignment Number: <Lab 7>
//
// ID: <6688093>
// Name: Ongsa Raksalam
// Section: 2
// Grader: Sorn
//
// On my honor, Ongsa Raksalam, this lab assignment is my own work
// and I have not provided this code to any other students.
/*  The structure of Triangle class is similar to Rectangle */
public class Triangle extends Shape{

	//TODO 8: Complete the Triangle class
	private double base;
	private double height;
	public Triangle() {
		// CODE HERE
		this.base = 0;
		this.height = 0;
	}


	public Triangle(String color, double base, double height) {
		// CODE HERE
		super(color);
		this.base = base;
		this.height = height;
	}

	
	
	@Override
	public double getArea() {
		// CODE HERE
		return 0.5*base * height;
	}

	public double getArea(double base, double height) {
		// CODE HERE
		this.base = base;
		this.height = height;
		return 0.5*base * height;
	}
	
	
	@Override
	public String toString() {
		// CODE HERE
		return "Rectangle "+ "[length="+ this.base + ", width="+this.height+", Shape[color="+ super.getColor()+"]]" ;
	}
}
