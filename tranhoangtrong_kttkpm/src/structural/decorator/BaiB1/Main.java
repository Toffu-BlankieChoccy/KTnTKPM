package structural.decorator.BaiB1;

public class Main {
    public static void main(String[] args) {
        BieuThuc bieuThuc = new BieuThucDonGian(5);
        bieuThuc = new Cong(bieuThuc,5);
        bieuThuc = new Tru(bieuThuc,10);
        bieuThuc = new Nhan(bieuThuc,2);
        bieuThuc = new Chia(bieuThuc,2);
        System.out.println(bieuThuc.BieuThuc()+ "=" + bieuThuc.giaTri());
    }
}
