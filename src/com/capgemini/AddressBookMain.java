package com.capgemini;

import java.util.Scanner;

public class AddressBookMain {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program.");
		Scanner s=new Scanner(System.in);
		
		AddressBook addbookobject=new AddressBook();
		
		String first_name,last_name,address,city,state,email;
		long phone_number;
		int zip;
		
		System.out.println("Enter details for creating and adding contact");
		
		System.out.println("Enter first name");
		first_name=s.next();
		System.out.println("Enter last name");
		last_name=s.next();
		System.out.println("Enter address");
		address=s.next();
		System.out.println("Enter city name");
		city=s.next();
		System.out.println("Enter state name");
		state=s.next();
		System.out.println("Enter email address");
		email=s.next();
		System.out.println("Enter phone number");
		phone_number=s.nextLong();
		System.out.println("Enter zip code");
		zip=s.nextInt();
//		
       	
		Contact contactobject=addbookobject.createContact(first_name, last_name, address, city, state, zip, phone_number, email);
		
		addbookobject.addContact(contactobject);
		System.out.println("Contact Added Successfully");
		
		System.out.println("Do you want to edit details(yes/no)");
		String ans=s.next();
		if(ans.equals("yes")) {
			System.out.println("Enter the first name of person for editing");
			addbookobject.editContact(s.next());
			System.out.println("details editted");
			
		}
		
		System.out.println("Do you want to delete any Contact(yes/no)");
		String ans2=s.next();
		if(ans2.equals("yes")) {
			System.out.println("Enter the first name of person for deleting");
			addbookobject.deleteContact(s.next());
		}
		
		
		
		s.close();	
		
	}
	

}
