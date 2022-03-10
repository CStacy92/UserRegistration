package userRegistration;

import java.util.Scanner;

public class FrontEndUI {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("What would you like to do?");
		System.out.println(
				"1. Create New Customer \n 2. Update Customer Info \n 3. Delete Customer \n 4. Display All Current Customers");
		System.out.println("\n Enter number for desired action: ");
		int selection = s.nextInt();
		s.nextLine();
		
		switch(selection) {
		case (1):
			Customer c = new Customer();
			System.out.println("Enter Customer First Name:");
			c.setfName(s.nextLine());
			System.out.println("Enter Customer Last Name:");
			c.setLname(s.nextLine());
			System.out.println("Enter Customer Age:");
			c.setAge(s.nextInt());
			s.nextLine();
			System.out.println("Enter Customer Email:");
			c.setEmail(s.nextLine());
			System.out.println("Enter Ten Digit Customer Phone Number:");
			c.setPhoneNumber(s.nextLine());
			System.out.println("Enter Customer Username:");
			c.setUserName(s.nextLine());
			break;
		case(2):
			break;
		case(3):
			break;
		case(4):
			break;
		}
		
		
		


	}

}
