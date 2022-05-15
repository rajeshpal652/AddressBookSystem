package com.bl.addressbook;
import java.util.HashMap;
/*
 * @Author: Rajesh
 * Using Switch case statement to perform the operations as per the user choice.
 * Enabling user to add multiple addressbook.
 */
import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		HashMap<String, AddressBook> addressBooks = new HashMap<String, AddressBook>();
		AddressBook book1 = new AddressBook();
		AddressBook book2 = new AddressBook();
		AddressBook book3 = new AddressBook();
		
		addressBooks.put("AddressBook1", book1);
		addressBooks.put("AddressBook2", book2);
		addressBooks.put("AddressBook3", book3);
		
		System.out.println("================================");
		System.out.println("Welcome to Address Book program");
		
		int i = 1;
		
		while(i != 0) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		
		System.out.println("Enter 1 to for AddressBook1 2 for AddressBook2 and 3 for AddressBook3");
        int choose_AddressBook = sc.nextInt();
        
		System.out.println("Enter 1 to add contact\nEnter 2 to edit details of contacts\nEnter 3 to delete a contact\nEnter 4 to display contact details\nEnter 5 to exit AddressBook");
		int userChoice = sc.nextInt();
		
		switch (userChoice) {
		case 1 :
			if (choose_AddressBook == 1) book1.addContacts();
            else if (choose_AddressBook == 2) book2.addContacts();
            else if (choose_AddressBook == 3) book3.addContacts();
            else System.out.println("Option not found");
            break;
		case 2 :
			 if (choose_AddressBook == 1) {
                 System.out.println("Enter the first name by which u want to edit contact");
                 String name = sc.next();
                 book1.editContacts(name);
                 break;
             } else if (choose_AddressBook == 2) {
                 System.out.println("Enter the first name by which u want to edit contact");
                 String name = sc.next();
                 book2.editContacts(name);
                 break;
             } else if (choose_AddressBook == 3) {
                 System.out.println("Enter the first name by which u want to edit contact");
                 String name = sc.next();
                 book3.editContacts(name);
                 break;
             }
		case 3 :
			if (choose_AddressBook == 1) {
                System.out.println("Enter the first name by which u want to edit contact");
                String search_Name = sc.next();
                book1.deleteContact(search_Name);
                break;
            } else if (choose_AddressBook == 2) {
                System.out.println("Enter the first name by which u want to edit contact");
                String search_Name = sc.next();
                book2.deleteContact(search_Name);
                break;
            }
            if (choose_AddressBook == 3) {
                System.out.println("Enter the first name by which u want to edit contact");
                String search_Name = sc.next();
                book3.deleteContact(search_Name);
                break;
            }
		case 4 :
			 if (choose_AddressBook == 1) {
                 book1.showContacts();
                 break;
             } else if (choose_AddressBook == 2) {
                 book2.showContacts();
                 break;
             } else if (choose_AddressBook == 3) {
                 book3.showContacts();
                 break;
             }
		case 5 :
			System.out.println("Thank You. Please come again.");
			i = 0;
			break;
		default :
			System.out.println("Enter valid input");
		}
		}
	}
}

		
