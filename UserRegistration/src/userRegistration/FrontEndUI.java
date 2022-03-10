package userRegistration;

import java.util.Scanner;

public class FrontEndUI {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("What would you like to do?");
		System.out.println(
				"1. Create New Customer \n 2. Update Customer Info \n 3. Delete Customer \n 4. Display All Current Customers");
		int selection = s.nextInt();
		
		switch(selection) {
		case (1):
			Customer c = new Customer();
			System.out.println("Enter Customer First Name:");
			c.setfName(s.nextLine());
			break;
		}
		
		
		


	}

}
