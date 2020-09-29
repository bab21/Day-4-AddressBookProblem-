package com.capgemini;

import java.util.*;

public class AddressBookMain {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Address Book Program.");
		Scanner s=new Scanner(System.in);
		
		
		do {
			System.out.println("1. Add a person details in particular address book");
			System.out.println("2. Edit a person details in particular address book");
			System.out.println("3. Delete a person details in particular address book");
			System.out.println("4. Show all contacts in particular address book");
			System.out.println("5. Create a new  address book");
			System.out.println("6. Exit");
			
			System.out.println("Enter your choice");
			int choice=s.nextInt();
			if(choice==6)
				break;
			
			switch(choice) {
			case 1:show_all_address_books_name();
				   System.out.println("Enter the name of particular address book to add person details");
				   String addressBook_name1=s.next();
				   AddressBook addressbook1=AddressBook.hm.get(addressBook_name1);
				   Contact contact=addressbook1.createContact();
				   addressbook1.addContact(contact);
				   break;
			case 2:show_all_address_books_name();
			       System.out.println("Enter the name of particular address book to edit person details");
			       String addressBook_name2=s.next();
			       AddressBook addressbook2=AddressBook.hm.get(addressBook_name2);
			       addressbook2.editContact();
			       System.out.println("Editing done");
			       break;
			case 3:show_all_address_books_name();
			   	   System.out.println("Enter the name of particular address book to add person details");
			       String addressBook_name3=s.next();
			       AddressBook addressbook3=AddressBook.hm.get(addressBook_name3);
			       addressbook3.deleteContact();
			       System.out.println("deletion done");
			       break;
			case 4:show_all_address_books_name();
		   	       System.out.println("Enter the name of particular address book to add person details");
		           String addressBook_name4=s.next();
		           AddressBook addressbook4=AddressBook.hm.get(addressBook_name4);
		           addressbook4.showContacts();
		           break;
			case 5:System.out.println("Enter name of address book to be created");
				   String name=s.next();
				   AddressBook addressbook=new AddressBook(name);
				   AddressBook.hm.put(name,addressbook);
				   System.out.println("Address Book created successfully");
				   break;
		    default:System.out.println("Do nothing");	
		    	    break;
			}
			
			
		}
	    while(true);
		
		
	}
	
	public static void show_all_address_books_name() {
		
		for (Map.Entry<String,AddressBook> entry : AddressBook.hm.entrySet())  
            System.out.println(entry.getKey()); 
	}

}
