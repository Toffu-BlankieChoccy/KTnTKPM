package ObserverPattern.ATM;

public class mainATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan tk1 = new TaiKhoan();
        atm.setTaiKhoan(tk1);
        tk1.setSoDu(5000);
        atm.rutTien(400);
    }
}
