package Entities;

import java.sql.Date;
import java.sql.Time;

public class Order {
	
	private int orderNum;
	private String timeInPark ; 
	private String dateOfVisit;
	private Park wantedPark;
	private float totalPrice;
	
	public Order(int orderNum,String timeInPark,String dateOfVisit,Park wantedPark,float totalPrice) {
		this.orderNum=orderNum;
		this.timeInPark=timeInPark;
		this.dateOfVisit=dateOfVisit;
		this.wantedPark=wantedPark;
		this.totalPrice=totalPrice;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public String getTimeInPark() {
		return timeInPark;
	}

	public void setTimeInPark(String timeInPark) {
		this.timeInPark = timeInPark;
	}

	public String getDateOfVisit() {
		return dateOfVisit;
	}

	public void setDateOfVisit(String dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}

	public Park getWantedPark() {
		return wantedPark;
	}

	public void setWantedPark(Park wantedPark) {
		this.wantedPark = wantedPark;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	

}
