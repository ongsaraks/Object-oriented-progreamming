public class ButterBall extends Sphere implements Comparable<Object3D>,Meltable{


	public ButterBall(String _name, double _radius) {
		super(_name, Material.Butter, _radius);
		// TODO Auto-generated constructor stub
	}



	@Override
	public int compareTo(Object3D o) {
		if(super.getSurface() > o.getSurface()) {
			return 1;
		}
		else if(super.getSurface() < o.getSurface()) {
			return -1;
				
		}
		else {
			return super.getName().compareTo(o.getName());
		}
		
	}
	@Override
	public Object3D convertToOtherShape() {
		  double edgeLength = Math.cbrt(super.getVolume()); 
	        return new Cube(super.getName(), Material.Butter, edgeLength);
	}

}
