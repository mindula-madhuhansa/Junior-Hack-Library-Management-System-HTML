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

    public void addBook(){
        Book book = new Book();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add a new book");

        System.out.print("Enter the ISBN: ");
        String newIsbn = scanner.nextLine();
        book.setIsbn(Long.parseLong(newIsbn));

        System.out.print("Enter the title: ");
        String newTitle = scanner.nextLine();
        book.setTitle(newTitle);

        System.out.print("Enter the category: ");
        String newCategory = scanner.nextLine();
        book.setTitle(newCategory);

        System.out.print("Enter the author: ");
        String newAuthor = scanner.nextLine();
        book.setTitle(newAuthor);

//        BookSQL.insertBook(book);
    }

    public void updateBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Update an existing book");
        System.out.print("Enter the ISBN that need to update: ");
        long isbnU = scanner.nextLong();
        if (getIsbn() == isbnU){
            System.out.println("Update the book: ");

            System.out.println("Enter the new Title " + getTitle() + ": ");
            String updatedTitle = scanner.nextLine();
            setTitle(updatedTitle);

            System.out.println("Enter the new Category " + getCategory() + ": ");
            String updatedCategory = scanner.nextLine();
            setCategory(updatedCategory);

            System.out.println("Enter the new Author " + getAuthor() + ": ");
            String updatedAuthor = scanner.nextLine();
            setAuthor(updatedAuthor);

        }


    }

    public void removeBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Remove an existing book");

        System.out.print("Enter the ISBN: ");
        long isbnRemove = scanner.nextLong();
        if (getIsbn() == isbnRemove){
            System.out.println("Are you sure you want to remove this book? (Y/N)");
            String confirmation = scanner.nextLine();
            switch (confirmation){
                case "Y":
                    // do the removing
                    break;
                case "N":
                    // cancel the process
                    break;
                default:
                    System.out.println("Enter a valid option (Y/N)");
                    break;
            }
        }

    }

    public void lendBook(){
        Book lendBook = new Book();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lending a book");

        System.out.print("Enter the ISBN: ");
        long isbnLend = scanner.nextLong();
        if (isbnLend == getIsbn()){
            System.out.println("Can proceed the lending process");
        }
        else {
            System.out.println("This book is not available right now.");
        }


    }

    public void returnBook(){
        Book returnBook = new Book();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Return a book");

        System.out.print("Enter the ISBN: ");
        long isbnReturn = scanner.nextLong();
        if (isbnReturn == getIsbn()){
            System.out.println("Book returned successfully");
        }
        else {
            System.out.println("Enter a valid ISBN");
        }

    }

    public void listAllBooks(){
        // list all book function
    }

}
