package TemplateMethod.Caffein;

public class Coffee extends CaffeinBeverage {
    @Override
    public void brew() {
        System.out.println("Filter the coffee using boiled water");
    }

    @Override
    public void addCondiments() {
        System.out.println("Add sugar and milk");
    }
}
