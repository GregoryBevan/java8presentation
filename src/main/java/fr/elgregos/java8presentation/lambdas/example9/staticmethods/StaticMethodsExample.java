package fr.elgregos.java8presentation.lambdas.example9.staticmethods;

public class StaticMethodsExample {

	public static void main(String... args) {
		Customer customer1 = new Customer();
		customer1.id = "1";
		customer1.name = "John Doe";
		customer1.info = "Our first customer";
		CustomerService.addCustomer(customer1);
		
		System.out.format("Nombre de client : %s",CustomerService.getCustomerCount());
	}

}
