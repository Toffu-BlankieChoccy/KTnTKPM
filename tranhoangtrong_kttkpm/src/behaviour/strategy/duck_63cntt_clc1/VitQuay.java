package behaviour.strategy.duck_63cntt_clc1;

public class VitQuay extends Duck{

    @Override
    public String display() {
        System.out.println("Vit quay so 1");
        this.swim();
        this.performFly();
        this.performQuack();
        return null;
    }
}
