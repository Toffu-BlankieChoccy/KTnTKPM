package TemplateMethod.Caffein;

public class Tea extends CaffeinBeverage{
    @Override
    public void brew() {
        System.out.println("Filter the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Add milk");
    }
}
