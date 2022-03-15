package userRegistration;
import java.util.Scanner;

public class FrontEndUI {

	public static void main(String[] args) {
		
		int selection = 1;
		while(selection != 0) {
			Scanner s = new Scanner(System.in);
			System.out.println("What would you like to do?");
			System.out.println(
					"1. New Customer \n 2. Update Customer Info \n 3. Delete Customer \n 4. Display All Current Customers");
			System.out.println("\n Enter number for desired action or press 0 to quit: ");
			 selection = s.nextInt();
			s.nextLine();
		switch(selection) {
		case (1):
			//add new customer
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
			DatabaseConnection.addCustomer(c.getfName(), c.getLname(), c.getAge(), c.getPhoneNumber(), c.getEmail(), c.getUserName());
			System.out.println("Customer successfully added.");
			break;
			
		case(2):
			//update customer information
			System.out.print("Who's information would you like to update? \n Enter customer username: ");
			String user = s.nextLine();
			System.out.println("What would you like to update?");
			System.out.println("1. First Name \n2. Last Name \n3. Age \n4. Email \n5. Phone Number \n6. Username");
			System.out.println("\nEnter number for desired action: ");
			selection = s.nextInt();
			s.nextLine();
			Customer x = new Customer();
			

			switch(selection) {
			case(1):
				System.out.println("Enter new first name: ");
				String first = s.nextLine();
				DatabaseConnection.updateFname(user, first);
				System.out.println("Customer first name changed");
				break;
			case(2):
				System.out.println("Enter new last name: ");
				String last = s.nextLine();
				DatabaseConnection.updateLname(user, last);
				System.out.println("Customer last name changed");
				break;
			case(3):
				System.out.println("Enter new age: ");
				int newAge = s.nextInt();
				DatabaseConnection.updateAge(user, newAge);
				System.out.println("Customer age changed");
				break;
			case(4):
				System.out.println("Enter new email: ");
				String newEmail = s.nextLine();
				DatabaseConnection.updateEmail(user, newEmail);
				System.out.println("Customer email changed");
				break;
			case(5):
				System.out.println("Enter new phone number: ");
				String newPhone = s.nextLine();
				DatabaseConnection.updatePhoneNumber(user, newPhone);
				System.out.println("Customer phone number changed");
				break;
			case(6):
				System.out.println("Enter new username: ");
				String newUser = s.nextLine();
				DatabaseConnection.updateUsername(user, newUser);
				System.out.println("Customer username changed");
				break;
			}
			break;
			
		case(3):
			System.out.print("What customer would you like to delete? \n Enter Customer Username: ");
			 user = s.nextLine();
			 DatabaseConnection.deleteUser(user);
			System.out.println("Customer deleted");
			break;
			
		case(4):
			//display all customers
			DatabaseConnection.showAll();
			break;
			
		default: System.out.println("Not a valid selection: Enter 1,2,3, or 4");
		}
		
		//asks to quit or continue with other actions
		System.out.println("Would you like to do something else?");
		System.out.println("Press any number 1-9 to continue or 0 to quit:");
		selection = s.nextInt();
		s.nextLine();
		
		if (selection == 0) {
			s.close();}
		}

	}

}
