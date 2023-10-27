package CompositePattern.b4;

public class Main {
    public static void main(String[] args) {
        KeHoachHocTap khoahoc = new KeHoachChung("");
        KeHoachHocTap stYear = new KeHoachChung("");
        KeHoachHocTap ndYear = new KeHoachChung("");
        KeHoachHocTap ss1 = new KeHoachChung("");
        KeHoachHocTap ss2 = new KeHoachChung("");
        KeHoachHocTap ss3 = new KeHoachChung("");
        KeHoachHocTap ss4 = new KeHoachChung("");
        KeHoachHocTap magic = new MonHoc("Magic", 1212,5);
        KeHoachHocTap toan = new MonHoc("Tác động vật lý",12,2);
        KeHoachHocTap van = new MonHoc("Pháp lý liên hoàn",30,5);
        KeHoachHocTap noodle = new MonHoc("Noodle", 15,3);

        stYear.Add(ss1);
        stYear.Add(ss2);
        ndYear.Add(ss3);
        ndYear.Add(ss4);

        ss1.Add(toan);
        ss2.Add(van);
        ss3.Add(magic);
        ss4.Add(noodle);

        System.out.println("Năm 1: \nKì 1:\nMôn học: " + toan.name + "\nHọc phí: " + toan.getHocPhi());
        System.out.println("Năm 1: \nKì 2:\nMôn học: " + van.name + "\nHọc phí: " + van.getHocPhi() + "\n");
        System.out.println("Năm 2: \nKì 1:\nMôn học: " + magic.name + "\nHọc phí: " + magic.getHocPhi());
        System.out.println("Năm 2: \nKì 2:\nMôn học: " + noodle.name + "\nHọc phí: " + toan.getHocPhi()+ "\n");

    }
}
