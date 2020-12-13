package Entities;

public class PaymentAfterDiscount {

	private float priceBeforeDiscount;
	private int precentDiscount;
	private int parkManagerDiscount;

	public PaymentAfterDiscount(float priceBeforeDiscount, int precentDiscount, int parkManagerDiscount) {
		this.priceBeforeDiscount = priceBeforeDiscount;
		this.precentDiscount = precentDiscount;
		this.parkManagerDiscount = parkManagerDiscount;
	}

	public void set_parkManagerDiscount(int parkManagerDiscount) {
		this.parkManagerDiscount = parkManagerDiscount;
	}

	public void set_precentDiscount(int precentDiscount) {
		this.precentDiscount = precentDiscount;
	}

	public void set_priceBeforeDiscount(float priceBeforeDiscount) {
		this.priceBeforeDiscount = priceBeforeDiscount;
	}

	public float get_priceBeforeDiscount() {
		return this.priceBeforeDiscount;
	}

	public int get_precentDiscount() {
		return this.precentDiscount;
	}

	public int parkManagerDiscount() {
		return this.parkManagerDiscount;
	}

}// class
