package userRegistration;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerDAO {
	private static boolean customerExists;
	private static ArrayList<Customer> customers = new ArrayList<Customer>();

	public static ArrayList<Customer> getCustomers() {
		return customers;
	}

	// Add customer to customer list
	public static void addCustomer(Customer c) {
		DatabaseConnection.addCustomer(c.getfName(), c.getLname(), c.getAge(), c.getPhoneNumber(), c.getEmail(), c.getUserName());
	}

	// Update customer info
	public static void updatePhone(Customer c) {
		System.out.println("Enter new phone number for " + c.getfName());
		Scanner s = new Scanner(System.in);
		c.setPhoneNumber(s.nextLine());
		s.close();
	}

	public static void updateEmail(Customer c) {
		System.out.println("Enter new email for " + c.getfName());
		Scanner s = new Scanner(System.in);
		c.setEmail(s.nextLine());
		s.close();
	}

	public static void updateAge(Customer c) {
		System.out.println("Enter new age for " + c.getfName());
		Scanner s = new Scanner(System.in);
		c.setAge(s.nextInt());
		s.close();
	}

	public static void updateLname(Customer c) {
		System.out.println("Enter new last name for " + c.getfName());
		Scanner s = new Scanner(System.in);
		c.setLname(s.nextLine());
		s.close();
	}

	public static void updateUsername(Customer c) {
		System.out.println("Enter new username for " + c.getfName());
		Scanner s = new Scanner(System.in);
		c.setUserName(s.nextLine());
		s.close();
	}

	public static void updateFname(Customer c) {
		System.out.println("Enter new first name for " + c.getfName());
		Scanner s = new Scanner(System.in);
		c.setfName(s.nextLine());
		s.close();
	}

	public static void deleteCustomer(Customer c) {
		customers.remove(c);
	}

	public static boolean isCustomer(String first, String last) {
		for (Customer c : customers) {
			if ((c.getfName() == first) && (c.getLname() == last)) {
				customerExists = true;
			} else {
				customerExists = false;
			}
		}
		return customerExists;
	}

}
