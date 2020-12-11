package Entities;

import java.sql.Date;
import java.sql.Time;

public class Order {
	
	private int orderNum;
	private String timeInPark ; 
	private String dateOfVisit;
	private String wantedPark;
	private float totalPrice;
	private int numberOfVisitors;
	
	public Order(int orderNum,String timeInPark,String dateOfVisit,String wantedPark,int numberOfVisitors,float totalPrice) {
		this.orderNum=orderNum;
		this.timeInPark=timeInPark;
		this.dateOfVisit=dateOfVisit;
		this.wantedPark=wantedPark;
		this.totalPrice=totalPrice;
		this.numberOfVisitors=numberOfVisitors;
	}
	public int getNumberOfVisitors() {
		return numberOfVisitors;
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

	public String getWantedPark() {
		return wantedPark;
	}

	public void setWantedPark(String wantedPark) {
		this.wantedPark = wantedPark;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	

}
