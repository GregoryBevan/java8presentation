package fr.elgregos.java8presentation.lambdas.example8.defaultmethods;

public interface FourWheelsVehicle extends Vehicle {
	
    @Override
	default int getNumberOfWheels() {
		return 4;
	}

}
