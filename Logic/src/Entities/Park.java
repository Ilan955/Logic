package Entities;

public class Park {

	private String parkName;
	private int maxVisitors;
	private int maxAvailableVisitors;
	private int currentVisitors;
	private int maxDurationVisit;
	private int AmountOfUnExpectedTravellers;
	
	public Park(String parkName,int maxVisitors,int maxAvailableVisitors,int currentVisitors,int maxDurationVisit,int AmountOfUnExpected) {
		this.parkName=parkName;
		this.maxVisitors=maxVisitors;
		this.maxAvailableVisitors=maxAvailableVisitors;
		this.currentVisitors=currentVisitors;
		this.maxDurationVisit=maxDurationVisit;
		this.AmountOfUnExpectedTravellers=AmountOfUnExpected;
		
	}

	public String getParkName() {
		return parkName;
	}

	public void setParkName(String parkName) {
		this.parkName = parkName;
	}

	public int getMaxVisitors() {
		return maxVisitors;
	}

	public void setMaxVisitors(int maxVisitors) {
		this.maxVisitors = maxVisitors;
	}

	public int getMaxAvailableVisitors() {
		return maxAvailableVisitors;
	}

	public void setMaxAvailableVisitors(int maxAvailableVisitors) {
		this.maxAvailableVisitors = maxAvailableVisitors;
	}

	public int getCurrentVisitors() {
		return currentVisitors;
	}

	public void setCurrentVisitors(int currentVisitors) {
		this.currentVisitors = currentVisitors;
	}

	public int getMaxDurationVisit() {
		return maxDurationVisit;
	}

	public void setMaxDurationVisit(int maxDurationVisit) {
		this.maxDurationVisit = maxDurationVisit;
	}

	public int getAmountOfUnExpectedTravellers() {
		return AmountOfUnExpectedTravellers;
	}

	public void setAmountOfUnExpectedTravellers(int amountOfUnExpectedTravellers) {
		AmountOfUnExpectedTravellers = amountOfUnExpectedTravellers;
	}
	
	
	
}
