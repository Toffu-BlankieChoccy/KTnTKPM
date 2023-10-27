package BuilderParttern.BaiA7;

public class Main {
    public static void main(String[] args) {
        Computer comp1 = new Computer.Builder()
                .setCPU("wewewe")
                .setRam("wewewewe")
                .setScreen("wewewewe")
                .setHotDisk("wewewewewe")
                .build();

        System.out.println(comp1);
    }
}
