
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
