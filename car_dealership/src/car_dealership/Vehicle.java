package car_dealership;

public class Vehicle {
	private double price;
	private String name;
	
	public Vehicle(double price, String name) {
		this.price = price;
		this.name = name;
	}

	public double getPrice() {
		return this.price;
	}
	
	public String getName() {
		return this.name;
	}

}