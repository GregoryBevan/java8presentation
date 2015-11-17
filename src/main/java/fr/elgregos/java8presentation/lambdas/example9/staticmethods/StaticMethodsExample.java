package fr.elgregos.java8presentation.lambdas.example9.staticmethods;

public class StaticMethodsExample {

	public static void main(String... args) {
		Customer customer = new Customer();
		customer.id = "1";
		customer.name = "John Doe";
		customer.info = "Our first customer";
		CustomerService.addCustomer(customer);

		System.out.printf("Nombre de client : %s", CustomerService.getCustomerCount());
	}

}
