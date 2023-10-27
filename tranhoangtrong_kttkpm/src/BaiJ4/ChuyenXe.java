package BaiJ4;
//- Chuyến xe nội thành: Mã số chuyến, Họ tên tài xế, số xe, số tuyến, số km đi được, doanh
//        thu.
//        - Chuyến xe ngoại thành: Mã số chuyến, Họ tên tài xế, số xe, nơi đến, số ngày đi, doanh thu.
public class ChuyenXe {
    String maSoChuyen, tenTX, soXe;
    int doanhThu;
    public ChuyenXe(String maSoChuyen, String tenTX, String soXe, int doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.tenTX = tenTX;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }
}
