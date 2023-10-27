package ObserverPattern.TiGia;

public class TiGiaMain {
    public static void main(String[] args) {
        TiGia63 tiGia63 = new TiGia63();
        NhaDauTuA nhaDauTuA = new NhaDauTuA(tiGia63);
        NhaDauTuB nhaDauTuB = new NhaDauTuB(tiGia63);
        System.out.println("Lần 1");
        tiGia63.notifyTiGia(2.0F);
        System.out.println("Lần 2");
        nhaDauTuB.huyDangKy();
        tiGia63.notifyTiGia((-2));
    }
}
