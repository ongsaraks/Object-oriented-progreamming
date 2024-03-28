
public class WaxDie extends Cube implements Comparable<Object3D>, Meltable{

	public WaxDie(String _name, double _edge) {
		super(_name,Material.Wax, _edge);

	}

	@Override
	public int compareTo(Object3D o) {
		if(super.getVolume() > o.getVolume()) {
			return 1;
		}
		else if(super.getVolume() < o.getVolume()) {
			return -1;
				
		}
		else {
			return super.getName().compareTo(o.getName());
		}
			
		
	}
	@Override
	public Object3D convertToOtherShape() {
		double radius=(Math.cbrt(super.getVolume()*(3.0/4)/Object3D.PI));
	        return new Sphere(super.getName(), Material.Wax, radius); 
		
	}

	


}
