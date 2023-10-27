package ObserverPattern.ATM2;

public class TaiKhoan implements ATM.IRutTien {
    ATM atm;
    String name;
    int soDu;

    public TaiKhoan(ATM atm, String name, int soDu) {
        this.atm = atm;
        this.name = name;
        this.soDu = soDu;
    }

    public void duaTheVaoATM(){
        atm.attach(this);
    }

    public void rutThe(){
        atm.detach(this);
    }

    @Override
    public boolean kiemTraSoDu(int tienRut) {
        if((soDu - tienRut -50) >=0)
            return true;
        return false;
    }

    @Override
    public void nhanThongBao(int tienRut, boolean thanhCong) {
        if (thanhCong) {
            System.out.println("Tài khoản: "+ name );
            System.out.println("Số dư ban đầu: " + soDu);
            System.out.println("Số tiền đã rút: " + tienRut);
            soDu -= tienRut;
            System.out.println("Số dư còn lại: " +soDu);
        }
        else
            System.out.println("Số dư không đủ để rút");
    }
}
