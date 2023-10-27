package BuilderParttern.BaiA5;

public class Main {
    public static void main(String[] args) {
        Book book = new Book.Builder()
                .setBookTitle("SEES","Makoto",299)
                .addChuong("Vol1")
                .addChuong("Vol2")
                .addChuong("Vol3")
                .build();
        System.out.println(book);

    }
}
