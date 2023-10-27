package FactoryMethod.baiA3;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = ShapeFactory.getInstance();

        Shape circle = shapeFactory.createShape(ShapeType.CIRCLE);
        System.out.println(circle.draw());
        Shape triangle = shapeFactory.createShape(ShapeType.TRIANGLE);
        System.out.println(triangle.draw());
        Shape rectangle = shapeFactory.createShape(ShapeType.RECTANGLE);
        System.out.println(rectangle.draw());
    }
}
