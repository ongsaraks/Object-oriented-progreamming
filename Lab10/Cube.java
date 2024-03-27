
public class Cube extends Object3D{
	private double edge;
	public Cube(String _name, Material _matType,double _edge) {
		super(_name, _matType);
		this.edge = _edge;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return edge*edge*edge;
	}

	@Override
	public double getSurface() {
		// TODO Auto-generated method stub
		return 6*(edge*edge);
	}
	public double getEdge() {
		return  edge;
	}

}
