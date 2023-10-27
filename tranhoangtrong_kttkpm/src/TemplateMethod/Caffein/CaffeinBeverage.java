package TemplateMethod.Caffein;

public abstract class CaffeinBeverage {
    public abstract void brew();
    public abstract void addCondiments();
    public void prepareRecipe(){
        boilWater();
        pourInCup();
        brew();
        addCondiments();
    }
    public void boilWater(){
        System.out.println("Boil water at the temperature of 100C");
    }

    public void pourInCup()
    {
        System.out.println("Pour the finished product into a cup");
    }
}
