package ObserverPattern.ATM2;

public class ATMMain {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan tk1 = new TaiKhoan(atm, "John", 200000);
        TaiKhoan tk2 = new TaiKhoan(atm, "Josh", 100000);
        TaiKhoan tk3 = new TaiKhoan(atm, "Lewis", 30);

        System.out.println("Giao dịch lần 1: ");

        tk1.duaTheVaoATM();
        atm.rutTien(200);
        tk1.rutThe();

        System.out.println("Giao dịch lần 2: ");
        atm.rutTien(22);

        System.out.println("Giao dịch lần 3: ");
        tk3.duaTheVaoATM();
        atm.rutTien(10);
        tk3.rutThe();
    }
}
