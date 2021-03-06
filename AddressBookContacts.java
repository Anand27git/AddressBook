package com.Bridgelab.AddressBook;

/****************************
 * 
 * @author ANAND 
 * 
 * program:AddressBook
 * 
 *
 ****************************/

public class AddressBookContacts {
	// declaring variables
	public String firstName, lastName, address, city, state, email;
	public long zip;
	public long phoneNo;

	public AddressBookContacts(String firstName, String lastName, String address, String city, String state,
			String email, long zip, long phoneNo) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.email = email;
		this.zip = zip;
		this.phoneNo = phoneNo;
	}

	// using getter and setter methods
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getEmail() {
		return email;
	}

	public long getZip() {
		return zip;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setZip(long zip) {
		this.zip = zip;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	// using to string method
	@Override
	public String toString() {
		return "Contact Details of person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", email=" + email + ", zip=" + zip + ", phoneNo=" + phoneNo
				+ "]";
	}

}
