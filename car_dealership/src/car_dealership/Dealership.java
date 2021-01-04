package car_dealership;

public class Dealership {
	
	public static void main(String[] args) {
		Customer c1 = new Customer("Tom", "123 anything st.", 12000, 650.4);
		Customer c2 = new Customer("Sandy", "234 seashore road", 90000, 900);
		Customer c3 = new Customer("Tim", "345 nope st.", 6000, 800);
		
		
		Vehicle v1 = new Vehicle(50000, "Camaro");
		Employee e1 = new Employee("Bill" , 15);
		
		
		c1.purchaseCar(v1, e1, false);
		c2.purchaseCar(v1, e1, false);
		c3.purchaseCar(v1, e1, true);
		
		
		// Task:
		//handleCustomer(Customer c1, boolean finance, Vehicle vehicle)
		// if(finance == true)
		// runCreditHistory(Customer cust, double doubleAmount)
		//else if(vehicle.getPrice() <= cust.cashOnHand(
		//processTransaction (Customer cust, Vhehicle vehicle)
		//else 
		// tell customer to bring more  money
	}
}
