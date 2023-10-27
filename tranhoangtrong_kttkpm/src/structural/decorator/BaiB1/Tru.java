package structural.decorator.BaiB1;

public class Tru extends BieuThucDecorator{
    public Tru(BieuThuc bieuThuc) {
        super(bieuThuc);
    }
    private float toanHang;

    public Tru(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri()-toanHang;
    }

    @Override
    public String BieuThuc() {
        return bieuThuc.BieuThuc() + "-" + this.toanHang;
    }
}
