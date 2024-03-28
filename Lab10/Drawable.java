public abstract class Drawable {

    public abstract void draw(); 

    public String getName() {
        return getClass().getSimpleName(); 
    }
}