package BaiTapCD2;

public class MainEnityDB63 {
    public static void main(String[] args) {
        EntityDB63<SinhVien> qlsv = new SinhVienDB();
        qlsv.add(new SinhVien(1,"Trong","12/12/1212", "Thanh Hoa"));
        qlsv.add(new SinhVien(2,"Superb","11/12/1212", "Can Tho"));
        qlsv.add(new SinhVien(3,"Greavaer","13/12/1212", "Quang Ninh"));
        qlsv.add(new SinhVien(4,"Grape","13/22/1212", "India"));
        qlsv.printInfo();
    }
}
