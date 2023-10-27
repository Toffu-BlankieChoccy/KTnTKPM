package BaiTapCD2;

public class SinhVien {
    int maSV;
    String tenSV, ngaySinh,queQuan;
    public SinhVien(int maSV, String tenSV, String ngaySinh, String queQuan) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public int getMaSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "\nmaSV=" + maSV +
                "\ntenSV='" + tenSV + '\'' +
                "\nngaySinh='" + ngaySinh + '\'' +
                "\nqueQuan='" + queQuan + '\'' +
                '}';
    }
}
