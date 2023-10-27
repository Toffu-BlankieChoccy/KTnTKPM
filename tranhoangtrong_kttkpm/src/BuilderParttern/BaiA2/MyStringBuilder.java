package BuilderParttern.BaiA2;

public class MyStringBuilder {
    private String str = "";

    public MyStringBuilder addString (String s)
    {
        str += s;
        return this;
    }

    public MyStringBuilder addFloat(float s)
    {
        str += s;
        return this;
    }

    public MyStringBuilder addBool(boolean b)
    {
        str+=b;
        return this;
    }

    @Override
    public String toString() {
        return "MyStringBuilder{" +
                "str='" + str + '\'' +
                '}';
    }
}
