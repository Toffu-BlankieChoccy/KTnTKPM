package BuilderParttern.BaiA1;

public class CTHD {
    private String sanpham;
    private int solg;
    private float dongia,ckhau;

    public CTHD(String sanpham, int solg, float dongia, float ckhau) {
        this.sanpham = sanpham;
        this.solg = solg;
        this.dongia = dongia;
        this.ckhau = ckhau;
    }

    @Override
    public String toString() {
        return
                "Tên sản phẩm: " + sanpham +"\n" +
                "Số lượng: " + solg + "\n" +
                "Đơn giá: " + dongia + "\n" +
                "Chiết khấu: " + ckhau ;
    }
}
