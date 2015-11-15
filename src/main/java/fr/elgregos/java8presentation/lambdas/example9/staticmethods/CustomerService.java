package fr.elgregos.java8presentation.lambdas.example9.staticmethods;

import java.util.HashMap;
import java.util.Map;

public interface CustomerService {
	
	Map<String, Customer> customers = new HashMap<>();
	
	static Customer getCustomer(String id) {
		return customers.get(id);
	}
	
	static String getCustomerInfo(String id) {
		return customers.get(id).info;
	}
	
	static void addCustomer(Customer cust) {
		customers.put(cust.id, cust);
	}
	
	static int getCustomerCount() {
		return customers.size();
	}
}
