package com.bl.addressbook;
/*
 * @Author: Rajesh
 * Using Switch case statement to perform the operations as per the user choice.
 */
import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("================================");
		System.out.println("Welcome to Address Book program");
		
		
		int i = 1;
		while(i != 0) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		System.out.println("Enter 1 to add contact\nEnter 2 to edit details of contacts\nEnter 3 for showing details of contacts\nEnter 4 to exit AddressBook");
		int userChoice = sc.nextInt();
		
		switch (userChoice) {
		case 1 :
			AddressBook.addContacts();
			break;
		case 2 :
			System.out.println("Enter the first name of the contact you want to edit");
			String name = sc.next();
			AddressBook.editContacts(name);
			break;
		case 3 :
			AddressBook.showContacts();
			break;
		case 4 :
			System.out.println("Thank You. Please come again.");
			i = 0;
			break;
		default :
			System.out.println("Enter valid input");
		}
		}
	}
}

		
