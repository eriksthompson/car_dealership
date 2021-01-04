package car_dealership;

public class Customer {
	private String name;
	private String address;
	private double cashOnHand;
	private double creditScore;
	
	public Customer(String name, String address, double cash, double cs) {
		this.name = name;
		this.address = address;
		this.cashOnHand = cash;
		this.creditScore = cs;
	}
	
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}
	
	public double getCash() {
		return this.cashOnHand;
	}
	public void setCashOnHand(double s) {
		this.cashOnHand = s;
	}
	
	public void purchaseCar(Vehicle v, Employee e, boolean finance) {
		e.handleCustomer(this, finance, v);
	}

	public double getCreditScore() {
		return this.creditScore;
	}
}
