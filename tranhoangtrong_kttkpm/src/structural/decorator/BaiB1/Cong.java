package structural.decorator.BaiB1;

public class Cong extends BieuThucDecorator{
    public Cong(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    private float toanHang;

    @Override
    public float giaTri() {
        return bieuThuc.giaTri()+toanHang;
    }

    @Override
    public String BieuThuc() {
        return bieuThuc.BieuThuc() + "+" +this.toanHang;
    }
}
