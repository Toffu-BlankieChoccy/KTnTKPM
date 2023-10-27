package ObserverPattern.ATM;

public class ATM {
    ITaiKhoan taiKhoan;

    public void setTaiKhoan(ITaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public void rutTien(int soTienRut){
        if(taiKhoan == null)
            System.out.println("Không tìm thấy thẻ!");
        else{
            if(taiKhoan.checkTaiKhoan(soTienRut))
                taiKhoan.notification("Rút tiền thành công. Số dư tài khoản: " + (taiKhoan.kiemTraSoDu() - soTienRut));
            else taiKhoan.notification("Rút tiền thất bại. Số dư tài khoản không đủ.");
        }
    }


    interface ITaiKhoan{
        void notification(String notify);
        boolean checkTaiKhoan (int soTienRut);
        int kiemTraSoDu();
    }

}
