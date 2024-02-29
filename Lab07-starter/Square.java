
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
//		this.side1 = side1;
//		this.side2 = side2;
		return this.side1 * this.side2;
	}
	public String toString() {
		return "Square "+ "[side1="+ this.side1 + ", side="+this.side2+", Shape[color="+ super.getColor()+"]]";
	}
}
