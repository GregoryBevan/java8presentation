package fr.elgregos.java8presentation.lambdas.example8.defaultmethods;

import java.util.UUID;

public interface Vehicle {
	
	default String getId() {
		return UUID.randomUUID().toString();
	}

	int getNumberOfWheels();
}
