
public class Sphere extends Object3D{
	private double radius;
	public Sphere(String _name, Object3D.Material _matType, double _radius) {
		super(_name, _matType);
		this.radius = _radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return 4.0/3*(radius*radius*radius)*PI;
	}

	@Override
	public double getSurface() {
		// TODO Auto-generated method stub
		return 4*(radius*radius)*PI;
	}
	public double getRadius() { 
		return radius;
	}

}
