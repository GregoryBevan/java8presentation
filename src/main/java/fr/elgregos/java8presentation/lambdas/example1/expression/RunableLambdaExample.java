package fr.elgregos.java8presentation.lambdas.example1.expression;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunableLambdaExample {

	public static void main(String... args) {
		
		Runnable task = () -> System.out.println("Run a new thread");
		
		
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.execute(task);
		executor.shutdown();
	}
}
