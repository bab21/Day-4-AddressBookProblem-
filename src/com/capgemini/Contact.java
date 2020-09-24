package com.capgemini;

public class Contact {
	private String first_name;
	private String last_name;
	private String address;
	private String city;
	private String state;
	private int zip;
	private int phone_number;
	private String email;
	
	public static void main(String[] args) {
		System.out.println("check");
	}
	
	public void setFirst_Name(String first_name) {
		this.first_name=first_name;
	}
	public String getFirst_Name() {
		return this.first_name;
	}
	public void setLast_Name(String last_name) {
		this.last_name=last_name;
	}
	public String getLast_Name(){
		return last_name;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public String getCity() {
		return city;
	}
	public void setState(String state) {
		this.state=state;
	}
	public String getState() {
		return this.state;
	}
	public void setZip(int zip) {
		this.zip=zip;
		
	}
	public int getZip() {
		return this.zip;
	}
	public void setPhoneNumber(int phone_number){
		this.phone_number=phone_number;
	}
	public int getPhoneNumber() {
		return this.phone_number;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return this.email;
	}
}
