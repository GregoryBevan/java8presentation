package fr.elgregos.java8presentation.lambdas.example8.defaultmethods;

public class DefaultMethodsExample {

	public static void main(String... args) {
		Car car = new Car();
		System.out.println("Car unique id : " + car.getId());
		Moto moto = new Moto();
		System.out.println("Moto unique id : " + moto.getId());
	}
}
