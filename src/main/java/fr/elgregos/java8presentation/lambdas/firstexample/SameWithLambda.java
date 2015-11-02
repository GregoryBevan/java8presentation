package fr.elgregos.java8presentation.lambdas.firstexample;

public class SameWithLambda {

	public static void main(String... args) {
		Runnable task = () -> System.out.println("Run a new thread");
		task.run();
	}
}
