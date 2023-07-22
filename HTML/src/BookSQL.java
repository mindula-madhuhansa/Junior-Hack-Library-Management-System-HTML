import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookSQL {

    public void insertBook(Book book) {
        PreparedStatement psInsert = null;

        DBConnection connectNow = new DBConnection();
        Connection connectDB = connectNow.getDBConnection();

        String createNewBookQuery = "INSERT INTO record (isbn, title, category, author) VALUES (?, ?, ?, ?)";

        try {
            psInsert = connectDB.prepareStatement(createNewBookQuery);
            psInsert.setLong(1, book.getIsbn());
            psInsert.setString(2, book.getTitle());
            psInsert.setString(3, book.getCategory());
            psInsert.setString(4, book.getAuthor());
            int r = psInsert.executeUpdate();

            if(r > 0){
                System.out.println("Successfully created a Book object");

            } else {
                System.out.println("Error while Creating the Book object");

            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    public void updateBookByISBN() {

    }

    public void deleteBookByISBN() {

    }

    public void getAllBooks() {

    }
}
