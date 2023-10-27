package structural.decorator.clc_beverage;

public class DarkRoast extends Beverage{
    public DarkRoast(String description) {
        this.description = description;
    }

    @Override
    public int cost() {
        return 20;
    }
}
