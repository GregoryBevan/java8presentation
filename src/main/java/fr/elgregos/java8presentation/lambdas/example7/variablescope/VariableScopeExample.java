package fr.elgregos.java8presentation.lambdas.example7.variablescope;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VariableScopeExample {

	public static void main(String... args) {
		int counter = 0;
		int[] counterArray = new int[1];
		List<String> list = new ArrayList<>();
		
		Runnable runnable = () -> {
			System.out.printf("Counter : %s \n", counter); // counter is in the scope of the closure			
//			counter++;  // counter is immutable
			counterArray[0]++;
			list.add(String.valueOf(counterArray[0]));
			System.out.printf("Counter array : %s \n", counterArray[0]); // counter is in the scope of the closure	
		};
		
		
		ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
		newSingleThreadExecutor.execute(runnable);
		newSingleThreadExecutor.execute(runnable);
		newSingleThreadExecutor.shutdown();
	}
}
