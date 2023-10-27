package BaiTapCD2;

public class SinhVienDB extends EntityDB63<SinhVien>{
    @Override
    protected int getKey(SinhVien sinhVien) {
        return sinhVien.getMaSV();
    }
}
