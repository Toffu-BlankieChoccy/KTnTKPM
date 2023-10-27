package CompositePattern.RedoB4SecondTime;

import java.util.ArrayList;
import java.util.List;

public class Composite extends IComponent{
    IComponent iComponent;

    List<IComponent> list = new ArrayList<>();

    @Override
    public void Add(IComponent iComponent) {
        list.add(iComponent);
    }

    @Override
    public void Remove(IComponent iComponent) {
        list.remove(iComponent);
    }

    @Override
    public int getTC() {
        int total = 0;
        for(IComponent i: list){
            total += i.getTC();
        }
        return total;

    }

    @Override
    public int getHP() {
        int total = 0;
        for(IComponent i: list)
        {
            total += i.getHP();
        }
        return total;
    }
}
