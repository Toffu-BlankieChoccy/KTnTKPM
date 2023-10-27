package TemplateMethod.Caffein;

import java.sql.SQLOutput;

public class MainBeverage {
    public static void main(String[] args) {
        CaffeinBeverage tea = new Tea();
        CaffeinBeverage coffee = new Coffee();
        System.out.println("A CUP OF TEA ORDER UP!");
        tea.prepareRecipe();
        tea.brew();
        tea.addCondiments();
        System.out.println();
        System.out.println("A CUP OF COFFEE ORDER UP!");
        coffee.prepareRecipe();
        coffee.brew();
        coffee.addCondiments();

    }
}
