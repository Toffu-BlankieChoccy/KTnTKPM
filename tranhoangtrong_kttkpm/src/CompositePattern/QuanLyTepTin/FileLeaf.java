package CompositePattern.QuanLyTepTin;

public class FileLeaf implements IFileComponent{

    private String name;
    private long size;

    public FileLeaf(String name, long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showProperty() {
        System.out.println("File leaf name: " + name + "\nFile leaf size: " + size);
    }

    @Override
    public long totalSize() {
        return size;
    }
}
