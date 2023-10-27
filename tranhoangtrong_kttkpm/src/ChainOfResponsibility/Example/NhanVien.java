package ChainOfResponsibility.Example;

public class NhanVien implements IXuLyKhoanVay{
    IXuLyKhoanVay capCaoHon;
    String ten, chucVu;
    int hanMucNV;

    public NhanVien(String ten, String chucVu, int hanMucNV) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.hanMucNV = hanMucNV;
    }

    @Override
    public IXuLyKhoanVay capCaoHon(IXuLyKhoanVay XLKhoanVay) {
        capCaoHon = XLKhoanVay;
        return XLKhoanVay;
    }

    @Override
    public String xuLyVay(int tienVay) {
        if(tienVay <= hanMucNV)
        {
            return "Chuc vu: " + chucVu + " Ten: " + ten + "xu ly khoan vay";
        }
        else return capCaoHon.xuLyVay(tienVay);
    }
}
