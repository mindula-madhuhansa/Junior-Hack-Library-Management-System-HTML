import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    private static ArrayList<Book> bookList = new ArrayList<Book>();
    static Book newBook = new Book();

    public static void main(String[] args) {
        System.out.println("Welcome to HTML library management system UoK!");
        boolean isLooping = true;
        while (isLooping){
            System.out.println();
            System.out.println("Please choose an option:");
            System.out.println("1. Add a new book.");
            System.out.println("2. Update an existing book.");
            System.out.println("3. Remove an book.");
            System.out.println("4. Lend a book.");
            System.out.println("5. Return a book.");
            System.out.println("6. List all available books.");
            System.out.println("7. Exit.");
            System.out.println();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int inputNum = scanner.nextInt();

            switch (inputNum) {
                case 1:
                    addBook();
                    break;

                case 2:
                    updateBook();
                    break;

                case 3:
                    removeBook();
                    break;

                case 4:
                    lendBook();
                    break;

                case 5:
                    returnBook();
                    break;

                case 6:
                    listAllBooks();
                    break;

                case 7:
                    System.out.println("Thank you for using HTML library management system UoK!");
                    isLooping = false;
                    break;

                default:
                    System.out.println("Enter a valid option");
                    isLooping = false;
                    break;

            }
        }

    }


    public static void addBook(){
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
        book.setCategory(newCategory);

        System.out.print("Enter the author: ");
        String newAuthor = scanner.nextLine();
        book.setAuthor(newAuthor);

        bookList.add(book);

//        BookSQL.insertBook(book);
    }


    public static void updateBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Update an existing book");
        System.out.print("Enter the ISBN that need to update: ");
        long isbnU = scanner.nextLong();
        System.out.println(bookList.size());
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getIsbn() == isbnU){
                System.out.println("Update the book: ");

                System.out.println("Enter the new Title " + bookList.get(i).getTitle() + ": ");
                String updatedTitle = scanner.nextLine();
                newBook.setTitle(updatedTitle);

                System.out.println("Enter the new Category " +bookList.get(i).getCategory() + ": ");
                String updatedCategory = scanner.nextLine();
                newBook.setCategory(updatedCategory);

                System.out.println("Enter the new Author " + bookList.get(i).getAuthor() + ": ");
                String updatedAuthor = scanner.nextLine();
                newBook.setAuthor(updatedAuthor);

            }else{
                System.out.println("Wrong ISBN");
            }

        }



    }

    public static void removeBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Remove an existing book");

        System.out.print("Enter the ISBN: ");
        long isbnRemove = scanner.nextLong();
        if (newBook.getIsbn() == isbnRemove){
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

    public static void lendBook(){
        Book lendBook = new Book();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lending a book");

        System.out.print("Enter the ISBN: ");
        long isbnLend = scanner.nextLong();
        if (isbnLend ==  newBook.getIsbn()){
            System.out.println("Can proceed the lending process");
        }
        else {
            System.out.println("This book is not available right now.");
        }


    }

    public static void returnBook(){
        Book returnBook = new Book();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Return a book");

        System.out.print("Enter the ISBN: ");
        long isbnReturn = scanner.nextLong();
        if (isbnReturn == newBook.getIsbn()){
            System.out.println("Book returned successfully");
        }
        else {
            System.out.println("Enter a valid ISBN");
        }

    }

    public static void listAllBooks(){
        System.out.println("List all available books");
        // list all book function
    }
}