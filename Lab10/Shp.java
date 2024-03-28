public class Shp extends Drawable {

    private String name;

    public Shp(String _name) {
        name = _name;
    }

    public void draw() {
        System.out.println("Drawing a generic shape: " + name);
    }
}