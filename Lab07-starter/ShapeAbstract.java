
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
