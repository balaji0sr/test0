package jdbc;

import java.util.Scanner;
import java.sql.*;

public class JDBCTest3 {
	public static void main(String args[]) {
		Scanner update = new Scanner(System.in);

		
		System.out.println("driver id");
		int driver_id = update.nextInt();
		
		System.out.println("bus id");
		int bus_id = update.nextInt();
		
		System.out.println("route id");
		int route_id = update.nextInt();
		
		System.out.println("trip date and time");
		String start_time = update.next();
		
		System.out.println("no of pasengers");
		int noof_pasengers = update.nextInt();
		

		String sql = "insert into trip_info values(" + driver_id + "," + bus_id
				+ "," + route_id + ",'" + start_time + "'," + noof_pasengers
				+ ")";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/balaji", "root", "root");
			Statement st = con.createStatement();
			int m = st.executeUpdate(sql);
			
			if (m == 1)
				System.out.println("inserted successfully : " + sql);
			else
				System.out.println("insertion failed");
			con.close();
			
			
		} catch (Exception e) {

		}

	}
}
