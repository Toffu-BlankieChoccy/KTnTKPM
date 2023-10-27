package FactoryMethod.baiA3;

public class ShapeFactory {
    private static ShapeFactory instance;
    private ShapeFactory(){};
    public static ShapeFactory getInstance(){
        if(instance == null){
            instance = new ShapeFactory();
        }
        return instance;
    }

    public Shape createShape (ShapeType shapeType){
        if(shapeType == ShapeType.TRIANGLE)
            return new Triangle();
        if(shapeType == ShapeType.CIRCLE)
            return new Circle();
        if(shapeType == ShapeType.RECTANGLE)
            return new Triangle();
        return null;
    }
}
