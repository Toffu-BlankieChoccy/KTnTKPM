package CompositePattern.RedoB4;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    private String name;

    public Composite(String name) {
        this.name = name;
    }

    private List<Component> children = new ArrayList<>();

    public Composite(String name, List<Component> children) {
        this.name = name;
        this.children = children;
    }

    public void add(Component component){
        children.add(component);
    }
    public void remove(Component component){
        children.remove(component);
    }

    @Override
    public void Display() {
        System.out.println();
        for(Component child: children)
        {
            child.Display();
        }
    }
}
