package BuilderParttern.BaiA1;

public class Main {
    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDon.Builder()
                .setHoaDon("001", "10/9/2023","Joen")
                .setCTHoaDon("Ice Cream", 1,12000, 2.3f)
                .build();

        System.out.println(hoaDon);
    }
}
