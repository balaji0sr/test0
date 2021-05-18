package ticketbookingapp;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException;
public class DBConnection {

	public static Connection initializeDatabase() throws SQLException, ClassNotFoundException  {
		String dbDriver = "com.mysql.jdbc.Driver"; 
        String dbURL = "jdbc:mysql:// localhost:3306/"; 
        // Database name to access 
        String dbName = "ticket_booking"; 
        String dbUsername = "root"; 
        String dbPassword = "root"; 
  
        Class.forName(dbDriver); 
        Connection con = DriverManager.getConnection(dbURL + dbName, 
                                                     dbUsername,  
                                                     dbPassword); 
        return con; 
	}

}
