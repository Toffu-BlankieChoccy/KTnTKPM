package BuilderParttern.BaiA5;

import BuilderParttern.BaiA1.HoaDon;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private BookTitle bookTitle;
    List<String> chuong = new ArrayList<>();


    public Book(Builder builder) {
        this.bookTitle = builder.bookTitle;
        this.chuong = builder.chuong;
    }
    @Override
    public String toString() {
        return "Book{" +
                "bookTitle=" + bookTitle +
                ", chuong=" + chuong +
                '}';
    }
    public static class Builder{
        private BookTitle bookTitle;
        List<String> chuong = new ArrayList<>();

        public Builder setBookTitle(String bookname, String author, int pagenum)
        {
            bookTitle = new BookTitle(bookname,author,pagenum);
            return this;
        }

        public Builder addChuong(String name)
        {
            chuong.add(name);
            return this;
        }

        public Book build(){
            return new Book(this);
        }
    }
}
