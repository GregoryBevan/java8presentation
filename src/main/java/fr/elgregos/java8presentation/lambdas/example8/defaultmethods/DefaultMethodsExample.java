package fr.elgregos.java8presentation.lambdas.example8.defaultmethods;

public class DefaultMethodsExample {

	public static void main(String... args) {
		Car car = new Car();
		System.out.format("Car with id %s has %s wheels \n", car.getId(), car.getNumberOfWheels());
		Moto moto = new Moto();
		System.out.format("Moto with id %s has %s wheels \n", moto.getId(), moto.getNumberOfWheels());
	}
}
