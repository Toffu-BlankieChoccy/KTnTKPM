package BaiJ4;

public class ChuyenXeNoiThanh extends ChuyenXe{
    int soTuyen;
    int soNgayDi;
    String noiDen;

    public ChuyenXeNoiThanh(String maSoChuyen, String tenTX, String soXe, int doanhThu, int soTuyen, int soNgayDi, String noiDen) {
        super(maSoChuyen, tenTX, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soNgayDi = soNgayDi;
        this.noiDen = noiDen;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSo tuyen: " + soTuyen;
    }

}
