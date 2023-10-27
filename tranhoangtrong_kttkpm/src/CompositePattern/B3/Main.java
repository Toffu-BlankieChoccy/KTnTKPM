package CompositePattern.B3;

import CompositePattern.RedoB4.Composite;

public class Main {
    public static void main(String[] args) {
        CompositeFolder CD = new CompositeFolder("Data(D:)", "1/1/2000");
        CompositeFolder folderDesignPattern = new CompositeFolder("Design Pattern", "2/2/2000");
        CompositeFolder folderLapTrinhJava = new CompositeFolder("Lập trình Java", "2/2/2000");
        CompositeFolder folderLapTrinhAndroid = new CompositeFolder("Lập trình Android", "2/2/2000");
        CD.addItem(folderDesignPattern);
        CD.addItem(folderLapTrinhJava);
        CD.addItem(folderLapTrinhAndroid);

        LeafFile file1 = new LeafFile("CreationalPattern.pptx", "4/2/2000");
        LeafFile file2 = new LeafFile("StructuralPattern.pptx", "5/2/2000");
        folderDesignPattern.addItem(file1);
        folderDesignPattern.addItem(file2);

        LeafFile file3 = new LeafFile("LapTrinhJavaCoBan.docx", "6/2/2000");
        LeafFile file4 = new LeafFile("LapTrinhJavaNangCao.pdf", "7/2/2000");
        folderLapTrinhJava.addItem(file3);
        folderLapTrinhJava.addItem(file4);

        LeafFile file5 = new LeafFile("CoBan.pptx", "6/2/2000");
        LeafFile file6 = new LeafFile("NangCao.pptx", "7/2/2000");
        folderLapTrinhAndroid.addItem(file5);
        folderLapTrinhAndroid.addItem(file6);


        System.out.println(CD.getStringTreeFolder());

        System.out.println(file5.getPath());



    }
}
