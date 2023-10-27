package behaviour.strategy.BaiCC1;

public class Nhan implements Tinh{
    @Override
    public float Tinh(float a, float b) {
        return Float.parseFloat(String.valueOf(a*b));
    }
}
