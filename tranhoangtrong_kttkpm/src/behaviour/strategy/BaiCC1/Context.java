package behaviour.strategy.BaiCC1;

public class Context {
    private Tinh tinhToan;

    public void setTinhToan(Tinh tinhToan) {
        this.tinhToan = tinhToan;
    }

    public float tinh(float a, float b){
        return tinhToan.Tinh(a,b);
    }
}
