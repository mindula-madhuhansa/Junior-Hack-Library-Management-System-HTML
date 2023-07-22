import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private long isbn;
    private String title;
    private String category;
    private String author;

    private ArrayList<Book> bookList = new ArrayList<Book>();
    public Book() {
    }

    public Book(long isbn, String title, String category, String author) {
        this.isbn = isbn;
        this.title = title;
        this.category = category;
        this.author = author;
    }

    public long getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getAuthor() {
        return author;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return getIsbn() + " - " + getTitle() + " - " + getCategory() + " book" + " - " + getAuthor();
    }


}
