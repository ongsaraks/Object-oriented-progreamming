// File: <Square>
// Description: <Create square shape>
// Assignment Number: <Lab 7 challenge>
//
// ID: <6688093>
// Name: Ongsa Raksalam
// Section: 2
// Grader: Sorn
//
// On my honor, Ongsa Raksalam, this lab assignment is my own work
// and I have not provided this code to any other students.
class Square extends ShapeAbstract{
	private double side1;
	private double side2;
	public Square(String color,double side1,double side2) {
		super(color);
		this.side1 = side1;
		this.side2 = side2;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.side1 * this.side2;
	}
	public double getArea(double side1, double side2) {
		// TODO Auto-generated method stub
		this.side1 = side1;
		this.side2 = side2;
		return this.side1 * this.side2;
	}
	
	public String toString() {
		return "Square "+ "[side1="+ this.side1 + ", side="+this.side2+", Shape[color="+ super.getColor()+"]]";
	}
}
