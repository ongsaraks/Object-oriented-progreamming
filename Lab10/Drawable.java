public abstract class Drawable {

    public abstract void draw(); // Implemented by subclasses to define how to draw the object

    public String getName() {
        return getClass().getSimpleName(); // Get class name as a default name
    }
}