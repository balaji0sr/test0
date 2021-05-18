package jdbc;
import java.sql.*;

public class InsertJDBC {
	
	
	public static void main(String args[]) 
    { 
        String name = "ramya"; 
        String age = "21"; 
        String gender = "female"; 
          
        try
        { 
        	String dbDriver = "com.mysql.jdbc.Driver";
        	String dbURL = "jdbc:mysql://127.0.0.1:3306/";

        	// Database name to access
        	String dbName = "balaji?characterEncoding=latin1";
        	String dbUsername = "balaji";
        	String dbPassword = "Aa@1mysql";

        	Class.forName(dbDriver);

        	Connection con = DriverManager.getConnection((dbURL + dbName), dbUsername, dbPassword);

            Statement stmt = con.createStatement(); 
            String q1 = "insert into test (name ,age , gender ) values('" + name +  "', " + age + ", '" + gender + "')";
           // System.out.println(q1);
 //String q1 = "delete from list2 where id = 10"; 
           // String q1 = "UPDATE list2 set age = 84 where id = 1  AND gender = 'm'"; 
            //boolean b = stmt.execute(q1);
            //stmt.execute(q1); 
            String q = "select * from test " ;

            ResultSet rs=stmt.executeQuery("select name , age from test where age = 23" );  

            boolean rsloop = false;
            	while (rs .next()) {
            		rsloop = true;
                    System.out.println(rs.getString(1)+ "  "+rs.getInt(2));             
            	}
             if (rsloop == false)         
                System.out.println("Insert Failed"); 
          
            con.close(); 
        } 
        catch(Exception e) 
        { 
            System.out.println(e); 
        } 
    } 
}
