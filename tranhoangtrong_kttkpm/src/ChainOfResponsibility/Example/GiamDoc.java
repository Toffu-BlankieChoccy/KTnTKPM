package ChainOfResponsibility.Example;

public class GiamDoc implements IXuLyKhoanVay{
    String ten;
    int hanMucVay;

    public GiamDoc(String ten, int hanMucVay) {
        this.ten = ten;
        this.hanMucVay = hanMucVay;
    }

    @Override
    public IXuLyKhoanVay capCaoHon(IXuLyKhoanVay XLKhoanVay) {
        return null;
    }

    @Override
    public String xuLyVay(int tienVay) {
        if(tienVay<=hanMucVay)
            return "Giam doc "+ ten + " xu ly khoan vay";
        return "Ra ngan hang ksdf";
    }

}
