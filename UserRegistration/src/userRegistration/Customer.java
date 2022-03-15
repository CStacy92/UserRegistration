package userRegistration;

import java.util.Scanner;

public class Customer {
	private String fName;
	private String lname;
	private String phoneNumber;
	private String email;
	private String userName;
	private int age;
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		try {
		if(fName.length() > 24) {
			throw new IllegalArgumentException("Customer first name should be fewer than 24 characters!");
		}
		if(!fName.matches("[a-zA-Z]+")) {
			throw new IllegalArgumentException("Customer first name can only contain letters!");
		}
		if(fName.isBlank()) {
			throw new IllegalArgumentException("Customer first name cannot be empty!");
		}
		
		this.fName = fName;}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			System.out.println("Enter Customer First Name: ");
			Scanner s = new Scanner(System.in);
			setfName(s.nextLine());
			s.close();
		}
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		try {
		if(lname.length() > 24) {
			throw new IllegalArgumentException("Customer last name should be fewer than 24 characters!");
		}
		if(!lname.matches("[a-zA-Z]+")) {
			throw new IllegalArgumentException("Customer last name can only contain letters!");
		}
		if(lname.isBlank()) {
			throw new IllegalArgumentException("Customer last name cannot be empty!");
		}
		
		this.lname = lname;}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			System.out.println("Enter Customer Last Name: ");
			Scanner s = new Scanner(System.in);
			setLname(s.nextLine());
			s.close();}
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		try {
		if(!phoneNumber.matches("[0-9]+")) {
			throw new IllegalArgumentException("Phone number can only contain numerals!");
		}
		if(phoneNumber.length() > 10) {
			throw new IllegalArgumentException("Phone number can not be more than 10 numerals long");
		}
		if (phoneNumber.isBlank()) {
			throw new IllegalArgumentException("Phone number can not be blank!");
		}
		this.phoneNumber = phoneNumber;}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			System.out.println("Enter Customer Phone Number: ");
			Scanner s = new Scanner(System.in);
			setPhoneNumber(s.nextLine());
			s.close();}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		try {
		if((!email.contains("@")) ||(!email.contains(".com")) || email.isBlank() || email.contains(",") ||email.contains("*") || email.contains("^") || email.contains("'") || email.contains("\"")) {
			throw new IllegalArgumentException("Invalid email address!");
		}
		this.email = email;
	}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			System.out.println("Enter Customer Email: ");
			Scanner s = new Scanner(System.in);
			setEmail(s.nextLine());
			s.close();}}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		try {
		if(userName.length() < 8 || userName.length() > 24 || userName.isBlank()) {
			throw new IllegalArgumentException("Invalid username! Must be between 8 and 24 characters");
		}
		this.userName = userName;}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			System.out.println("Enter Customer Username: ");
			Scanner s = new Scanner(System.in);
			setUserName(s.nextLine());
			s.close();}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		try {
		if(age > 110 || age < 18) {
			throw new IllegalArgumentException("Age must be a number between 18 and 110");
		}
		this.age = age;}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			System.out.println("Enter Customer Age: ");
			Scanner s = new Scanner(System.in);
			setAge(s.nextInt());
			s.close();}
	}


}
