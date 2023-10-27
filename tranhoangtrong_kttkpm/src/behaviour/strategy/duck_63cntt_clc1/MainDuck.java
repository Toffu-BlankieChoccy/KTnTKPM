package behaviour.strategy.duck_63cntt_clc1;

public class MainDuck {
    public static void main(String[]args){
        Duck duck = new VitQuay();
        duck.setFlyBehaviour(new FlyNoWay());
        duck.setQuackBehaviour(new MuteQuack());
        duck.display();
    }
}
