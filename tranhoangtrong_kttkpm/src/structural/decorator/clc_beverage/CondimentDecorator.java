package structural.decorator.clc_beverage;

public abstract class CondimentDecorator extends Beverage{
    //Change variable name component = beverage (in order to understand)
    //Beverage in a class is a component
    Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        //return super.getDescription();
        return beverage.getDescription();
    }
}
