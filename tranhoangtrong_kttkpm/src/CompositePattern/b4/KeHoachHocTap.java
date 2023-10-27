package CompositePattern.b4;

public abstract class KeHoachHocTap {
    String name;
    public KeHoachHocTap(String name) {
        this.name = name;
    }

    public abstract void Add(KeHoachHocTap k);
    public abstract void Remove(KeHoachHocTap k);
    public abstract int getHocPhi();
    public abstract int getSoTC();
}
