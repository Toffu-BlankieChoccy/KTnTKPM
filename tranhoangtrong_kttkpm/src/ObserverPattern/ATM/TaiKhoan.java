package ObserverPattern.ATM;

public class TaiKhoan implements ATM.ITaiKhoan {
    int soDu;

    public void setSoDu(int soDu) {
        this.soDu = soDu;
    }
     public void rutTien(int soTienRut){
        soDu -= soTienRut;
     }
     public int kiemTraSoDu(){
        return soDu;
     }
    @Override
    public void notification(String notify) {
        System.out.println("Thông báo: "+ notify);
    }

    @Override
    public boolean checkTaiKhoan(int soTienRut) {
        if(kiemTraSoDu()>=soTienRut)
            return true;
        else return false;
    }
}
