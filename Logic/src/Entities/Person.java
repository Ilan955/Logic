package Entities;

public class Person {
	private String firstName;
	private String LastName;
	private String email;
	private String type;
	private String phoneNumber;
	
	public Person(String firstName,String LastName,String email,String type,String phoneNumber) {
		this.firstName=firstName;
		this.LastName=LastName;
		this.email=email;
		this.type=type;
		this.phoneNumber=phoneNumber;
	}
	public String getPhone() {
		return phoneNumber;
	}
	
	public void setPhone(String phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getType() {
		return type;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
