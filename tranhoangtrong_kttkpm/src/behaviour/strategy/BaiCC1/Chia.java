package behaviour.strategy.BaiCC1;

public class Chia implements Tinh{
    @Override
    public float Tinh(float a, float b) {
        if(b==0)
            return Float.parseFloat(null);
        else return Float.parseFloat(String.valueOf(a/b));
    }
}
