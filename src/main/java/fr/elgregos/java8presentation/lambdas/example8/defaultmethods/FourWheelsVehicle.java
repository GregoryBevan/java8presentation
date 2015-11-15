package fr.elgregos.java8presentation.lambdas.example8.defaultmethods;

public interface FourWheelsVehicle {
	
	default int getNumberOfWheels() {
		return 4;
	}

}
