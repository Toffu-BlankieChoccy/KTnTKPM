package FactoryMethod.baiA3;

public class Rectangle extends Shape{

    @Override
    public String draw() {
        setBrush("black");
        setFrame("");
        setPaper("white");
        return getBrush() + getPaper() + getFrame();
    }
}
