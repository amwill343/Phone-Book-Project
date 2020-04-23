package com.claimthree;

public class CustomerInfo {


	//4. Add instance variables
	private String firstName;
	private String middleName;
	private String lastName;
	private String fullName;
	
	//12. Add more data field to the customer class eg: telephone, address
	private String telephone;
	private Address address;
	
	//6. Add a parameterized constructor 
	public CustomerInfo (String firstName, String middleName, String lastName, String fullName, String street, String city, String state, String zip, String telephone) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.fullName = fullName;
		this.address = new Address(street, city, state, zip);
		this.telephone = telephone;
		
} 

	//5. Add a default constructor
		public CustomerInfo() {}

		//7. Add getters / setters : 
		public String getFirstName(){
			return this.firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getMiddleName1() {
			return this.middleName;
		}
		public void setMiddleName1(String middleName) {
			this.middleName = middleName;
		}
		public String getLastName(){
			return this.lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getFullName() {
			return fullName;
		}
		public void setFullName(String fullName) {
			this.fullName = fullName;
		}
		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}
		public String getTelephone() {
			return this.telephone;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		public Address getAddress() {
			return this.address;
		}
			
			public void setfullName(String customerInfoFirstName, String customerInfoMiddleName,String customerInfoLastName) {
				if (customerInfoMiddleName != null && customerInfoMiddleName != "") {
					this.fullName = customerInfoFirstName + "" + customerInfoMiddleName + "" + customerInfoLastName;
				}else {
					this.fullName = customerInfoFirstName + "" + customerInfoLastName;
				}
	
		}

			public Object getZip() {
				// TODO Auto-generated method stub
				return this.getZip();
			}			
}


//end class

		