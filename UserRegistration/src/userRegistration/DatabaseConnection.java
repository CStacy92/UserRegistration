package userRegistration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

	private static String sql;

	public static Connection connect() {
		final String DB_URL = "jdbc:mysql://testdatabase.cqrfjzcfwcwz.us-east-1.rds.amazonaws.com:3306/awsdb";
		final String USER = "admin";
		final String PASS = "admin123";

		Connection conn = null;

		try {
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;

	}

	public static void addCustomer(String fname, String lname, int age, String Phonenum, String email,
			String username) {
		Connection con = DatabaseConnection.connect();
		try {
			Statement stmt = con.createStatement();

			sql = "INSERT INTO Customers (Username,FirstName,LastName,Age,PhoneNumber,Email) VALUES ('" + username
					+ "', '" + fname + "','" + lname + "'," + age + ",'" + Phonenum + "','" + email + "');";
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void showAll() {
		Connection con = DatabaseConnection.connect();
		try {
			Statement stmt = con.createStatement();
			sql = "SELECT* FROM Customers;";
			ResultSet rs = stmt.executeQuery(sql);
			int col = rs.getMetaData().getColumnCount();

			while (rs.next()) {
				for (int i = 1; i <= col; i++) {
					if (i > 1) {
						System.out.print(", ");
					}
					System.out.print(rs.getString(i));
				}
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
	
	public static void updateFname(String user, String newFname) {
		Connection con = DatabaseConnection.connect();
		try {
			Statement stmt = con.createStatement();
			sql = "UPDATE Customers SET FirstName = '" + newFname + "' WHERE Username = '" + user +"';";
			stmt.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();

		}
	}

	public static void updateLname(String user, String newLname) {
		Connection con = DatabaseConnection.connect();
		try {
			Statement stmt = con.createStatement();
			sql = "UPDATE Customers SET LastName = '" + newLname + "' WHERE Username = '" + user +"';";
			stmt.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
	
	public static void updateAge(String user, int newAge) {
		Connection con = DatabaseConnection.connect();
		try {
			Statement stmt = con.createStatement();
			sql = "UPDATE Customers SET Age = " + newAge + " WHERE Username = '" + user +"';";
			stmt.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
	
	public static void updateEmail(String user, String newEmail) {
		Connection con = DatabaseConnection.connect();
		try {
			Statement stmt = con.createStatement();
			sql = "UPDATE Customers SET Email = '" + newEmail + "' WHERE Username = '" + user +"';";
			stmt.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
	
	public static void updatePhoneNumber(String user, String newPhone) {
		Connection con = DatabaseConnection.connect();
		try {
			Statement stmt = con.createStatement();
			sql = "UPDATE Customers SET PhoneNumber = '" + newPhone + "' WHERE Username = '" + user +"';";
			stmt.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
	
	public static void updateUsername(String user, String newUsername) {
		Connection con = DatabaseConnection.connect();
		try {
			Statement stmt = con.createStatement();
			sql = "UPDATE Customers SET Username = '" + newUsername + "' WHERE Username = '" + user +"';";
			stmt.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
	
	public static void deleteUser(String user) {
		Connection con = DatabaseConnection.connect();
		try {
			Statement stmt = con.createStatement();
			sql = "DELETE FROM Customers WHERE Username = '" + user +"';";
			stmt.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
}
