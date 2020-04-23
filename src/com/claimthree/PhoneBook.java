package com.claimthree;

import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		
		//In the application class inside main create a new customer object.
		//This just creates the customers, does nothing
		//System.out.println("test");
		CustomerInfo customer1 = new CustomerInfo("John","", "Doe","John Doe", "114 Market St", "St Louis", "MO", "63403", "6366435698");
		CustomerInfo customer2 = new CustomerInfo("John", "E", "Doe", "John E Doe", "324 Main St", "St Charles", "MO", "63303", "8475390126");
		
		//A method that creates the phone book and adds the customer to it
		PhoneBookDirectory mainBook = new PhoneBookDirectory();
			//mainBook.menuOptions();
			mainBook.addPerson(customer1);
			mainBook.addPerson(customer2);
		
			//Prints out the customer first name from the phone book
			System.out.println(mainBook.getPhoneBook()[0].getFirstName() );
		
		//9. Print customerInfo1 name :
		System.out.println(customer1.getFirstName() + " "+ customer1.getLastName());
		
		//10. Call the set method for customer1 and add firstName and lastName;
		customer1.setFirstName("");
		customer2.setLastName("");
		
		//11. Print customer1 and customer2 names;
		System.out.println(customer1.getFirstName() + "" + customer2.getLastName());
		mainBook.menuOptions();
	}

}		
//End of main method

