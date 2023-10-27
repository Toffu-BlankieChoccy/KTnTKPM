package structural.decorator.clc_bieuthuc;

public class BieuThucDonGian extends BieuThuc{
    float ToanHang;

    public BieuThucDonGian(float toanHang) {
        ToanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return ToanHang;
    }

    @Override
    public String bieuThuc() {
        return ToanHang + "";
    }
}
