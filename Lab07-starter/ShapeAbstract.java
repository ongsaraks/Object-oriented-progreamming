// File: <ShapeAbstract>
// Description: <Create abstract shape>
// Assignment Number: <Lab 7 challenge>
//
// ID: <6688093>
// Name: Ongsa Raksalam
// Section: 2
// Grader: Sorn
//
// On my honor, Ongsa Raksalam, this lab assignment is my own work
// and I have not provided this code to any other students.
abstract class ShapeAbstract {
	private String color;
	public ShapeAbstract(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return "Shape[color=" + color + "]";
	}
	abstract double getArea();
}
