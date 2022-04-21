package com.bl.addressbook;
/*
 * @Author: Rajesh
 * Creating different methods to add, edit and show the contact details.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	
	static ArrayList<Contacts> contact_Details = new ArrayList<>();
	
	//creating an addContacts() method to store the contact details.
    public static void addContacts() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of contacts you want to save");
        int numberOfContacts = sc.nextInt();
        
        for (int i = 0; i < numberOfContacts; i++) {
            System.out.println("Enter the details of contact number " + (i + 1));
            System.out.println("Enter first name");
            String firstName = sc.next();
            System.out.println("Last name");
            String lastName = sc.next();
            System.out.println("Enter city ");
            String city = sc.next();
            System.out.println("Enter state ");
            String state = sc.next();
            System.out.println("Enter EmailId ");
            String email = sc.next();
            System.out.println("Enter zip ");
            long zip = sc.nextLong();
            System.out.println("Enter phone number ");
            long phoneNumber = sc.nextLong();
            System.out.println("Contact number " + (i + 1) + " saved");
            System.out.println("==================================");
            Contacts details = new Contacts(firstName, lastName, email, city, state, phoneNumber, zip);
            contact_Details.add(details);
        }
    }
    
  //creating a showContacts() method to show the contact details.
    public static void showContacts() {
        int i = 1;
        for (Contacts contact : contact_Details) {
            System.out.println("Details  of contact number " + i + " is");
            System.out.println(contact.toString());
            i++;
        }
    }
    
  //creating a editContacts() method to edit the contact details by entering the first name.
    public static void editContacts(String name) {
        Scanner sc = new Scanner(System.in);
        for (Contacts contact : contact_Details) {
            if (name.equalsIgnoreCase(contact.getFirstName())) {
                System.out.println("Entered Name found in the contacts");
                System.out.println("Enter the updated First Name");
                String firstName=sc.next();
                contact.setFirstName(firstName);
                System.out.println("Enter the updated Last Name");
                String lastName=sc.next();
                contact.setLastName(lastName);
                System.out.println("Enter the updated City");
                String city=sc.next();
                contact.setCity(city);
                System.out.println("Enter the updated State");
                String state = sc.next();
                contact.setState(state);
                System.out.println("Enter the updated Email ID");
                String email = sc.next();
                contact.setEmail(email);
                System.out.println("Enter the updated Zip Code");
                long zipcode = sc.nextLong();
                contact.setZip(zipcode);
                System.out.println("Enter the updated Phone Number");
                int phoneNumber = sc.nextInt();
                contact.setPhoneNumber(phoneNumber);
            } else
                System.out.println("Entered name not found in the AddressBook");
        }
    }
}
