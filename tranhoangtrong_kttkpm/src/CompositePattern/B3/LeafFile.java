package CompositePattern.B3;

public class LeafFile implements Component{
    private String tenFile;
    private String ngayTao;




    public LeafFile(String tenFile, String ngayTao) {
        this.tenFile = tenFile;
        this.ngayTao = ngayTao;
    }

    @Override
    public String getStringTreeFolder() {
        return tenFile;
    }

    @Override
    public String getPath() {
            return tenFile;
    }
}
