import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to HTML library management system UoK!");
        menuMethod();

    }

    public static void menuMethod() {
        System.out.println("Please choose an option:");
        System.out.println("1. Add a new book.");
        System.out.println("2. Update an existing book.");
        System.out.println("3. Remove an book.");
        System.out.println("4. Lend a book.");
        System.out.println("5. Return a book.");
        System.out.println("6. List all available books.");
        System.out.println("7. Exit.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int inputNum = scanner.nextInt();

        switch (inputNum) {
            case 1:
                Book newBook = new Book();
                newBook.addBook();
                newBook.toString();
                break;
//
//            case 2:
//                updateBook();
//                break;
//
//            case 3:
//                removeBook();
//                break;
//
//            case 4:
//                lendBook();
//                break;
//
//            case 5:
//                returnBook();
//                break;
//
//            case 6:
//                listAllBook();
//                break;
//
//            case 7:
//                //add exit code
//                break;

            default:
                // keep looping
                break;

        }
    }
}