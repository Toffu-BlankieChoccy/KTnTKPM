package structural.decorator.clc_bieuthuc;

public class Cong extends BieuThucDecorator{
    float toanHang;

    public Cong(BieuThuc bieuThuc,float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return super.giaTri()+toanHang;
    }

    @Override
    public String bieuThuc() {
        return super.bieuThuc()+ " + " + toanHang;
    }
}
