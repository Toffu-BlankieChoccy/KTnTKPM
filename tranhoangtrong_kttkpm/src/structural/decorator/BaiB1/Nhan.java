package structural.decorator.BaiB1;

public class Nhan extends BieuThucDecorator{
    private float toanHang;

    public Nhan(BieuThuc bieuThuc, int toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    public Nhan(BieuThuc bieuThuc) {
        super(bieuThuc);
    }

    @Override
    public float giaTri() {
        return super.giaTri()*toanHang;
    }

    @Override
    public String BieuThuc() {
        return bieuThuc.BieuThuc()+"*"+this.toanHang;
    }
}
