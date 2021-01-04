package car_dealership;

public class Employee {
	private String name;
	private double hourlySalary;
	
	public Employee(String n, double salary) {
		this.name = n;
		this.hourlySalary = salary;
	}
	
	public void handleCustomer(Customer customer, boolean finance, Vehicle v) {
		if(finance == true) {
			runCreditHistory(customer, customer.getCreditScore());
		}else if(v.getPrice() <= customer.getCash()) {
			processTransaction(customer, v);
		}else {
			System.out.println("Please return with more money, " + customer.getName());
		}
		
	}
	
	private static void processTransaction(Customer customer, Vehicle v) {
		customer.setCashOnHand(customer.getCash() - v.getPrice());
		System.out.println(customer.getName()+ " has purchased the " + v.getName() + " and has " + customer.getCash() + " dollars left.");
	}

	public static void runCreditHistory(Customer c1, double doubleAmount) {
		if(doubleAmount >= 700) {
			System.out.println(c1.getName() + " has good credit score, continued to purchase on credit card");
		}else {
			System.out.println(c1.getName() +"'s credit score is not good enough.");
		}
	}

}
