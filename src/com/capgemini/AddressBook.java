package com.capgemini;
import java.util.*;


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
	
   
	public  Contact createContact(String first_name,String last_name,String address,String city,String state,int zip,long phone_number,String email){
		Contact contact=new Contact();
		contact.setFirst_Name(first_name);
		contact.setLast_Name(last_name);
		contact.setAddress(address);
		contact.setCity(city);
		contact.setState(state);
		contact.setZip(zip);
		contact.setPhoneNumber(phone_number);
		contact.setEmail(email);
		
		return contact;
	}
	
	public void addContact(Contact contact) {
		this.contact_list.add(contact);
		
	}
	public void editContact(String first_name) {
		Scanner s=new Scanner(System.in);
		
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
			break;
		
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
		s.close();
		
		
		
	}
	public void deleteContact(String first_name) {
		int index=0;
		int i,n;
		
		n=contact_list.size();
		
		for(i=0;i<n;i++) {
			if(contact_list.get(i).getFirst_Name().equals(first_name))
				index=i;
			
		}
		contact_list.remove(index);
		System.out.println("Contact deleted");
	}
}
