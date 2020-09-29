package com.capgemini;
import java.util.*;
import java.util.stream.Collectors;


public class AddressBook {
	
	public static Map<String,AddressBook> hm= new HashMap<String, AddressBook>(); 
	
	ArrayList<Contact> contact_list;
	String addressBookName;
	
	
	public AddressBook() {
		contact_list=new ArrayList<Contact>();
	}
	public AddressBook(String addressBookName) {
		contact_list=new ArrayList<Contact>();
		this.addressBookName=addressBookName;
		
	}
	
   
	public  Contact createContact(){
        System.out.println("Enter details for creating and adding contact");
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter first name");
		String first_name=s.next();
		System.out.println("Enter last name");
		String last_name=s.next();
		System.out.println("Enter address");
		String address=s.next();
		System.out.println("Enter city name");
		String city=s.next();
		System.out.println("Enter state name");
		String state=s.next();
		System.out.println("Enter email address");
		String email=s.next();
		System.out.println("Enter phone number");
		long phone_number=s.nextLong();
		System.out.println("Enter zip code");
		int zip=s.nextInt();
		
		Contact contact=new Contact(first_name,last_name,address,city,state,zip,phone_number,email);
		
		
		return contact;
	}
	
	public void addContact(Contact contact) {
		List<Contact> result = contact_list.stream().filter(c->c.equals(contact)).collect(Collectors.toList()); 
		if(result.size()>0)
		{
			System.out.println("This contact already exits in this particular address book");
		}
		else
			this.contact_list.add(contact);
		
		
		if(AddressBookMain.citytocontact.containsKey(contact.getCity())) {
			AddressBookMain.citytocontact.get(contact.getCity()).add(contact);
		}
		else {
			AddressBookMain.citytocontact.put(contact.getCity(), new ArrayList<Contact>());
			AddressBookMain.citytocontact.get(contact.getCity()).add(contact);
		}
		
		if(AddressBookMain.statetocontact.containsKey(contact.getState()))
			AddressBookMain.statetocontact.get(contact.getState()).add(contact);
		else {
			AddressBookMain.statetocontact.put(contact.getState(), new ArrayList<Contact>());
			AddressBookMain.statetocontact.get(contact.getState()).add(contact);	
		}
		
	}
	public void editContact() {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first name of contact to be edited");
		String first_name=s.next();
		
		int index=0;
		int i,n;
		
		n=contact_list.size();
		
		for(i=0;i<n;i++) {
			if(contact_list.get(i).getFirst_Name().equals(first_name))
				index=i;
			
		}
		while(true) {
		System.out.println("Choose Any One");
		System.out.println("1.Edit Last name");
		System.out.println("2.Edit Address");
		System.out.println("3.Edit City");
		System.out.println("4.Edit State");
		System.out.println("5.Edit Zip");
		System.out.println("6.Edit Phone Number");
		System.out.println("7.Edit Email");
		System.out.println("8.Exit");
		int choice=s.nextInt();
		
		if(choice==8)
			return;
		
		switch(choice) {
		case 1:System.out.println("Enter last name for editing");
			   contact_list.get(index).setLast_Name(s.next());
			   break;
		case 2:System.out.println("Enter Address for editing");
		   	   contact_list.get(index).setAddress(s.next());
		   	   break;
		case 3:System.out.println("Enter city for editing");
			   contact_list.get(index).setCity(s.next());
			   break;
		case 4:System.out.println("Enter state for editing");
			   contact_list.get(index).setState(s.next());
			   break;
		case 5:System.out.println("Enter Zip for editing");
			   contact_list.get(index).setZip(s.nextInt());
			   break;
		case 6:System.out.println("Enter Phone Number for editing");
			   contact_list.get(index).setPhoneNumber(s.nextLong());
			   break;
		case 7:System.out.println("Enter email for editing");
			   contact_list.get(index).setEmail(s.next());
			   break;
		   	   
		}
		}	
	}
	public void deleteContact() {
		int index=0;
		int i,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name of contact to be deleted");
		String first_name=s.next();
		n=contact_list.size();
		
		for(i=0;i<n;i++) {
			if(contact_list.get(i).getFirst_Name().equals(first_name))
				index=i;
			
		}
		contact_list.remove(index);
		return ;
	}
	public void showContacts() {
		
		for(int i=0;i<contact_list.size();i++) {
			Contact c=contact_list.get(i);
			System.out.println("First Name "+c.getFirst_Name()+" Last Name "+c.getLast_Name()+" Address:"+c.getAddress()+" City :"+c.getCity()+" State: "+c.getState()+" Phone :"+c.getPhoneNumber()+" Email:"+c.getEmail()+" Zip: "+c.getZip());
		}
		
	}
}
