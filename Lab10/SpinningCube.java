public class SpinningCube extends Cube implements Animatable {

    private double rotationAngle;

    public SpinningCube(String _name, Material _matType, double _edge) {
        super(_name, _matType, _edge);
        rotationAngle = 0.0;
    }

    
    public void draw() {
        System.out.println("Drawing a spinning cube: " + getName() + ", rotation angle: " + rotationAngle);
    }

    @Override
    public void animate(double time) {
        rotationAngle += time * 10; 
    }
}