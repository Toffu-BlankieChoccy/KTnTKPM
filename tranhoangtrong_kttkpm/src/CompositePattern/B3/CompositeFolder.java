package CompositePattern.B3;

import java.util.ArrayList;
import java.util.List;

public class CompositeFolder implements Component{
    private String tenFile;
    private String ngayTao;

    private List<Component> components = new ArrayList<>();

    public CompositeFolder(String tenFile, String ngayTao) {
        this.tenFile = tenFile;
        this.ngayTao = ngayTao;
    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder tree = new StringBuilder(tenFile + "\n");

        for (Component item : components) {
            tree.append("--").append(item.getStringTreeFolder()).append("\n");
        }

        return tree.toString();
    }

    @Override
    public String getPath() {
            return tenFile;  // Root folder
    }

    public void addItem(Component component){
        components.add(component);
    }

    public void removeItem(Component component){
        components.remove(component);
    }
}
