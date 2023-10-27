package behaviour.strategy.BaiCC1;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        context.setTinhToan(new Chia());
        System.out.println(context.tinh(3f,2f));

        context.setTinhToan(new Tru());
        System.out.println(context.tinh(4f,1f));

        context.setTinhToan(new Cong());
        System.out.println(context.tinh(4f,1f));

        context.setTinhToan(new Nhan());
        System.out.println(context.tinh(4f,1f));
    }
}
