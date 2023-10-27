package CompositePattern.RedoB4SecondTime;

public class Main {
    public static void main(String[] args) {
        IComponent stYear = new Composite();

        IComponent course1 = new Composite();
        IComponent course2 = new Composite();

        stYear.Add(course1);
        stYear.Add(course2);

        IComponent mon1 = new Leaf(3,20000);
        IComponent mon2 = new Leaf(3,33000);
        IComponent mon3 = new Leaf(3,12000);
        IComponent mon4 = new Leaf(3,24000);

        course1.Add(mon1);
        course1.Add(mon2);
        course2.Add(mon3);
        course2.Add(mon4);


        System.out.println("Năm 1: \n"+"Kì 1: Tổng số tín chỉ: "+course1.getTC()+" - Tổng học phí: "+course1.getHP());
        System.out.println("Năm 1: \n"+"Kì 2: Tổng số tín chỉ: "+course2.getTC()+" - Tổng học phí: "+course2.getHP());
    }
}
