package com.bl.addressbook;

import java.util.Scanner;

/*
 * @Author : Rajesh
 * Adding new contact to addressbook taking user input from console.
 */
public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program!!");
		
		Scanner sc = new Scanner(System.in);
		Address address = new Address();
		System.out.println("Enter first name: ");
		address.setFirstName(sc.next());
		System.out.println("Enter last name: ");
		address.setLastName(sc.next());
		System.out.println("Enter email: ");
		address.setEmail(sc.next());
		System.out.println("Enter phone number: ");
		address.setPhoneNumber(sc.nextLong());
		System.out.println("Enter city: ");
		address.setCity(sc.next());
		System.out.println("Enter state: ");
		address.setState(sc.next());
		System.out.println("Enter zip code : ");
		address.setZip(sc.nextLong());
		
		System.out.println(address.toString());
	}
}
