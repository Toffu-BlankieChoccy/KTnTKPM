package ObserverPattern.CA2ThucHanh;

public class Activity implements Button.IClickCounter {
    int count = 0;

    @Override
    public void countClick() {
        count++;
        System.out.println("Bạn đã click lần thứ: " + count);
    }
}
