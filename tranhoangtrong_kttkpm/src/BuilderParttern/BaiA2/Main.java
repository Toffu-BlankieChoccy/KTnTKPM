package BuilderParttern.BaiA2;

public class Main {
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder();
        myStringBuilder.addString("we");
        myStringBuilder.addFloat(3.2f);
        myStringBuilder.addBool(true);

        System.out.println(myStringBuilder);

    }
}
