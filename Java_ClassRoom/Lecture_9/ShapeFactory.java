public class ShapeFactory {
    public static Shape getShape(String msg) {
        Shape s = null;
        if (msg == null) {
            return null;
        }
        else if (msg.equalsIgnoreCase("circle")) {
            s = new Circle();
        }
        else if (msg.equalsIgnoreCase("rectangle")) {
            s = new Rectangle();
        }
        else if (msg.equalsIgnoreCase("square")) {
            s = new Square();
        }
        return s;
    }
}