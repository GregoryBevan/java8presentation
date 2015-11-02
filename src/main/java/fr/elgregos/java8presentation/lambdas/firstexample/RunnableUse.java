package fr.elgregos.java8presentation.lambdas.firstexample;

public class RunnableUse {
	
	public static void main(String... args) {
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
					System.out.println("Run a new thread");
				
					
			}
		};
		runnable.run();
	}

}
 