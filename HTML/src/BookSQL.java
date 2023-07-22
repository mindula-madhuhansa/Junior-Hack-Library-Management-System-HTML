import java.sql.Connection;
import java.sql.PreparedStatement;
public class BookSQL {
    public void insertBook() {

    }

    public void updateBookByISBN(Book book) {

        DBConnection connection = new DBConnection();
        Connection connectDB = connection.getDBConnection();
        String query = "UPDATE library SET(title = ? ,category = ?, author = ?) WHERE isbn is equal to"+book.getIsbn()+" )";

        try {

            PreparedStatement statement = connectDB.prepareStatement(query);
            statement.setString(1,book.getTitle());
            statement.setString(2,book.getCategory());
            statement.setString(3,book.getAuthor());
            statement.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deleteBookByISBN(Book book) {
        DBConnection connection = new DBConnection();
        Connection connectDB = connection.getDBConnection();
        String query = "DELETE FROM library WHERE isbn ="+book.getIsbn()+" )";

        try {
            PreparedStatement statement = connectDB.prepareStatement(query);
            statement.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void getAllBooks(Book book) {
        DBConnection connection = new DBConnection();
        Connection connectDB = connection.getDBConnection();
        String query = "SELECT * FROM library WHERE isbn ="+book.getIsbn()+" )";

        try {
            PreparedStatement statement = connectDB.prepareStatement(query);
            statement.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
