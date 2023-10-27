package structural.decorator.clc_bieuthuc;

public class Chia extends BieuThucDecorator{
    float toanHang;

    public Chia(BieuThuc bieuThuc,float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return super.giaTri()/toanHang;
    }

    @Override
    public String bieuThuc() {
        return super.bieuThuc()+ " / " + toanHang;
    }
}
