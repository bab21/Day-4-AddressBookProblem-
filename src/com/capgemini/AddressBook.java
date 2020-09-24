package com.capgemini;

public class AddressBook {

	public  Contact createContact(String first_name,String last_name,String address,String city,String state,int zip,int phone_number,String email){
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
	
}
