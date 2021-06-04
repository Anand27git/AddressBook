package com.Bridgelab.AddressBook;

/***********************
 * 
 *  @author ANAND
 *  program:AddressBookUC1 
 *  purpose: create contact
 *  
 *
 ***************************/

public class AddressBook {
	// main method
	public static void main(String[] args) {

		System.out.println("Welcome to the Address Book System");

		AddressBookContacts contact = new AddressBookContacts("Anand", "Kumar", "Bangarpet", "Bangalore", "Karnataka",
				"anandkumar256k@gmail.com", 563114, 808853315);

		System.out.println("Contact is created for : " + contact.firstName + " " + contact.lastName);

	}

}
