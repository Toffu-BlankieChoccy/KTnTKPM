package CompositePattern.RedoB4;

public class MonHoc implements Component{
    private int soTinChi;
    private String tenMonHoc;
    private int chiPhi;

    public MonHoc(int soTinChi, String tenMonHoc, int chiPhi) {
        this.soTinChi = soTinChi;
        this.tenMonHoc = tenMonHoc;
        this.chiPhi = chiPhi;
    }


    @Override
    public void Display() {
        System.out.println("Tên môn học: "+tenMonHoc+" Số tín chỉ: "+soTinChi+" Chi phí: "+chiPhi);
    }
}
