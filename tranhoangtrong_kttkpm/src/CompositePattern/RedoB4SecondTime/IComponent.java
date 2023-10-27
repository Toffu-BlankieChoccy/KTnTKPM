package CompositePattern.RedoB4SecondTime;

public abstract class IComponent {
    public abstract void Add(IComponent iComponent);
    public abstract void Remove(IComponent iComponent);
    public abstract int getTC();
    public abstract int getHP();
}
