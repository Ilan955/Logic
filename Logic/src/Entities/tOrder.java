package Entities;

public class tOrder {
	private int orderNum;
	private String Id;
	private int numOfVisitors;
	private String type;
	private String status;
	
	public tOrder(int orderNum,String Id,int numOfVisitors,String type,String status) {
		this.orderNum=orderNum;
		this.Id=Id;
		this.numOfVisitors=numOfVisitors;
		this.type=type;
		this.status=status;
	}

}
