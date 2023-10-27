package ObserverPattern.CA2ThucHanh;

public class Button{
    IClickCounter clickCounter;

    public void register(IClickCounter clickCounter){
        this.clickCounter = clickCounter;
    }

    public void click() {
        if (clickCounter != null)
            clickCounter.countClick();
    }


    public static interface IClickCounter{
        void countClick();
    }
}
