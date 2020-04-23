package com.claimthree;

import java.util.Scanner;

import com.claimthree.PhoneBookDirectory;

	public class PhoneBookDirectory {
	
		CustomerInfo[] phoneBook = new CustomerInfo[0];
		
		   //A method to add a person to the phone book
			public void addPerson (CustomerInfo customer) {
				CustomerInfo[] temp = new CustomerInfo[phoneBook.length + 1];
				
				// loop through phone book, grabs everything in it and puts it in location a temporary location
				// creating a empty space and copying the array over
				for (int i=0; i < this.phoneBook.length; i++) {
					temp[i] = phoneBook[i];
				}
					temp [temp.length - 1] = customer;
					phoneBook = temp;					
				}
			public CustomerInfo[] getPhoneBook() {
				return phoneBook;
			}
			public void setPhoneBook(CustomerInfo[] phoneBook) {
				this.phoneBook = phoneBook;
			}
			
			
			//choose between Menu options below
			public void menuOptions() {
				int choice = 0;
				Scanner scanner = new Scanner(System.in);
				Scanner nextLineScanner = new Scanner(System.in);
				while(choice != 12) {
				//displays all of the menu options
				System.out.println("Select 1.  to Add a new customer record ");
				System.out.println("Select 2.  to Delete a customer record");
				System.out.println("Select 3.  to Search by First Name");
				System.out.println("Select 4.  to Search by Middle Name");
				System.out.println("Select 5.  to Search by Last Name");
				System.out.println("Select 6.  to Search by Full Name");
				System.out.println("Select 7.  to Search by Address");
				System.out.println("Select 8.  to Search by City");
				System.out.println("Select 9.  to Search by State");
				System.out.println("Select 10.  to Search by Zip");
				System.out.println("Select 11.  to Search by Telephone");
	
			
//			int option = scanner.nextInt();
//			switch (option) {
			
			//create variables for while loop
			
			int updateChoice = 0;
			
			
						
			//calls the initial menu
			//choice = getMenu();
			//switch (choice) {
				int option = scanner.nextInt();
				switch (option) {
			
			//Add a customer record
			case 1:			
				/*Test cases:
					John Doe, 114 Market St, St Louis, MO, 63403, 6366435698
					John E Doe, 324 Main St, St Charles, MO,63303, 8475390126
					John Michael West Doe, 574 Pole ave, St. Peters, MO, 63333, 5628592375 */
			System.out.println("Please enter info for the new customer to be added seperated by commas: ");
				//return (UserEntry);
			System.out.println("Format Name, Address, City, State, Zip, Telephone");
			String info = nextLineScanner.nextLine();
			
			//Separate info into an Array of Strings
			String [] tempInfo = info.split(",");
			
			//Sets variables for the different parts of the string
			String name = tempInfo[0].trim();
			String street = tempInfo[1].trim();
			String city = tempInfo[2].trim();
			String state = tempInfo[3].trim();
			String zip = tempInfo[4].trim();
			String telephone = tempInfo[5].trim();
			
			String[] tempName = name.split(" ");
			String firstName = tempName[0];
			String lastName = tempName[tempName.length - 1];
			String middleName = "";
			
			for(int i = 1; i < tempName.length - 1; i++) {
				middleName += tempName[i];
				if(i != tempName.length - 2) {
					middleName += " ";
				}
			}
			CustomerInfo customer = new CustomerInfo(firstName, middleName, lastName, name, street, city, state, zip, telephone);
			addPerson(customer);
			System.out.println(phoneBook[phoneBook.length-1].getFullName());
			break;
			//Delete a customer record
			case 2:
//			 public void deleteContact(String UserEntry); {
//				 System.out.println("Delete customer record " + CustomerInfo");"
//				 String[] array1 = UserEntry;
//			 }
			
			//case 3 search by firstName
			case 3:
			System.out.println("Enter the first name of the person you want to find: ");
			String myFirstName = scanner.nextLine();
			CustomerInfo[] resultSearchByList = searchByFirstName(myFirstName);	
			break;
			//Case 4 search by lastName
			case 4:
			System.out.println("Enter the last name of the person you want to find: ");
			String myLastName = scanner.nextLine();
			CustomerInfo[] resultSearchByList2 = searchByLastName(myLastName);			
			break;
			//case 5 search by middleName
			case 5:
			System.out.println("Enter the middle name of the person you want to find: ");
			String myMiddleName = scanner.nextLine();
			CustomerInfo[] resultSearchByList3 = searchByMiddleName(myMiddleName);			
			break;
			//case 6 search by full name
			case 6:
			System.out.println("Enter the full name of the person you want to find: ");
			String fullName = scanner.nextLine();
			CustomerInfo[] resultSearchByList4 = searchByFullName(fullName);			
			break;
			//case 7 search by city
			case 7:
			System.out.println("Enter the city name of the person you want to find: ");
			String mycity = scanner.nextLine();
			CustomerInfo[] resultSearchByList5 = searchByCity(mycity);		
			break;
			//case 8 search by state
			case 8:
			System.out.println("Enter the state name of the person you want to find: ");
			String mystate = scanner.nextLine();
			CustomerInfo[] resultSearchByList6 = searchByState(mystate);			
			break;
			//case 9 search by zip
			case 9:
			System.out.println("Enter the zip code of the person you want to find: ");
			String zipCode = scanner.nextLine();
			CustomerInfo[] resultSearchByList7 = searchByZip(zipCode);		
			break;
			//case 10 search by phone number
			case 10:
			System.out.println("Enter the phone number of the person you want to find: ");
			String myTelephone = scanner.nextLine();
			CustomerInfo[] resultSearchByList8 = searchByTelephone(myTelephone);			
			break;
			//case 11 search by address
			case 11:
			System.out.println("Enter the address of the person you want to find: ");
			String address = scanner.nextLine();
			CustomerInfo [] resultSearchByList9 = searchByAddress(address);		
			break;
			
			
			//case 12 
			
			
			// default instruction
			default:
				System.out.println("Please enter a valid selection from the menu below: ");
				break;

			}
		}
			}		
				
			//search by firstName
				public CustomerInfo[] searchByFirstName (String firstName) {
					System.out.println(firstName);
					int length = 0;
					
					for (CustomerInfo customer : phoneBook) {
						if(firstName.equals(customer.getLastName())) {
							length +=1;
						}
					}
					System.out.println("length: " + length); 
						
						CustomerInfo[] result = new CustomerInfo[length];
						int j = 0;
						
					
					for (CustomerInfo customer : phoneBook) {
						if(firstName.equals(customer.getFirstName())) {
							result[j] = customer;
							j++;
							System.out.println("this person last name" + customer);
					}
			}
					return result;
	} // end search by firstName
				
				
				//search by middleName
				public CustomerInfo[] searchByMiddleName (String middleName) {
					System.out.println(middleName);
					int length = 0;
					
					for (CustomerInfo customer : phoneBook) {
						if(middleName.equals(customer.getLastName())) {
							length +=1;
						}
					}
					System.out.println("length: " + length); 
						
						CustomerInfo[] result = new CustomerInfo[length];
						int j = 0;
						
					
					for (CustomerInfo customer : phoneBook) {
						if(middleName.equals(customer.getLastName())) {
							result[j] = customer;
							System.out.println("this person middle name" + customer);
					}
			}
					return result;
	} // end search by middleName
				
				
				
			//search by lastName
				public CustomerInfo[] searchByLastName (String lastName) {
					System.out.println(lastName);
					int length = 0;
					
					for (CustomerInfo customer : phoneBook) {
						if(lastName.equals(customer.getLastName())) {
							length +=1;
						}
					}
					System.out.println("length: " + length); 
						
						CustomerInfo[] result = new CustomerInfo[length];
						int j = 0;
						
					
					for (CustomerInfo customer : phoneBook) {
						if(lastName.equals(customer.getLastName())) {
							result[j] = customer;
							System.out.println("this person last name" + customer);
					}
			}
					return result;
	} // end search by lastName
			
				//search by fullName				
				public CustomerInfo[] searchByFullName (String fullName) {
					System.out.println(fullName);
					int length = 0;
					
					for (CustomerInfo customer : phoneBook) {
						if(fullName.equals(customer.getFullName())) {
							length +=1;
						}
					}
					System.out.println("length: " + length); 
						
						CustomerInfo[] result = new CustomerInfo[length];
						int j = 0;
						
					
					for (CustomerInfo customer : phoneBook) {
						if(fullName.equals(customer.getFullName())) {
							result[j] = customer;
							System.out.println("this person Full Name" + customer);
					}
			}
					return result;
					
	} // end search by fullName
				
				//search customer by Address
				public CustomerInfo[] searchByAddress (String address) {
					System.out.println(address);
					int length = 0;
					
					for (CustomerInfo customer : phoneBook) {
						if(address.equals(customer.getAddress().getCity())) {
							length +=1;
						}
					}
					System.out.println("length: " + length); 
						
						CustomerInfo[] result = new CustomerInfo[length];
						int j = 0;
						
					
					for (CustomerInfo customer : phoneBook) {
						if(address.equals(customer.getAddress().getCity())) {
							result[j] = customer;
							System.out.println("this person address " + customer);
					}
			}
					return result;
	} // end search by address
				
		
				//search customer by city
				public CustomerInfo[] searchByCity (String city) {
					System.out.println(city);
					int length = 0;
					
					for (CustomerInfo customer : phoneBook) {
						if(city.equals(customer.getAddress().getCity())) {
							length +=1;
						}
					}
					System.out.println("length: " + length); 
						
						CustomerInfo[] result = new CustomerInfo[length];
						int j = 0;
						
					
					for (CustomerInfo customer : phoneBook) {
						if(city.equals(customer.getAddress().getCity())) {
							result[j] = customer;
							System.out.println("this person city" + customer);
					}
			}
					return result;
	} // end search by city &
				
				
				//search by state
				public CustomerInfo[] searchByState (String state) {
					System.out.println(state);
					int length = 0;
					
					for (CustomerInfo customer : phoneBook) {
						if(state.equals(customer.getAddress().getState())) {
							length +=1;
						}
					}
					System.out.println("length: " + length); 
						
						CustomerInfo[] result = new CustomerInfo[length];
						int j = 0;
						
					
					for (CustomerInfo customer : phoneBook) {
						if(state.equals(customer.getAddress().getState())) {
							result[j] = customer;
							System.out.println("this person state" + customer);
					}
			}
					return result;
	} // end search by state	
				
				//search by zip
				public CustomerInfo[] searchByZip (String zip) {
					System.out.println(zip);
					int length = 0;
					
					for (CustomerInfo customer : phoneBook) {
						if(zip.equals(customer.getAddress().getZip())) {
							length +=1;
						}
					}
					System.out.println("length: " + length); 
						
						CustomerInfo[] result = new CustomerInfo[length];
						int j = 0;
						
					
					for (CustomerInfo customer : phoneBook) {
						if(zip.equals(customer.getZip())) {
							result[j] = customer;
							System.out.println("this person zip" + customer);
					}
						return result;
			}
					return result;
	}
 //end of search by zip
	
	
				//search by telephone
				public CustomerInfo[] searchByTelephone (String telephone) {
					System.out.println(telephone);
					int length = 0;
					
					for (CustomerInfo customer : phoneBook) {
						if(telephone.equals(customer.getTelephone())) {
							length +=1;
						}
					}
					System.out.println("length: " + length); 
						
						CustomerInfo[] result = new CustomerInfo[length];
						int j = 0;
						
					
					for (CustomerInfo customer : phoneBook) {
						if(telephone.equals(customer.getTelephone())) {
							result[j] = customer;
							System.out.println("this person zip" + customer);
					}
			}
					return result;
			}
			 //end of search by telephone
				
				
	
				//print an array method
				public void printAnArray(CustomerInfo[] customer) {
					
					for (CustomerInfo object : customer) {
						System.out.println(customer(object));
					}	
				}
				public String customer(CustomerInfo object) {
					String output = object.getFirstName() + " " + object.getLastName() + " " + getMiddleName() + " " + getLastName() + " " +
							getFullName() + "" + getAddress() + " " + getCity() + " " + getState() + "" + getZip() + " " + getTelephone();
					return output;
					//add all the other customer info objects
							
				}
				private String getTelephone() {
					// TODO Auto-generated method stub
					return getTelephone();
				}
				private String getZip() {
					// TODO Auto-generated method stub
					return getZip();
				}
				private String getState() {
					// TODO Auto-generated method stub
					return getState();
				}
				private String getCity() {
					// TODO Auto-generated method stub
					return getCity();
				}
				private String getAddress() {
					// TODO Auto-generated method stub
					return getAddress();
				}
				private String getFullName() {
					// TODO Auto-generated method stub
					return getFullName();
				}
				private String getLastName() {
					// TODO Auto-generated method stub
					return getLastName();
				}
				private String getMiddleName() {
					// TODO Auto-generated method stub
					return getMiddleName();
				}
				
	}		
					
					
					
					
					
					
					