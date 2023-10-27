package structural.decorator.BaiB1;

public class Chia extends BieuThucDecorator{
    private float toanHang;

    public Chia(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    public Chia(BieuThuc bieuThuc) {
        super(bieuThuc);
    }

    @Override
    public float giaTri() {
        return super.giaTri()/toanHang;
    }

    @Override
    public String BieuThuc() {
        return bieuThuc.BieuThuc()+"/"+this.toanHang;
    }
}
