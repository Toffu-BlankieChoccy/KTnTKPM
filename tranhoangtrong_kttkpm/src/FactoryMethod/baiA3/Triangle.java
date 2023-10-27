package FactoryMethod.baiA3;

public class Triangle extends Shape{

    @Override
    public String draw() {
        setBrush("black");
        setFrame("violet");
        setPaper("white");
        return getBrush() + getPaper() + getFrame();
    }
}
