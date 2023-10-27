package CompositePattern.QuanLyTepTin;

import java.util.Arrays;
import java.util.List;

public class ClientMain {
    public static void main(String[] args) {
        long temp=0;
        IFileComponent file1 = new FileLeaf("File 1",123);
        IFileComponent file2 = new FileLeaf("File 2",1);
        IFileComponent file3 = new FileLeaf("File 3",13);


        List<IFileComponent> files = Arrays.asList(file1, file2, file3);
        IFileComponent folder = new FolderComposite(files);
        folder.showProperty();
        temp = folder.totalSize();
        System.out.println("Total size: " + temp);

    }
}
