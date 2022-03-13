package userRegistration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	public static void main(String[] args) {
		final String DB_URL = "jdbc:mysql://testdatabase.cqrfjzcfwcwz.us-east-1.rds.amazonaws.com:3306/awsdb";
		final String USER = "admin";
		final String PASS = "admin123";
		
		Connection conn = null;
		
		try {
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			if (!(conn == null)) {
				System.out.println("Connected");
			}
			else {System.out.println("Not Connected");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		

	}

}
