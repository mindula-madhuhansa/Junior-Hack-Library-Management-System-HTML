import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to HTML library management system UoK!");
        boolean isLooping = true;
        while (isLooping){
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

            Book newBook = new Book();
            switch (inputNum) {
                case 1:
                    newBook.addBook();
                    break;

                case 2:
                    newBook.updateBook();
                    break;

                case 3:
                    newBook.removeBook();
                    break;

                case 4:
                    newBook.lendBook();
                    break;

                case 5:
                    newBook.returnBook();
                    break;

                case 6:
                    newBook.listAllBooks();
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
}