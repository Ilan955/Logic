package Entities;

public class Traveller extends Person{
	private String Id;
	private String type="traveller";
	
	public Traveller(String Id,String firstName,String LastName,String email,String type,String phoneNumber) {
		super(firstName,LastName,email,type,phoneNumber);
		this.Id=Id;
		
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}
	public String getType() {
		return type;
	}
}
