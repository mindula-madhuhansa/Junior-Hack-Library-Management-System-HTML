import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public Connection databaseLink;
    public Connection getDBConnection() {

        String databaseName = "library";
        String databaseUser = "root";
        String databasePassword = "123";
        String url = "jdbc:mysql://localhost:3306/" + databaseName;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return databaseLink;
    }



}
