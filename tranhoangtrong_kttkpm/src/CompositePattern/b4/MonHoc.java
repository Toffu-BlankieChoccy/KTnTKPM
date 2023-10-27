package CompositePattern.b4;

public class MonHoc extends KeHoachHocTap{
    int hocPhi; //Theo TC
    int soTC;

    public MonHoc(String name) {
        super(name);
    }
    public MonHoc(String name, int hocPhi, int soTC) {
        super(name);
        this.hocPhi = hocPhi;
        this.soTC = soTC;
    }
    @Override
    public void Add(KeHoachHocTap k) {

    }

    @Override
    public void Remove(KeHoachHocTap k) {

    }

    @Override
    public int getHocPhi() {
        return soTC*hocPhi;
    }

    @Override
    public int getSoTC() {
        return soTC;
    }


}

