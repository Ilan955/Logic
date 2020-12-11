package Entities;

public class Person {
	private String firstName;
	private String LastName;
	private String email;
	private String type;
	
	
	public Person(String firstName,String LastName,String email,String type) {
		this.firstName=firstName;
		this.LastName=LastName;
		this.email=email;
		this.type=type;
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
