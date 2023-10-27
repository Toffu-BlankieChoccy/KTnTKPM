package ObserverPattern.TiGia;

import java.util.ArrayList;
import java.util.List;

public class TiGia63 {
    List<ITheoDoiTiGia> observers = new ArrayList<>();
    public void attach(ITheoDoiTiGia observer)
    {   if(!observers.contains(observer))
            observers.add(observer);

    }public void detach(ITheoDoiTiGia observer)
    {   if(observers.contains(observer))
            observers.remove(observer);
    }

    public void notifyTiGia(float delta){
        for(var obs: observers){
            obs.capNhat(delta);
        }
    }
    public static interface ITheoDoiTiGia{
        void capNhat(float delta);

    }
}
