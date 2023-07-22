import java.util.Scanner;

public class Book {
    private long isbn;
    private String title;
    private String category;
    private String author;

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
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public void addBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add a new book");

        System.out.print("Enter the ISBN: ");
        String newIsbn = scanner.nextLine();
        setIsbn(Long.parseLong(newIsbn));

        System.out.print("Enter the title: ");
        String newTitle = scanner.nextLine();
        setTitle(newTitle);

        System.out.print("Enter the category");
        String newCategory = scanner.nextLine();
        setTitle(newCategory);

        System.out.print("Enter the author");
        String newAuthor = scanner.nextLine();
        setTitle(newAuthor);
    }

    public void updateBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Update an existing book");
    }

}
