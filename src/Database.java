import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Database {

    private String url = "jdbc:mysql://138.49.184.206:3306/";	// URL for server
    private String dbName = "becker2280_GuitarShop";				// TODO: set to your dbName on the server
    private String username = "zoellick9794"; 						// TODO: your username on the server
    private String password; 									// your password on the server, set in constructor for privacy
    private Connection connection;								// connection object for running queries

    /**
     * Constructor for the Database class.
     * Set the password for the user in this function.
     */
    public Database() {
        password = "Rwz3tpYPRX8H8!v3"; //TODO: set this to your password
    }


    /**
     * Construct the url to connect to the database, and establish a connection.
     */
    public void connect() {
        try {
            url = url + dbName + "?";
            System.out.println(url);
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection succesful");

        } catch (SQLException e) {
            System.out.println("Cannot connect!");
            System.out.println(e);
        }
    }

    /**
     * Closes the connection with the database.
     */
    public void disconnect() {
        try {
            connection.close();
            System.out.println("Disconnected");
        } catch (SQLException e) {
            System.out.println("Cannot disconnect!");
        }
    }
}
