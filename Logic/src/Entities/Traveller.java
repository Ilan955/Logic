package Entities;

public class Traveller extends Person{
	private String Id;
	private String memberID;
	private String type="traveller";
	
	public Traveller(String Id,String firstName,String LastName,String email,String memberID,String type,String phoneNumber) {
		super(firstName,LastName,email,type,phoneNumber);
		this.Id=Id;
		this.setMemberID(memberID);
		this.type = type;
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

	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}
}
