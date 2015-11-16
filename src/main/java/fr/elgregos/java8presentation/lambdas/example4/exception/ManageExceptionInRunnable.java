package fr.elgregos.java8presentation.lambdas.example4.exception;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ManageExceptionInRunnable {

	public static void main(String... args) throws InterruptedException {
		Runnable waiter = () -> {
			System.out.println("Wait 5s");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.err.format("An error occurred : %s", e.getMessage());
			}
		};

		ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
		Future<Class<Void>> future = singleThreadExecutor.submit(waiter, Void.TYPE);
		interruptWaiter(future);
		singleThreadExecutor.shutdown();
	}

	private static void interruptWaiter(Future<Class<Void>> future) throws InterruptedException {
		Thread.sleep(1000);
		future.cancel(true);
	}

}
