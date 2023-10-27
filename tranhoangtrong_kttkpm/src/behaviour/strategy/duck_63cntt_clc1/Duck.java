package behaviour.strategy.duck_63cntt_clc1;

public abstract class Duck {
    public void setFlyBehaviour(iFlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(iQuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    iFlyBehaviour flyBehaviour;
    iQuackBehaviour quackBehaviour;

    public abstract String display();

    public void swim(){
        System.out.println("Vit nhung biet boi");
    }

    void performFly(){
        System.out.println(flyBehaviour.fly());
    }

    void performQuack(){
        System.out.println(quackBehaviour.quack());
    }
    }

