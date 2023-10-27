package BuilderParttern.BaiA5;

public class BookTitle {
    private String tenSach, tacGia;
    private int soTrang;

    @Override
    public String toString() {
        return "BookTitle{" +
                "tenSach='" + tenSach + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", soTrang=" + soTrang +
                '}';
    }

    public BookTitle(String tenSach, String tacGia, int soTrang) {
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.soTrang = soTrang;
    }
}
