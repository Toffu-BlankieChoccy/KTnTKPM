package ObserverPattern.ATM2;

public class ATM {
    IRutTien taiKhoan;
    public void attach(IRutTien taiKhoan)
    {
        this.taiKhoan = taiKhoan;
    }

    public void detach(IRutTien taiKhoan)
    {
        if(this.taiKhoan == taiKhoan) //Kiểm tra có thẻ rút có trùng với thẻ trong ATM
            this.taiKhoan = null;
    }

    private boolean kiemTraTienRut(int soTien){
        if(taiKhoan.kiemTraSoDu(soTien) == true)
            return true;
        else return false;
    }

    public void rutTien(int soTien){
        if(taiKhoan != null)
        {
            if(taiKhoan.kiemTraSoDu(soTien))
                taiKhoan.nhanThongBao(soTien, true);
            else
                taiKhoan.nhanThongBao(soTien, false);
        }
        else
            System.out.println("Không có thẻ trong máy");
    }
    public static interface IRutTien {
        boolean kiemTraSoDu(int tienRut);
        void nhanThongBao(int tienRut, boolean thanhCong);
    }
}
