// File: <Circle>
// Description: <Create Circle shape>
// Assignment Number: <Lab 7 challenge>
//
// ID: <6688093>
// Name: Ongsa Raksalam
// Section: 2
// Grader: Sorn
//
// On my honor, Ongsa Raksalam, this lab assignment is my own work
// and I have not provided this code to any other students.
 class Circle extends ShapeAbstract {
	 private double radius;
	public Circle(String color,double radius) {
		super(color);
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*(radius*radius);
	}
	public double getArea(double radius) {
		// TODO Auto-generated method stub
		this.radius = radius;
		
		return 3.14*(radius * radius);
	}
	public String toString() {
		return "Circle "+ "[Radius ="+ this.radius + "Shape[color="+ super.getColor()+"]] ";
	}
}
