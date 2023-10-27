package CompositePattern.RedoB4;

import javax.security.auth.Subject;

// Client code
public class Main {
    public static void main(String[] args) {
        Composite course = new Composite("");

        Composite stYear = new Composite("");
        Composite ndYear = new Composite("");
        course.add(stYear);
        course.add(ndYear);

        Composite semester1 = new Composite("");
        Composite semester2 = new Composite("");
        Composite semester3 = new Composite("");
        Composite semester4 = new Composite("");
        stYear.add(semester1);
        stYear.add(semester2);
        ndYear.add(semester3);
        ndYear.add(semester4);


        MonHoc monHoc1 = new MonHoc(3,"QLDA",1000000);
        MonHoc monHoc2 = new MonHoc(3,"ANDROID",1000000);
        MonHoc monHoc3 = new MonHoc(2,"HCM",1000000);
        MonHoc monHoc4 = new MonHoc(4,"WEB1",1000000);
        MonHoc monHoc5 = new MonHoc(3,"TA",1000000);
        MonHoc monHoc6 = new MonHoc(3,"TQ",1000000);
        MonHoc monHoc7 = new MonHoc(3,"HQ",1000000);
        MonHoc monHoc8 = new MonHoc(3,"BRUH",1000000);

        System.out.print("Năm 1: ");
        semester1.add(monHoc1);
        semester1.add(monHoc2);
        semester2.add(monHoc3);
        semester2.add(monHoc4);
        stYear.Display();

        System.out.println("\n");

        System.out.print("Năm 2: ");
        semester3.add(monHoc5);
        semester3.add(monHoc6);
        semester4.add(monHoc7);
        semester4.add(monHoc8);
        ndYear.Display();



    }
}

