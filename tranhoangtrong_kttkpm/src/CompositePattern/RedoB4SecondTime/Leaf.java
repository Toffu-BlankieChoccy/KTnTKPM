package CompositePattern.RedoB4SecondTime;

public class Leaf extends IComponent{
    int tinChi, hocPhi;

    public Leaf(int tinChi, int hocPhi) {
        this.tinChi = tinChi;
        this.hocPhi = hocPhi;
    }

    @Override
    public void Add(IComponent iComponent) {

    }

    @Override
    public void Remove(IComponent iComponent) {

    }

    @Override
    public int getTC() {
        return tinChi;
    }

    @Override
    public int getHP() {
        return hocPhi*tinChi;
    }
}
