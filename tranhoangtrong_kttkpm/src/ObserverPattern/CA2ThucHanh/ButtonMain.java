package ObserverPattern.CA2ThucHanh;

public class ButtonMain {
    public static void main(String[] args) {
        Button button = new Button();

        Activity activity1 = new Activity();
        System.out.println("Activity 1: ");
        button.register(activity1);
        button.click();
        button.click();
        button.click();
    }
}
