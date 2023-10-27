package DeleteLater.A3;

public class ShapeFactory{

    private static ShapeFactory instance;
    private ShapeFactory(){};
    public static ShapeFactory getInstance(){
        if(instance == null)
        {
            instance = new ShapeFactory();
        }
        return instance;
    }

    public Shape createShape(ShapeType shapeType)
    {
        switch (shapeType){
            case TRIANGLE:
                return new Triangle("","","");
            case CIRCLE:
                return new Circle("","","");
            case RECTANGLE:
                return new Rectangle("","","");
            default:
                return null;
        }
    }
}
