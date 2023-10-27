package DeleteLater.A3;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = ShapeFactory.getInstance();
        Shape rectangle = shapeFactory.createShape(ShapeType.RECTANGLE);
        System.out.println(rectangle.draw());
    }
}
