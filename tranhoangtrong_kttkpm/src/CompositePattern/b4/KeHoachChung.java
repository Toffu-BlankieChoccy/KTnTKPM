package CompositePattern.b4;
import java.util.List;
import java.util.ArrayList;

public class KeHoachChung extends KeHoachHocTap{
    List<KeHoachHocTap> list = new ArrayList<>();
    public KeHoachChung(String name) {
        super(name);
    }

    @Override
    public void Add(KeHoachHocTap k) {
        list.add(k);
    }

    @Override
    public void Remove(KeHoachHocTap k) {
        list.remove(k);
    }

    @Override
    public int getHocPhi() {
        int total = 0;
        for(KeHoachHocTap k: list)
        {
            total+=k.getHocPhi();
        }
        return total;
    }

    @Override
    public int getSoTC() {
        int total = 0;
        for(KeHoachHocTap k : list)
        {
            total+=k.getSoTC();
        }
        return total;
    }
}
