package com.bl.addressbook;
/*
 * @Author: Rajesh
 * Creating the Contacts class to store all the variables.
 */
public class Contacts {
	private String firstName, lastName, email, city, state;
	private long phoneNumber, zip;
	//creating getter and setter methods for each variable
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", city=" + city
				+ ", state=" + state + ", phoneNumber=" + phoneNumber + ", zip=" + zip + "]";
	}
	//creating a constructor to initialize the values.
	public Contacts(String firstName, String lastName, String email, String city, String state, long phoneNumber,
			long zip) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.city = city;
		this.state = state;
		this.phoneNumber = phoneNumber;
		this.zip = zip;
	}
	
}
