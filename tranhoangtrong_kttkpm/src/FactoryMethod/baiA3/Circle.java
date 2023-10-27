package FactoryMethod.baiA3;

public class Circle extends Shape{

    @Override
    public String draw() {
        setBrush("red");
        setFrame("holo");
        setPaper("white");
        return getBrush() + getPaper() + getFrame();
    }
}
