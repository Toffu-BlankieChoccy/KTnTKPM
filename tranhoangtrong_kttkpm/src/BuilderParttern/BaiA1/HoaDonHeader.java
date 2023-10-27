package BuilderParttern.BaiA1;

public class HoaDonHeader {
    private String ma,ten,ngay;

    public HoaDonHeader(String ma, String ten, String ngay) {
        this.ma = ma;
        this.ten = ten;
        this.ngay = ngay;
    }

    @Override
    public String toString() {
        return
                "Mã hóa đơn: " + ma + "\n" +
                "Ngày bán: " + ten + '\n' +
                "Tên khách hàng: " + ngay + '\n';
    }
}
