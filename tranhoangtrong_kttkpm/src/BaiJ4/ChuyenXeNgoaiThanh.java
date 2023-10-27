package BaiJ4;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
    public ChuyenXeNgoaiThanh(String maSoChuyen, String tenTX, String soXe, int doanhThu, double km) {
        super(maSoChuyen, tenTX, soXe, doanhThu);
        this.km = km;
    }

    double km;
    @Override
    public String toString() {
        return super.toString() + "\nSo km: "+ km;
    }
}
