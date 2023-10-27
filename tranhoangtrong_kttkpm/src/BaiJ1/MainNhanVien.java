package BaiJ1;

public class MainNhanVien {
    public static void main(String[] args)
    {
        NhanVien nv1 = new NhanVien("Moles", 20, "Nha Trang", 500000, 110);
        NhanVien nv2 = new NhanVien("Guiliuotino", 28, "Viet", 1200000, 300);
//        System.out.println(nv1.getThongTin());
//        System.out.println("\n/////////////\n");
//        System.out.println(nv2.getThongTin());

        QuanLyNhanVien ql = new QuanLyNhanVien();
        ql.them(nv1);
        ql.them(nv2);
        ql.inDS();
    }
}
