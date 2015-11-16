package fr.elgregos.java8presentation.lambdas.example8.defaultmethods;

public class Car implements Vehicle, FourWheelsVehicle {

	@Override
	public int getNumberOfWheels() {
		return FourWheelsVehicle.super.getNumberOfWheels();
	}

}
